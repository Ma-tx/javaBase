package Reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GetClassByClass {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.hashCode());
        System.out.println(personClass.getDeclaredMethods().toString());


    }
}

@AllArgsConstructor
@NoArgsConstructor
@Data
class Person{
    private String name;
    private Integer age;
}
