package com.feiwuya.yunkao_android.frame;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.feiwuya.yunkao_android.R;

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
        TextView proNumText = view.findViewById(R.id.pro_num);

        // 点击题量选择弹出选择框
        settingNumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                String[] items = {"快速模式（题量：10）", "正常模式（题量：15）"};
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.out.println(i);
                    }
                });
                builder.show();
            }
        });

    }
}