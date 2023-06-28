package ru.netology.springbootdemo.demain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Person {
    @NotBlank
    @Size(min = 2, max = 20)
    private String name;
    @Min(0)
    @Max(150)
    private int are;

    public Person() {
    }

    public Person(String name, int are) {
        this.name = name;
        this.are = are;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        this.are = are;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", are=" + are +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return are == person.are && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, are);
    }
}
