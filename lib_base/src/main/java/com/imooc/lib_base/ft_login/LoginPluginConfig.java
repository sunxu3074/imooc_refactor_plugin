package com.imooc.lib_base.ft_login;

/**
 * 统一管理 login插件 相关的常量信息
 */
public class LoginPluginConfig {

    public static final String PLUGIN_NAME = "ft_login";//插件名

    public static final String PACKAGE_NAME = "com.imooc.ft_login";//插件包名

    public static final String KEY_INTERFACE = PACKAGE_NAME + ".interface";//interface名

    //插件对外暴露的所有页面
    public static class PAGE {
        public static final String PAGE_LOGIN = PACKAGE_NAME + ".view.LoginActivity";
    }

    //插件对外暴露的所有action
    public static class ACTION {
        public static final String KEY_DATA = PACKAGE_NAME + ".key.data";
        public static final String LOGIN_SUCCESS_ACTION = PACKAGE_NAME + ".action.LOGIN_SUCCESS";
    }

}
