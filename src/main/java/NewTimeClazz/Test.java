package NewTimeClazz;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j <100; j++) {
            int i = random.nextInt(100);
            list.add(i);
        }
        list.forEach(s->{
            if(s == 2){
                System.out.println("有");
            }
        });


    }
}
