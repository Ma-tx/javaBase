package CollectionMap;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//  该类用于列表的回顾
public class ListDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
    }

    //ArrayList 普通的数组列表，底层由数组实现，且线程不安全
    public ArrayList<Stu> getArrayList(){
        ArrayList<Stu> list = new ArrayList<Stu>();
        list.add(new Stu("小环",12));
        list.add(new Stu("丽丽",21));
        list.add(new Stu("大勇",23));
        return list;
    }

    //linkedList,底层由链表实现，更便于插入删除,线程不安全
    public LinkedList<Dog> getLinkedList(){
        LinkedList<Dog> list = new LinkedList<Dog>();
        list.add(new Dog("大黄",3));
        list.add(new Dog("小不点",2));
        return list;
    }


}

//定义学生类
@Data
@AllArgsConstructor
@NoArgsConstructor
class Stu{
    private String name;
    private int age;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Dog{
    private String name;
    private int age;
}


