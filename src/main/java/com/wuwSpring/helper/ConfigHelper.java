package com.wuwSpring.helper;

import com.wuwSpring.constants.ConfigConstant;
import com.wuwSpring.util.PropsUtils;

import java.util.Properties;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: ConfigHelper
 * @Package com.wuwSpring.helper
 * @Description:
 * @author: WUW
 * @date: 2019/9/1 14:14
 */
public class ConfigHelper {
    /**
     * 加载配置文件的属性
     */
    private static final Properties CONFIG_PROPS = PropsUtils.loadProps(ConfigConstant.CONFIG_FILE);

    /**
     * 获取 JDBC 驱动
     */
    public static String getJdbcDriver() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获取 JDBC URL
     */
    public static String getJdbcUrl() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_URL);
    }

    /**
     * 获取 JDBC 用户名
     */
    public static String getJdbcUsername() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获取 JDBC 密码
     */
    public static String getJdbcPassword() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获取应用基础包名
     */
    public static String getAppBasePackage() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.APP_BASE_PACKAGE);
    }

    /**
     * 获取应用 JSP 路径
     */
    public static String getAppJspPath() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获取应用静态资源路径
     */
    public static String getAppAssetPath() {
        return PropsUtils.getString(CONFIG_PROPS, ConfigConstant.APP_STATIC_PATH, "/asset/");
    }

    /**
     * 根据属性名获取 String 类型的属性值
     */
    public static String getString(String key) {
        return PropsUtils.getString(CONFIG_PROPS, key);
    }

    /**
     * 根据属性名获取 int 类型的属性值
     */
    public static int getInt(String key) {
        return PropsUtils.getInt(CONFIG_PROPS,key,0);
    }

    /**
     * 根据属性名获取 boolean 类型的属性值
     */
    public static boolean getBoolean(String key) {
        return PropsUtils.getBoolean(CONFIG_PROPS, key);
    }

}
