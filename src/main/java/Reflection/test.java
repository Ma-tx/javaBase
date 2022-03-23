package Reflection;


//该测试类利用反射获取类的方法，并传入参数调用相应的方法
import java.lang.reflect.Method;
class A {
    void test1(int a) {
        System.out.println("test1," +a);
    }
    void test2(int a,int b) {
        System.out.println("test2," +a+","+b);
    }
    void test3() {
        System.out.println("test3");
    }
    void test4() {
        System.out.println("test4");
    }


    public static void main(String[] args) throws Exception {
        String m = "test1 10,test2 10 100,test3,test4";
        A a = new A();
        String[] split = m.split(",");
        System.out.println(split);
        for (String s : split) {
            String[] s1 = s.split(" ");
            String methodName = s1[0];          //得到要调用的方法名
            int argsLen = s1.length - 1;        //获取参数的个数
            if(argsLen==0) {
                Method method = A.class.getDeclaredMethod(methodName);
                method.invoke(a);
            }else {
                Class[] methodTypes = new Class[argsLen];       //构建类的数组
                Object[] methodArgs = new Object[argsLen];      //构建对象数组
                for (int i = 0; i < argsLen; i++) {
                    methodTypes[i] = int.class;
                    methodArgs[i]= Integer.valueOf(s1[i+1]);       //将参数转化为integer类型，并装入对象数组
                }
                Method method = A.class.getDeclaredMethod(methodName,methodTypes);      //将方法名称和参数传入反射获取类方法的方法中，得到method对象
                method.invoke(a,methodArgs);                           //利用method对象执行方法
            }
        }
    }
}
