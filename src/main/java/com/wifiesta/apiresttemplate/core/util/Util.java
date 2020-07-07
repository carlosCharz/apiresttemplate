package com.wifiesta.apiresttemplate.core.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
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

    public LocalDate nowDate() {
        return ZonedDateTime.now(ZoneOffset.UTC).toLocalDate();
    }

    public LocalDateTime nowTZ(String timeZone) {
        ZoneId zoneId = ZoneId.of(timeZone);
        return ZonedDateTime.now(zoneId).toLocalDateTime();
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

    public long toMillis(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    public long nowLocalDateMillisAtStartOfDay() {
        LocalDate nowLocalDate = nowDate();
        return nowLocalDate.atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
    }

    public LocalDateTime fromMillis(long millis) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), ZoneOffset.UTC);
    }

    public static List<String> split(String listStr) {
        return Arrays.asList(listStr.split("\\s+"));
    }

    public static <T> List<T> notNull(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    public static LocalDateTime toDateTimeFromSecondsPrecision(Long timeStampSeconds) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStampSeconds), ZoneOffset.UTC);
        return localDateTime;
    }

    public static LocalDateTime toDateTime(Long timeStampMillis) {
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(timeStampMillis), ZoneOffset.UTC);
        return localDateTime;
    }

    public static String getStringDateInSecondsFromDate(LocalDate date) {
        return String.valueOf(date.atTime(LocalTime.now(ZoneOffset.UTC)).toEpochSecond(ZoneOffset.UTC));
    }

    public static LocalDate getDateFromLong(Long dateLong) {
        return toDateTimeFromSecondsPrecision(dateLong).toLocalDate();
    }

}
