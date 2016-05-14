package com.lightfire.gradienttextcolor;

/**
 * Created by kadir on 5/12/16.
 * Project : Gradient Text
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Kadir-PC on 12.05.2016.
 * Project : Arena
 */
public class GradientButton extends Button {
    int c1,c2;
    Shader shader;

    public GradientButton(Context context) {
        super(context);
    }

    public GradientButton(Context context, AttributeSet attrs) {
        super(context, attrs);
            createShader(context,attrs,0);
    }

    public GradientButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

            createShader(context,attrs,defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GradientButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

            createShader(context,attrs,defStyleAttr);
    }


    public void init(Context context,AttributeSet attrs,int defStyleAttr){
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

