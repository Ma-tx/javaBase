package CollectionMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//测试 集合 collection 类
public class CollectionDemo {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(new ArrayList<String>());
        list.add("dadada");
        list.add("aaaaaaawwwww");
        list.add("ssssssss");
        list.add("hotfix");
        list.add("masterTest");
        list.add("hotfixTest");
        list.add("pullDemo");


    }




    public static ArrayList<Integer> getArrayList(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(8);
        return list;

    }
}



