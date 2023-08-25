package com.data.structures.algorithms.linked.list;

public class LinkedListCustom<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedListCustom(){
        this.size = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T newValue) {
        Node<T> newNode = new Node<>(newValue);
        if(this.first == null && this.last == null){
            this.first = newNode;
            this.last = newNode;
        }else{
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size ++;
    }

    public void remove(T value){
        Node<T> previous = null;
        Node<T> current = this.first;

        for (int i = 0; i < this.getSize(); i++) {
            if(current.getValue().equals(value)){
                if(this.size == 1){
                    this.first = null;
                    this.last = null;
                }else if(current == first) {
                    this.first = current.getNext();
                    current.setNext(null);
                }else if(current == last){
                    this.last = previous;
                    previous.setNext(null);
                }else{
                    previous.setNext(current.getNext());
                    current = null;
                }
                this.size --;
                break;
            }
          previous = current;
          current = current.getNext();
        }
    }

    public Node get(int position){
        Node current = this.first;
        for (int i = 0; i < position; i++) {
            if(current.getNext() != null){
                current = current.getNext();
            }
        }
        return current;
    }
}
