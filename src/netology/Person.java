package netology;

import jdk.jshell.PersistentSnippet;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private Integer age = null;
    private String city;

    public Person (String name, String surname) {
        this.name = name;
        this.surname = surname;
    };
    public Person (String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    };
    public Person (String name, String surname, String city) {
        this.name = name;
        this.surname = surname;
        this.city = city;
    };


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void happyBirthday() {
        if (hasAge()){
            age += 1;
        }
    }

    public boolean hasAge() {
       return age == null ? false : true;
    }

    public boolean hasAddress() {
        return city == null ? false : true;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " years old. Cyty " + city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setSurname(this.surname);
        child.setAge(0);
        child.setAddress(this.city);
        return child;
    }



}

