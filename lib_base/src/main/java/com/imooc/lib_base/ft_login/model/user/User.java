package com.imooc.lib_base.ft_login.model.user;

import android.os.Parcel;
import android.os.Parcelable;

import com.imooc.lib_base.BaseModel;

/**
 * 用户数据协议
 */
public class User extends BaseModel implements Parcelable {
  public int ecode;
  public String emsg;
  public UserContent data;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(this.ecode);
    dest.writeString(this.emsg);
    dest.writeParcelable(this.data, flags);
  }

  public User() {
  }

  protected User(Parcel in) {
    this.ecode = in.readInt();
    this.emsg = in.readString();
    this.data = in.readParcelable(UserContent.class.getClassLoader());
  }

  public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
    @Override
    public User createFromParcel(Parcel source) {
      return new User(source);
    }

    @Override
    public User[] newArray(int size) {
      return new User[size];
    }
  };
}
