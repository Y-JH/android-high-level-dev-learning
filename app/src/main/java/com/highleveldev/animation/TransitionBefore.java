package com.highleveldev.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Slide;

import com.highleveldev.R;

/**
 * des:过渡动画
 */
public class TransitionBefore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_before);

        setUpWindowAnimations();

    }

    private void setUpWindowAnimations(){
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade); // 进入动画

        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setReturnTransition(slide); // B-->A（A已启动，重返A）时触发 B调用returnTransition() 同时A调用reenterTransition()
    }
}
