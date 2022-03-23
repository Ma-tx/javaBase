package CollectionMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

//用于回顾map集合
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Cat> hashMap = getHashMap();
        Cat littleKing = hashMap.get("小王");
        System.out.println(littleKing);


    }

    public static HashMap<String,Cat> getHashMap(){
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("小王",new Cat("花花",2));
        map.put("小丽",new Cat("跳跳",3));
        return map;
    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Cat{
    private String name;
    private int age;
}
