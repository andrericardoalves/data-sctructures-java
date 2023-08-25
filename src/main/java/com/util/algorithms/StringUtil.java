package com.util.algorithms;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

public class StringUtil {
    /**
     *
     * @param objects
     * @param fieldName
     * @param separator
     * @param clazz
     * @return
     * @param <T>
     *     Methods is done to use before the Java 8.
     */
    public static <T> String getFiedValuesSeparatedBy(List<T> objects, String fieldName, String separator, Class<T> clazz){
        StringBuilder result = new StringBuilder();

        Objects.requireNonNull(fieldName, "The field is mandatory");

        try {
            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);

            for (T object:	objects) {
                Object value = field.get(object);
                if (value != null){
                    if (result.length() > 0){
                        result.append(separator.concat(" "));
                    }
                    result.append(value);
                }
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }


        return result.toString();
    }

    /**
     *
     * @param list
     * @return
     * @param <T>
     */
    public static <T> String getCommaSeparatedString(List<T> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (T item : list) {
            sb.append(item).append(", ");
        }

        // Remove the trailing comma and space
        sb.delete(sb.length() - 2, sb.length());

        return sb.toString();
    }
}
