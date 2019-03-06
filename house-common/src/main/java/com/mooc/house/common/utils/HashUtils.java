package com.mooc.house.common.utils;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

/**
 * @auther BH
 * @Date 2019/3/6 10:42
 */

public class HashUtils {
    private static final HashFunction FUNCTION = Hashing.md5();
    private static final String SALT = "mooc.com";

    public static String encryPassword(String password) {
        HashCode hashCode = FUNCTION.hashString(password + SALT, Charset.forName("utf-8"));
        return hashCode.toString();
    }
}
