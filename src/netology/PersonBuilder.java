package netology;

import java.util.Optional;
import java.util.OptionalInt;

public class PersonBuilder {
    private  String name;
    private  String surname;
    private int age = -1;
    private String city;

    public PersonBuilder(){};

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() throws IllegalStateException {
        if(this.name == null || this.surname == null) {
            IllegalStateException e = new IllegalStateException("Не хватает имени, или фамилии");
            e.printStackTrace();
            return null;
        }
        if(this.age < 0) {
            IllegalStateException e = new IllegalStateException("Не верно задан возраст");
            e.printStackTrace();
            return new Person(this.name, this.surname, this.city);
        }
        if(this.city == null) {
            IllegalStateException e = new IllegalStateException("Не указан адрес");
            e.printStackTrace();
            return new Person(this.name, this.surname, this.city);
        }

        return new Person(this.name, this.surname, this.age, this.city);
    }

}