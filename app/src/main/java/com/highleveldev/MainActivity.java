package com.highleveldev;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTouche = (TextView) findViewById(R.id.tvTouche);
        tvTouche.setOnClickListener(this);
        tvTouche.setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvTouche:
                Log.e(TAG, "--MyTextView-onClick--");
                break;


        }
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
