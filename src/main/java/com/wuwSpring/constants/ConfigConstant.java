package com.wuwSpring.constants;

/**
 * All rights Reserved, Designed By WUW
 *
 * @Title: ConfigConstant
 * @Package com.wuwSpring.constants
 * @Description:  常量接口
 * @author: WUW
 * @date: 2019/9/1 13:03
 */
public interface ConfigConstant {
    String CONFIG_FILE="wuw.properties";

    //数据源
    String JDBC_DRIVER="jdbc.driver";
    String JDBC_URL="jdbc.url";
    String JDBC_USERNAME="jdbc.username";
    String JDBC_PASSWORD="jdbc.password";

    //java源码地址
    String APP_BASE_PACKAGE="app.base_package";
    String APP_JSP_PATH="app.jsp_path";
    String APP_STATIC_PATH="app.static_path";


}
