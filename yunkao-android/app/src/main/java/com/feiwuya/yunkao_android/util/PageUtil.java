package com.feiwuya.yunkao_android.util;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.feiwuya.yunkao_android.R;
import com.feiwuya.yunkao_android.pojo.CalProblem;
import com.feiwuya.yunkao_android.pojo.QuickCalSettings;
import com.google.android.material.button.MaterialButton;

import java.util.List;

public class PageUtil {
    // 添加键盘
    public static void generateKeyboard(LinearLayout layout, AppCompatActivity activity, TextView inputResult, QuickCalSettings calSettings, List<CalProblem> problems) {
        layout.setPadding(40, 0, 40, 0);
        // 第一行
        LinearLayout linearLayoutOne = new LinearLayout(activity);
        linearLayoutOne.setOrientation(LinearLayout.HORIZONTAL);
        DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int widthPixels = dm.widthPixels;// 屏幕宽度
        MaterialButton againBtn = new MaterialButton(activity); // 重开按钮
        againBtn.setText("重开");
        againBtn.setWidth((widthPixels - 80) / 3);
        againBtn.setOnClickListener(view -> {
            Chronometer chronometer = (Chronometer) (activity.findViewById(R.id.chronometer));
            chronometer.setBase(SystemClock.elapsedRealtime()); // 计时器复位
            chronometer.start(); // 重新计时
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
            ((TextView) activity.findViewById(R.id.problem)).setText(expression + " = ");
        });
        MaterialButton clearBtn = new MaterialButton(activity); // 清空按钮
        clearBtn.setText("清空");
        clearBtn.setOnClickListener(view -> inputResult.setText(""));
        clearBtn.setWidth((widthPixels - 80) / 3);

        MaterialButton delBtn = new MaterialButton(activity); // 删除按钮
        delBtn.setOnClickListener(view -> {
            if (inputResult.getText().length() != 0) {
                inputResult.setText(inputResult.getText().subSequence(0, inputResult.getText().length() - 1));
            }
        });
        delBtn.setText("删除");
        delBtn.setWidth((widthPixels - 80) / 3);

        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        buttonParams.rightMargin = 10; // 设置右侧margin（这里以10dp为例，你可以根据需要调整）
        buttonParams.topMargin = 10;
        againBtn.setLayoutParams(buttonParams);
        clearBtn.setLayoutParams(buttonParams);
        delBtn.setLayoutParams(buttonParams);
        linearLayoutOne.addView(againBtn);
        linearLayoutOne.addView(clearBtn);
        linearLayoutOne.addView(delBtn);
        layout.addView(linearLayoutOne);
        // 第二行
        LinearLayout linearLayoutTwo = new LinearLayout(activity);
        linearLayoutTwo.setOrientation(LinearLayout.HORIZONTAL);

        MaterialButton btnOne = new MaterialButton(activity);
        btnOne.setText("1");
        btnOne.setWidth((widthPixels - 80) / 3);
        btnOne.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "1"));

        MaterialButton btnTwo = new MaterialButton(activity);
        btnTwo.setText("2");
        btnTwo.setWidth((widthPixels - 80) / 3);
        btnTwo.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "2"));

        MaterialButton btnThree = new MaterialButton(activity);
        btnThree.setText("3");
        btnThree.setWidth((widthPixels - 80) / 3);
        btnThree.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "3"));

        btnOne.setLayoutParams(buttonParams);
        btnTwo.setLayoutParams(buttonParams);
        btnThree.setLayoutParams(buttonParams);
        linearLayoutTwo.addView(btnOne);
        linearLayoutTwo.addView(btnTwo);
        linearLayoutTwo.addView(btnThree);
        layout.addView(linearLayoutTwo);
        // 第三行
        LinearLayout linearLayoutThree = new LinearLayout(activity);
        linearLayoutThree.setOrientation(LinearLayout.HORIZONTAL);

        MaterialButton btnFour = new MaterialButton(activity);
        btnFour.setText("4");
        btnFour.setWidth((widthPixels - 80) / 3);
        btnFour.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "4"));

        MaterialButton btnFive = new MaterialButton(activity);
        btnFive.setText("5");
        btnFive.setWidth((widthPixels - 80) / 3);
        btnFive.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "5"));

        MaterialButton btnSix = new MaterialButton(activity);
        btnSix.setText("6");
        btnSix.setWidth((widthPixels - 80) / 3);
        btnSix.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "6"));

        btnFour.setLayoutParams(buttonParams);
        btnFive.setLayoutParams(buttonParams);
        btnSix.setLayoutParams(buttonParams);
        linearLayoutThree.addView(btnFour);
        linearLayoutThree.addView(btnFive);
        linearLayoutThree.addView(btnSix);
        layout.addView(linearLayoutThree);
        // 第四行
        LinearLayout linearLayoutFour = new LinearLayout(activity);
        linearLayoutFour.setOrientation(LinearLayout.HORIZONTAL);

        MaterialButton btnSeven = new MaterialButton(activity);
        btnSeven.setText("7");
        btnSeven.setWidth((widthPixels - 80) / 3);
        btnSeven.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "7"));

        MaterialButton btnEight = new MaterialButton(activity);
        btnEight.setText("8");
        btnEight.setWidth((widthPixels - 80) / 3);
        btnEight.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "8"));

        MaterialButton btnNight = new MaterialButton(activity);
        btnNight.setText("9");
        btnNight.setWidth((widthPixels - 80) / 3);
        btnNight.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "9"));

        btnSeven.setLayoutParams(buttonParams);
        btnEight.setLayoutParams(buttonParams);
        btnNight.setLayoutParams(buttonParams);
        linearLayoutFour.addView(btnSeven);
        linearLayoutFour.addView(btnEight);
        linearLayoutFour.addView(btnNight);
        layout.addView(linearLayoutFour);
        // 第五行
        LinearLayout linearLayoutFive = new LinearLayout(activity);
        linearLayoutFive.setOrientation(LinearLayout.HORIZONTAL);

        MaterialButton btnPoint = new MaterialButton(activity);
        btnPoint.setText(".");
        btnPoint.setWidth((widthPixels - 80) / 3);
        btnPoint.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "."));

        MaterialButton btnZero = new MaterialButton(activity);
        btnZero.setText("0");
        btnZero.setWidth((widthPixels - 80) / 3);
        btnZero.setOnClickListener(view -> inputResult.setText(inputResult.getText() + "0"));

        MaterialButton btnSure = new MaterialButton(activity);
        btnSure.setText("确认");
        btnSure.setWidth((widthPixels - 80) / 3);
        //TODO: 确认点击事件

        btnPoint.setLayoutParams(buttonParams);
        btnZero.setLayoutParams(buttonParams);
        btnSure.setLayoutParams(buttonParams);
        linearLayoutFive.addView(btnPoint);
        linearLayoutFive.addView(btnZero);
        linearLayoutFive.addView(btnSure);
        layout.addView(linearLayoutFive);

        againBtn.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        delBtn.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        clearBtn.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnSeven.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnEight.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnNight.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnOne.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnTwo.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnThree.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnFour.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnFive.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnSix.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnPoint.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnZero.setBackground(activity.getDrawable(R.drawable.keyboar_background));
        btnSure.setBackground(activity.getDrawable(R.drawable.keyboar_background));

    }
}
