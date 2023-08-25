package com.data.structures.algorithms.linked.list;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LinkedListCustomTest {

    @InjectMocks
    LinkedListCustom<String> linkedListCustom = new LinkedListCustom<>();

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldAddItem(){
        linkedListCustom.add("Pasta");
        linkedListCustom.add("Meat");
        linkedListCustom.add("Lettuce");
        linkedListCustom.add("Carrot");

        assertEquals(4, linkedListCustom.getSize());
        assertEquals("Pasta", linkedListCustom.getFirst().getValue());
        assertEquals("Carrot", linkedListCustom.getLast().getValue());

    }

    @Test
    public void shouldRemoveItem(){
        linkedListCustom.add("Pasta");
        linkedListCustom.add("Meat");
        linkedListCustom.add("Lettuce");
        linkedListCustom.add("Carrot");

        linkedListCustom.remove("Pasta");
        linkedListCustom.add("Kitchen");
        linkedListCustom.remove("Lettuce");

        assertEquals(3, linkedListCustom.getSize());
    }

    @Test
    public void shouldListItems(){
        linkedListCustom.add("Pasta");
        linkedListCustom.add("Meat");
        linkedListCustom.add("Lettuce");
        linkedListCustom.add("Carrot");
        linkedListCustom.add("Kitchen");

        assertEquals(3, linkedListCustom.getSize());
    }
}
