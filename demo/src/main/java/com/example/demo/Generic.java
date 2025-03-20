package com.example.demo;

public class Generic<T> {
    private T something;

    public T getSomething() {
        return something;
    }

    public void setSomething(T something) {
        this.something = something;
    }
    public static void main(String[] args){
        Generic<Person> Nihola=new Generic<>();
        Person person=new Person();
        person.setName("Lucy");
        person.setAge(81);
        person.setAddress(" Italy");
        Nihola.setSomething(person);
        System.out.println("Person's Name : "+Nihola.getSomething().getName()+" Age :  "+ Nihola.getSomething().getAge()+" Address : " + Nihola.getSomething().getAddress() );


        Generic<Student> Tom=new Generic<>();
        Student student=new Student();
        student.setName("Tom");
        student.setAge(21);
        student.setAddress(" British");
        Tom.setSomething(student);
        System.out.println("Person's Name : "+Tom.getSomething().getName()+" Age :  "+ Tom.getSomething().getAge()+" Address : " + Tom.getSomething().getAddress() );
    }
}
