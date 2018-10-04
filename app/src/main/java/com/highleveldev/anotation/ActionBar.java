package com.highleveldev.anotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by yuanjunhua on 2018/10/3.
 * des:类型定义注解
 */

public abstract class ActionBar {


    @Retention(RetentionPolicy.SOURCE)
    @IntDef({NAVIGATION_MODE_STANDARD,NAVIGATION_MODE_LIST,NAVIGATION_MODE_TABS})
    public @interface NavigationMode{}

    public static final int NAVIGATION_MODE_STANDARD = 0;
    public static final int NAVIGATION_MODE_LIST = 1;
    public static final int NAVIGATION_MODE_TABS = 2;

    @NavigationMode
    public abstract int getNavigationMode();

    public abstract void setNavigationMode(@NavigationMode int mode);
}
