package com.imooc.ft_login.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;

import com.imooc.ft_login.R;
import com.imooc.ft_login.view.inter.IUserLoginView;
import com.imooc.ft_login.view.presenter.UserLoginPresenter;
import com.imooc.lib_commin_ui.base.BaseActivity;
import com.imooc.lib_commin_ui.base.plugin.PluginBaseActivity;
import com.qihoo360.replugin.loader.a.PluginFragmentActivity;

public class LoginActivity extends PluginBaseActivity implements IUserLoginView {

  private UserLoginPresenter mUserLoginPresenter;

  public static void start(Context context) {
    Intent intent = new Intent(context, LoginActivity.class);
    context.startActivity(intent);
  }

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login_layout);
    //初始化P层
    mUserLoginPresenter = new UserLoginPresenter(this);
    findViewById(R.id.login_view).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        mUserLoginPresenter.login(getUserName(), getPassword());
      }
    });
  }

  @Override public String getUserName() {
    return "18734924592";
  }

  @Override public String getPassword() {
    return "999999q";
  }

  @Override public void showLoadingView() {
    //显示加载中UI
  }

  @Override public void hideLoadingView() {
    //隐藏加载布局
  }

  @Override public void showLoginFailedView() {
    //登陆失败处理
  }

  @Override public void finishActivity() {
    finish();
  }
}
