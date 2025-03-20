package com.example.demo;

public class Factory {
    public static Person createPerson() {
        Person person = new Person();
        person.setName("Nihola");
        person.setAge(18);
        person.setAddress("Andijan");
        return person;
    }
    public static void main(String [] args){
    Person Nihola=Factory.createPerson();
    System.out.println("My name : "+Nihola.getName()+ " , My age : "+Nihola.getAge()+" , My Address "+Nihola.getAddress());
    }
}
