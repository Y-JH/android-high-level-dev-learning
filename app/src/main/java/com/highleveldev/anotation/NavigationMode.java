package com.highleveldev.anotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by yuanjunhua on 2018/10/3.
 * des:类型定义注解
 */

@Retention(RetentionPolicy.SOURCE)
@IntDef({ModeAction.NAVIGATION_MODE_STANDARD, ModeAction.NAVIGATION_MODE_LIST, ModeAction.NAVIGATION_MODE_TABS})
public @interface NavigationMode {
}
