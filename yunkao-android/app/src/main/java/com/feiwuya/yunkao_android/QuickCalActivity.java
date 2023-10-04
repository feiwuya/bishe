package com.feiwuya.yunkao_android;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.feiwuya.yunkao_android.pojo.CalProblem;
import com.feiwuya.yunkao_android.pojo.QuickCalSettings;
import com.feiwuya.yunkao_android.util.CalculateUtils;
import com.feiwuya.yunkao_android.util.PageUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickCalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_cal);
        QuickCalSettings calSettings = (QuickCalSettings) (getIntent().getSerializableExtra("calSettings"));
        int currentProblem = 1; // 正在做的题目位置
        Chronometer chronometer = findViewById(R.id.chronometer); // 计时器
        TextView okNum = (TextView) (findViewById(R.id.ok_num)); // 完成数
        TextView problem = (TextView) findViewById(R.id.problem); // 题目
        TextView inputResult = (TextView) findViewById(R.id.inputResult);
        okNum.setText(currentProblem + "/" + calSettings.getNumber());
        TextView standardText = (TextView) findViewById(R.id.standard);
        standardText.setText("合格:" + calSettings.getQualifyingTime() + "s  良好:" + calSettings.getGoodTime() + "s  优秀:" + calSettings.getExcellentTime() + "s");
        List<CalProblem> problems = new ArrayList<>(); // 题目所有信息
        String expression = null; // 算式
        inputResult.setText("");
        problems.clear();
        if (calSettings.getType() == 1) {
            expression = CalculateUtils.type1();
        } else if (calSettings.getType() == 2) {
            expression = CalculateUtils.type2();
        } else if (calSettings.getType() == 3) {
            expression = CalculateUtils.type3();
        } else if (calSettings.getType() == 4) {
            expression = CalculateUtils.type4();
        } else if (calSettings.getType() == 5) {
            expression = CalculateUtils.type5();
        } else if (calSettings.getType() == 6) {
            expression = CalculateUtils.type6();
        } else if (calSettings.getType() == 7) {
            expression = CalculateUtils.type7();
        } else if (calSettings.getType() == 8) {
            expression = CalculateUtils.type8();
        } else if (calSettings.getType() == 9) {
            expression = CalculateUtils.type9();
        } else if (calSettings.getType() == 10) {
            expression = CalculateUtils.type10();
        } else if (calSettings.getType() == 11) {
            expression = CalculateUtils.type11();
        } else if (calSettings.getType() == 12) {
            expression = CalculateUtils.type12();
        } else if (calSettings.getType() == 13) {
            expression = CalculateUtils.type13();
        } else if (calSettings.getType() == 14) {
            expression = CalculateUtils.type14();
        } else if (calSettings.getType() == 15) {
            expression = CalculateUtils.type15();
        } else if (calSettings.getType() == 16) {
            expression = CalculateUtils.type16();
        }
        problems.add(new CalProblem(expression, CalculateUtils.calculate(expression)));
        problem.setText(expression + " = ");

        chronometer.start();
        problem.setTextSize(30);
        inputResult.setTextSize(30);
        inputResult.setTextColor(Color.GREEN);
        PageUtil.generateKeyboard(findViewById(R.id.keyboard), this, inputResult, calSettings, problems);
    }
}
