package com.feiwuya.yunkao_android.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

public class SuperExpandableListView extends ExpandableListView {

    public SuperExpandableListView(Context context) {
        super(context);
    }

    public SuperExpandableListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SuperExpandableListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
