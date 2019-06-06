package Misc;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 21:13
  Purpose: can not merge kit
*/

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class MiscKit {

    //判断字符串是否为空
    public static boolean isNull(String str) {
        return null == str || str.length() == 0 || "".equals(str) || str.matches("\\s*");
    }

    //非空判断
    public static boolean isNotNull(String userName) {
        return !isNull(userName);
    }

    //判断是否为数字
    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("^-?([1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*|0?\\.0+|0)$");
        return pattern.matcher(str).matches();
    }

    //数据库转String
    public static List<String> transformToList(String string){
        List<String> stringList = Arrays.asList(string.split(","));

        return stringList;
    }

    //String转数据库
    public static String transfromToString(List<String> stringList){
        String str = stringList.toString().replaceAll(" ", "");
        str = str.substring(1, str.length()-1);

        return str;
    }

    //取商品编号和数量
    public static int[] getNumberAndPrice(String string){
        int[] ints = new int[2];
        ints[0] = Integer.valueOf(string.substring(0, string.indexOf(".")));
        ints[1] = Integer.valueOf(string.substring(string.indexOf(".")+1, string.length()));

        return ints;
    }
}
