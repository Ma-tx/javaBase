package Reflection;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

//利用自带的getClass获取对象的class
public class GetCalssByGetClass {
    public static void main(String[] args) {
        Cat aa = new Cat("花花", 2);
        Cat bb = new Cat("点点", 3);
        Tiger cc = new Tiger("大虫", 3);
        //结果一样，是一个class
        System.out.println(aa.getClass().hashCode());
        System.out.println(bb.getClass().hashCode());
        System.out.println(cc.getClass().getSuperclass().hashCode());

    }
}



@Data
@AllArgsConstructor
@NoArgsConstructor
class Cat{
    private String name;
    private Integer age;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Tiger extends Cat{
    private String name;
    private Integer age;

}

