package FaceObject;

public class Student{
    private static int count;
    private int num;
    public Student() {
        count++;
        num++;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
//因为还是在类中,所以可以直接访问私有属性
        System.out.println(s1.num);
        System.out.println(s2.num);
        System.out.println(s3.num);
        System.out.println(s4.num);
        System.out.println(Student.count);
        System.out.println(s1.count);
        System.out.println(s2.count);
        System.out.println(s3.count);
        System.out.println(s4.count);
    }
}
