package EnumClass;

import lombok.*;

public class test {
    public static void main(String[] args) {
        System.out.println(SexEnum.FEMALE);

    }
}


@Getter
@AllArgsConstructor
@ToString
enum Stu {
    Tom("Tom",12),
    Allen("Alllen",13),;

    private String name;
    private Integer age;

}

@Getter
@AllArgsConstructor
@ToString
enum SexEnum {
    MALE(1, "男"),
    FEMALE(2, "女");

    private Integer sex;
    private String sexName;
}
