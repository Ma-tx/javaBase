package EnumClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class SeasonDemo {
    public static void main(String[] args) {

        Season autumn = Season.Autumn;
        System.out.println(autumn.getClass().getSuperclass());
    }

}




@Getter
@AllArgsConstructor
@ToString
enum Season implements show{


    Spring("春天",1) {
        @Override
        public void info() {
            System.out.println("春天在哪里？？？");
        }
    },
    Summer("夏天",2){
        @Override
        public void info() {
            System.out.println("夏天悄悄过去！！！");
        }
    },
    Autumn("秋天",3) {
        @Override
        public void info() {
            System.out.println("秋风扫落叶。。。");
        }
    },;
    private String name;
    private Integer order;

}


interface show{
    void info();
}
