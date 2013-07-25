package com.utils;

import java.util.Collection;

public class AppUtils {
    public static boolean isEmpty(Object obj) {
        if(obj == null) {
            return true;
        } else {
            if(obj instanceof String) {
                String str = (String) obj;
                return str.trim().length() == 0;
            } else if (obj instanceof Integer) {
                Integer intValue = (Integer) obj;
                return intValue.equals(0);
            } else if (obj instanceof Long) {
                Long longValue = (Long) obj;
                return longValue.equals(0L);
            } else if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                return collection.isEmpty();
            }
        }

        return false;
    }

    public static boolean notEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static boolean convertYorNToBoolean(String yesOrNo) {
        return "Y".equalsIgnoreCase(yesOrNo);
    }

    public static String convertBooleanToYorN(boolean value) {
        return value ? "Y" : "N";
    }

}
