package com.feiwuya.yunkao_android.frame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.feiwuya.yunkao_android.QuickCalActivity;
import com.feiwuya.yunkao_android.R;
import com.feiwuya.yunkao_android.pojo.QuickCalSettings;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link QuickCalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class QuickCalFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public QuickCalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment QuickCalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static QuickCalFragment newInstance(String param1, String param2) {
        QuickCalFragment fragment = new QuickCalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quick_cal, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        List<Button> selectedBtn = new ArrayList<>();
        Button btn1 = view.findViewById(R.id.p_btn1);
        Button btn2 = view.findViewById(R.id.p_btn2);
        Button btn3 = view.findViewById(R.id.p_btn3);
        Button btn4 = view.findViewById(R.id.p_btn4);
        Button btn5 = view.findViewById(R.id.p_btn5);
        Button btn6 = view.findViewById(R.id.p_btn6);
        Button btn7 = view.findViewById(R.id.p_btn7);
        Button btn8 = view.findViewById(R.id.p_btn8);
        Button btn9 = view.findViewById(R.id.p_btn9);
        Button btn10 = view.findViewById(R.id.p_btn10);
        Button btn11 = view.findViewById(R.id.p_btn11);
        Button btn12 = view.findViewById(R.id.p_btn12);
        Button btn13 = view.findViewById(R.id.p_btn13);
        Button btn14 = view.findViewById(R.id.p_btn14);
        Button btn15 = view.findViewById(R.id.p_btn15);
        Button btn16 = view.findViewById(R.id.p_btn16);
        Button settingNumBtn = view.findViewById(R.id.p_setting_num);
        Button showHistoryBtn = view.findViewById(R.id.show_history);
        Button beginBtn = view.findViewById(R.id.begin_cal_btn);
        TextView proNumText = view.findViewById(R.id.pro_num);

        // 点击题量选择弹出选择框
        String[] items = {"快速模式（题量：10）", "正常模式（题量：15）"};
        int[] num = {10}; // 题量设置
        settingNumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(getContext());
                materialAlertDialogBuilder
                        .setTitle("题量选择")
                        .setSingleChoiceItems(items, 0, (dialogInterface, i) -> {
                            if (i == 0) {
                                num[0] = 10;
                            } else {
                                num[0] = 15;
                            }
                        })
                        .setNegativeButton("取消", null)
                        .setPositiveButton("确定", (dialogInterface, i) -> proNumText.setText("题量:" + num[0]))
                        .show();
            }
        });
        // 选中颜色更换
        btn1.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn1);
            btn1.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn1.setTextColor(Color.BLACK); // 字体颜色
        });
        btn2.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn2);
            btn2.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn2.setTextColor(Color.BLACK); // 字体颜色
        });
        btn3.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn3);
            btn3.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn3.setTextColor(Color.BLACK); // 字体颜色
        });
        btn4.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn4);
            btn4.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn4.setTextColor(Color.BLACK); // 字体颜色
        });
        btn5.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn5);
            btn5.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn5.setTextColor(Color.BLACK); // 字体颜色
        });
        btn6.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn6);
            btn6.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn6.setTextColor(Color.BLACK); // 字体颜色
        });
        btn7.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn7);
            btn7.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn7.setTextColor(Color.BLACK); // 字体颜色
        });
        btn8.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn8);
            btn8.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn8.setTextColor(Color.BLACK); // 字体颜色
        });
        btn9.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn9);
            btn9.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn9.setTextColor(Color.BLACK); // 字体颜色
        });
        btn10.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn10);
            btn10.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn10.setTextColor(Color.BLACK); // 字体颜色
        });
        btn11.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn11);
            btn11.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn11.setTextColor(Color.BLACK); // 字体颜色
        });
        btn12.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn12);
            btn12.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn12.setTextColor(Color.BLACK); // 字体颜色
        });
        btn13.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn13);
            btn13.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn13.setTextColor(Color.BLACK); // 字体颜色
        });
        btn14.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn14);
            btn14.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn14.setTextColor(Color.BLACK); // 字体颜色
        });
        btn15.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn15);
            btn15.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn15.setTextColor(Color.BLACK); // 字体颜色
        });
        btn16.setOnClickListener(view1 -> {
            if (selectedBtn.size() != 0) {
                Button removeBtn = selectedBtn.remove(0);
                removeBtn.setTextColor(Color.WHITE);
                removeBtn.setBackgroundColor(Color.BLUE);
            }
            selectedBtn.add(btn16);
            btn16.setBackgroundColor(Color.MAGENTA); // 背景颜色
            btn16.setTextColor(Color.BLACK); // 字体颜色
        });
        // 点击开始练习
        beginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), QuickCalActivity.class);
                Button button = selectedBtn.get(0);
                // 题型
                if (button.getId() == R.id.p_btn1)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 1, 28, 22, 18, 0));
                if (button.getId() == R.id.p_btn2)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 2, 28, 22, 18, 0));
                if (button.getId() == R.id.p_btn3)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 3, 38, 30, 24, 0));
                if (button.getId() == R.id.p_btn4)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 4, 38, 30, 24, 0));
                if (button.getId() == R.id.p_btn5)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 5, 40, 32, 26, 0));
                if (button.getId() == R.id.p_btn6)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 6, 90, 75, 60, 0));
                if (button.getId() == R.id.p_btn7)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 7, 38, 30, 24, 0));
                if (button.getId() == R.id.p_btn8)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 8, 60, 50, 40, 0));
                if (button.getId() == R.id.p_btn9)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 9, 38, 30, 24, 0));
                if (button.getId() == R.id.p_btn10)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 10, 38, 30, 24, 0));
                if (button.getId() == R.id.p_btn11)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 11, 90, 75, 60, 0));
                if (button.getId() == R.id.p_btn12)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 12, 28, 22, 18, 0));
                if (button.getId() == R.id.p_btn13)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 13, 38, 30, 24, 0.01f));
                if (button.getId() == R.id.p_btn14)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 14, 90, 75, 60, 0.03f));
                if (button.getId() == R.id.p_btn15)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 15, 48, 40, 32, 0.05f));
                if (button.getId() == R.id.p_btn16)
                    intent.putExtra("calSettings", new QuickCalSettings(num[0], 16, 90, 75, 60, 0.03f));
                startActivity(intent);
            }
        });
    }
}