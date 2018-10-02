package com.highleveldev;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by yuanjunhua on 2018/10/2.
 */

public class MyRelativeLayout extends RelativeLayout {
    private final String TAG = "MyRelativeLayoutv";

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyRelativeLayout-dispatchTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyRelativeLayout-dispatchTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyRelativeLayout-dispatchTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyRelativeLayout-dispatchTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyRelativeLayout-onInterceptTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyRelativeLayout-onInterceptTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyRelativeLayout-onInterceptTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyRelativeLayout-onInterceptTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "MyRelativeLayout-onTouchEvent--ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "MyRelativeLayout-onTouchEvent--ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.e(TAG, "MyRelativeLayout-onTouchEvent--ACTION_UP");

                break;

            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "MyRelativeLayout-onTouchEvent--ACTION_CANCEL");

                break;

            default:break;
        }

        return super.onTouchEvent(event);
    }
}
