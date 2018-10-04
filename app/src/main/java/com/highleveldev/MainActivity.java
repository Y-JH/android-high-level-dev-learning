package com.highleveldev;

import android.Manifest;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.transition.Slide;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import com.highleveldev.animation.TransitionBefore;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpWindowAnimations();

        TextView tvTouche = (TextView) findViewById(R.id.tvTouche);
        tvTouche.setOnClickListener(this);
        tvTouche.setOnTouchListener(this);

        findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TransitionBefore.class), ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
            }
        });
    }

    @RequiresPermission(Manifest.permission.ACCESS_FINE_LOCATION)
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvTouche:
                Log.e(TAG, "--MyTextView-onClick--");
                break;


        }
    }

    private void setUpWindowAnimations(){
        //进入退出效果 注意这里 创建的效果对象是 Slide()
//        getWindow().setEnterTransition(new Slide().setDuration(2000));
//        getWindow().setExitTransition(new Slide().setDuration(2000));

        Fade fade = new Fade();
        fade.setDuration(100);
        getWindow().setEnterTransition(fade); // 进入动画

        Slide slide = new Slide();
        slide.setDuration(50);
        getWindow().setReturnTransition(slide); // B-->A（A已启动，重返A）时触发 B调用returnTransition() 同时A调用reenterTransition()
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MainActivity-dispatchTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MainActivity-dispatchTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MainActivity-dispatchTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MainActivity-dispatchTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }

        return super.dispatchTouchEvent(ev);
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MainActivity-onTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MainActivity-onTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MainActivity-onTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MainActivity-onTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }

        return super.onTouchEvent(event);
    }



    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "act-onTouch--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "act-onTouch--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "act-onTouch--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "act-onTouch--ACTION_CANCEL");

                break;

            default:break;
        }
        return false;
    }

}
