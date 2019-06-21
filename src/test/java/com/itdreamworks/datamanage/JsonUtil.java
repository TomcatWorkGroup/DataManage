package com.itdreamworks.datamanage;


import org.mockito.internal.util.StringUtil;

import java.lang.reflect.Array;

public class JsonUtil {
    public static String getUrlParamString(String jsonString) {
        String str = jsonString.substring(1, jsonString.length() - 1);
        String[] strs = str.split(",");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = strs[i].replace("\"", "").replace(':', '=');
        }

        return String.join("&", strs);
    }
}
