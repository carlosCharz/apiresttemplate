package com.wifiesta.apiresttemplate.core.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Util class
 *
 * @author charz
 */
public class Util {

    public static boolean isNullOrEmpty(String param) {
        return param == null || param.trim().length() == 0;
    }

    public static boolean isNullOrEmpty(Collection<?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNullOrEmpty(Map<?, ?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isEmpty(String param) {
        return param.trim().length() == 0;
    }

    public static Long getCurrentUnixTime() {
        return getCurrentTimeMillis() / 1000L;
    }

    public static Long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static LocalDateTime now() {
        return ZonedDateTime.now(ZoneOffset.UTC).toLocalDateTime();
    }

    public static long nowMillis() {
        return now().toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    public static int nowSeconds() {
        return (int) (nowMillis() / 1000);
    }

    public static List<String> split(String listStr) {
        return Arrays.asList(listStr.split("\\s+"));
    }

    public static <T> List<T> notNull(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

}
