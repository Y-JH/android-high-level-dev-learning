package com.highleveldev.anotation;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by yuanjunhua on 2018/10/3.
 * des:Nullness & NonNull 参数注解
 */

public class ArgsAnotation {

    private String atIdCard=null;
    //测试Nullness 注解
    private void setNullNess(@Nullable String name){
    }

    //测试NonNull 注解
    private void setNonNull(@NonNull String idCard){
    }


    public void main(){
        setNullNess(null);

        setNonNull(atIdCard);
    }
}
