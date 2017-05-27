package com.angelatech.yeyelive.CBLView;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * User: cbl
 * Date: 2016/7/30
 * Time: 12:01
 * 自定义 gridView
 */
public class cGridView extends LinearLayout {
    public cGridView(Context context) {
        super(context);
    }

    public cGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public cGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public cGridView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
