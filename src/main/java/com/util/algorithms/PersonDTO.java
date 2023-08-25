package com.util.algorithms;

public class PersonDTO {

    private String name;
    private Integer age;



    public String getName() {
        return name;
    }

    public PersonDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
