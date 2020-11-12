package jiekoushiyan;

import java.util.InputMismatchException;
import java.util.Scanner;
//选择性别
public class Utils {
	public static String select(String tip, String[] selections) {
        for (int i = 0; i < selections.length; i++) {
            System.out.println(i + ")\t" + selections[i]);
        }
        return selections[PutInt(tip+"[0-"+(selections.length-1)+"]", 0, selections.length - 1)];
    }
//输入字符型数据的异常处理
	public static String PutString(String tip) {
        do {
            System.out.print( tip );
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine().trim();
            if (str.length() == 0) {
                System.out.println(" 请勿留空格！");
            } else {
                return str;
            }
        } while (true);
    }
//输入浮点型数据的异常处理
	public static float PutFloat(String tip, float min, float max) {
        do {
            System.out.print( tip+"：" );
            Scanner sc = new Scanner(System.in);
            Float finput = null;
            try {
                finput = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println(" 只允许浮点数！");
            } catch (Exception ignored) {
            }
            if (finput == null) continue;
            if (min >= 0 && finput < min) {
                System.out.println(" 输入值低于标准: " + min);
            } else if (max >= 0 && finput > max) {
                System.out.println(" 输入值高于标准：" + max);
            } else return finput;
        } while (true);
    }
//输入整型数据的异常处理
	public static int PutInt(String tip, int min, int max) {
        do {
            System.out.print(tip+"：");
            Scanner sc = new Scanner(System.in);
            Integer intinput = null;
            try {
                intinput = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" 只允许数字！");
            } catch (Exception ignored) {
            }
            if (intinput == null) continue;
            if (min >= 0 && intinput < min) {
                System.out.println(" 输入值低于标准: " + min);
            } else if (max >= 0 && intinput > max) {
                System.out.println(" 输入值高于标准：" + max);
            } else return intinput;
        } while (true);
    }
}
