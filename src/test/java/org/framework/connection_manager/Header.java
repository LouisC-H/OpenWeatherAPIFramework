package org.framework.connection_manager;

import static org.framework.connection_manager.ConnectionManager.getResponse;

public class Header {
    public static String getFullHeader(){
        return getResponse().headers().toString();
    }
    public static String getServer(){
        return getResponse().headers().allValues("Server").get(0);
    }
    public static String getDate(){
        return getResponse().headers().allValues("Date").get(0);
    }
    public static String getContentType(){
        return getResponse().headers().allValues("Content-Type").get(0);
    }
    public static String getContentLength(){
        return getResponse().headers().allValues("Content-Length").get(0);
    }
    public static String getConnection(){
        return getResponse().headers().allValues("Connection").get(0);
    }
    public static String getXCacheKey(){
        return getResponse().headers().allValues("X-Cache-Key").get(0);
    }
    public static String getAccessControlAllowOrigin(){
        return getResponse().headers().allValues("Access-Control-Allow-Origin").get(0);
    }
    public static String getAccessControlAllowCredentials(){
        return getResponse().headers().allValues("Access-Control-Allow-Credentials").get(0);
    }
    public static String getAccessControlAllowMethods(){
        return getResponse().headers().allValues("Access-Control-Allow-Methods").get(0);
    }
}
