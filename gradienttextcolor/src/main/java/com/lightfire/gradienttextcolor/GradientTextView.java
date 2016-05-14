package com.lightfire.gradienttextcolor;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by kadir on 5/12/16.
 * Project : Gradient Text
 */
public class GradientTextView extends TextView {

    int c1,c2;
    Shader shader;

    public GradientTextView(Context context) {
        super(context);
    }

    public GradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if(!isInEditMode())
        createShader(context,attrs,0);
    }

    public GradientTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if(!isInEditMode())
        createShader(context,attrs,defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GradientTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        if(!isInEditMode())
        createShader(context,attrs,defStyleAttr);
    }


    public void createShader(Context context,AttributeSet attrs,int defStyleAttr){
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.GradientTextView,defStyleAttr,0);
        try {
            c1 = a.getInt(R.styleable.GradientTextView_gradientStart,0);
            c2 = a.getInt(R.styleable.GradientTextView_gradientEnd,0);
            shader = new LinearGradient(0, 0, 0, getTextSize(),
                    new int[]{c1, c2},
                    new float[]{0, 1}, Shader.TileMode.CLAMP);
            getPaint().setShader(shader);
        }finally {
            a.recycle();
        }
    }
}

