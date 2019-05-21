package Misc;

/*
  Author: Jarcem
  Date: 2019/5/20
  Time: 21:13
  Purpose: can not merge kit
*/

import java.util.ArrayList;
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

    //int数组转数据库格式
    public static String transportArrayToDatabase(List<Integer> array) {
        String str = null;

        if (array != null) {
            for (int num : array) {
                str = (num == 0 ? String.valueOf(num) : str + "|" + String.valueOf(num));
            }
        }

        return str;
    }

    public static List<Integer> transportDatabaseToArray(String str) {
        List<Integer> array = new ArrayList<>(), key = new ArrayList<>();
        int counter = (isNotNull(str) ? str.indexOf("|") : -1);
        while (counter != -1) {
            key.add(counter);
            counter = str.indexOf("|", counter + 1);
        }
        System.out.println(key.toString());
        for (int i = 0; i < key.size(); i++) {
            if (i == 0) {
                array.add(Integer.valueOf(str.substring(i, key.get(i))));
            } else {
                array.add(Integer.valueOf(str.substring(key.get(i - 1) + 1, key.get(i))));
            }
        }

        return array;
    }
}
