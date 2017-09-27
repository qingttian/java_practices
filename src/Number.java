/**
 * Created by qingttian on 17-9-27.
 */
public class Number {
    public static void main(String[] args){
        byte mybyte = 124;
        short myshort = 32564;
        int myint = 45784612;
        long mylong = 46789451;
        long result = mybyte + myshort + myint + mylong;
        char c1 = '\\';
        char char1 = '\u2605';
        char char2 = 0x2605;
        System.out.println("结果为：" + result);
        System.out.println(c1);
        System.out.println(char1);
        System.out.print(char2);
    }
}
