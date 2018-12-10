package com.booksworld.util;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    /**
     * 手机号正则
     */
    private static final Pattern PHONEPATTERN = Pattern.compile("^[1][345789][0-9]{9}$");
    /**
     * 身份证号
     */
    private static final Pattern CARDID = Pattern.compile("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$|^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$");


    public static boolean isEmpty(String str) {
        return str == null ? true : "".equals(str);
    }

    /**
     * 手机号验证
     *
     * @param phone
     * @return
     */
    public static boolean isPhone(String phone) {
        if (isEmpty(phone)) {
            return false;
        }
        return PHONEPATTERN.matcher(phone).find();
    }

    /**
     * 身份证号验证
     *
     * @param cardId
     * @return
     */
    public static boolean isCardId(String cardId) {
        if (isEmpty(cardId)) {
            return false;
        }
        return CARDID.matcher(cardId).find();
    }

    /**
     * 生成随机数序列
     *
     * @param size 个数
     * @return
     */
    public static String genRandomCode(int size) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        int index = 0;
        while (index++ < size) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }


    public static List<Integer> splitToInt(String str, String delimiter) {
        String[] res = str.split(delimiter);
        List<Integer> ret = new ArrayList<>();
        for (String r : res) {
            ret.add(Integer.valueOf(r));
        }
        return ret;
    }

    /**
     * 手机号中间四位替换*
     *
     * @param phone
     * @return
     */
    public static String phoneEncode(String phone) {
        if (!isPhone(phone)) {
            return phone;
        }
        return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

    /**
     * 获取指定url中的某个参数
     *
     * @param url
     * @param name
     * @return
     */
    public static String getParamByUrl(String url, String name) {
        url += "&";
        String pattern = "(\\?|&){1}#{0,1}" + name + "=[a-zA-Z0-9]*(&{1})";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(url);
        if (m.find()) {
            System.out.println(m.group(0));
            return m.group(0).split("=")[1].replace("&", "");
        } else {
            return null;
        }
    }

    /**
     * 在指定url后追加参数
     *
     * @param url
     * @param data
     * @return
     */
    private static String appendUrl(String url, Map<String, Object> data) {
        String newUrl = url;
        StringBuffer param = new StringBuffer();
        for (String key : data.keySet()) {
            param.append(key + "=" + data.get(key).toString() + "&");
        }
        String paramStr = param.toString();
        paramStr = paramStr.substring(0, paramStr.length() - 1);
        if (newUrl.indexOf("?") >= 0) {
            newUrl += "&" + paramStr;
        } else {
            newUrl += "?" + paramStr;
        }
        return newUrl;
    }

    /**
     * 拼接模糊查询sql语句
     *
     * @param acronym
     * @return
     */
    public static String stringLike(String acronym) {
        StringBuilder stringBuilder = new StringBuilder();
        if (acronym.length() == 1) {
            return acronym;
        }
        for (int i = 0; i < acronym.length(); i++) {
            stringBuilder.append(acronym.substring(i, i + 1)).append("%");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }
}
