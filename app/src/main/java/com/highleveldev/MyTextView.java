package com.highleveldev;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by yuanjunhua on 2018/10/2.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView {
    private final String TAG = "MyTextView";

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyTextView-dispatchTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyTextView-dispatchTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyTextView-dispatchTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyTextView-dispatchTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyTextView-onTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyTextView-onTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyTextView-onTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyTextView-onTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }

        return super.onTouchEvent(event);
    }
}
