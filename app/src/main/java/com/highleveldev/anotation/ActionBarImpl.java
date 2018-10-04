package com.highleveldev.anotation;

/**
 * Created by yuanjunhua on 2018/10/3.
 * des:类型定义注解
 */

public class ActionBarImpl {

    public  void min(String[] args){
        //类型定义注解
        //这个时候，如果传入的参数是1，2，3 提示报错
        //只有传入的参数是ModeAction中的类型时候才能正确
        //以当前的方式可以替换枚举
        NavigationModeMethod(ModeAction.NAVIGATION_MODE_LIST);
//        NavigationModeMethod(2);
    }

    private void NavigationModeMethod(@NavigationMode int arg){
        switch (arg){
            case ModeAction.NAVIGATION_MODE_LIST:

                break;

            case ModeAction.NAVIGATION_MODE_STANDARD:

                break;

            case ModeAction.NAVIGATION_MODE_TABS:

                break;
        }
    }
}
