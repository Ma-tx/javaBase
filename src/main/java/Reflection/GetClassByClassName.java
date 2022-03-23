package Reflection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.PrintWriter;
import java.security.spec.RSAOtherPrimeInfo;

//方式一：通过类名获取class
public class GetClassByClassName {
    public static void main(String[] args) {
        try {
            //class是一个模板，不同实例化的对象会对应同一个模板
            Class<?> doge = Class.forName("Reflection.Dog");
            System.out.println(doge);
            System.out.println(doge.hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



@Data
@AllArgsConstructor
@NoArgsConstructor
class Dog{
    private String name;
    private Integer age;
}
