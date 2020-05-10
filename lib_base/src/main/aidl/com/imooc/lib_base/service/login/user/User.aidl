// package 要是java下的User对应的包名
// 同时这个包下的User类包括内嵌的类都要实现Parcelable，不能实现Serializable
package com.imooc.lib_base.ft_login.model.user;

//aidl不会自动帮我们导包，需要手动导
import com.imooc.lib_base.ft_login.model.user.User;

parcelable User;
