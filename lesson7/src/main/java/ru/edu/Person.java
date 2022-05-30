package ru.edu;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String city;
    private String name;
    private int age;

    public Person (String city, String name, int age) {
        if (city == null || name == null) {
            throw new IllegalArgumentException("Parameters is null!");
        }

        this.city = city;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(city.compareToIgnoreCase(o.city) == 0) {
            return name.compareToIgnoreCase(o.name);
        }
        return city.compareToIgnoreCase(o.city);
    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(city, person.city) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city.toLowerCase(), name.toLowerCase(), age);
    }
}
