package com.feiwuya.yunkao_android;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.feiwuya.yunkao_android.pojo.CalProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickCalResultActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_cal_result);
        ArrayList<CalProblem> problems = (ArrayList<CalProblem>) getIntent().getSerializableExtra("problems");
        // :TODO 展示做题结果
    }
}
