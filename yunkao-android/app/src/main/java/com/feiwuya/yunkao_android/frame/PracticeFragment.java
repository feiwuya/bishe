package com.feiwuya.yunkao_android.frame;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.feiwuya.yunkao_android.R;
import com.feiwuya.yunkao_android.adapter.MyExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PracticeFragment extends Fragment {
    private ExpandableListView expandableListView;
    private ExpandableListAdapter expandableListAdapter;

    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;

    public PracticeFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_practice, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        expandableListView = getView().findViewById(R.id.expandableListView);
        prepareListData();
        expandableListAdapter = new MyExpandableListAdapter(getContext(), listDataHeader, listDataChild);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int groupPosition, int childPosition, long id) {
                String childText = listDataChild.get(listDataHeader.get(groupPosition)).get(childPosition);
                Toast.makeText(getContext(), childText, Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int groupPosition, long id) {
                if (expandableListView.isGroupExpanded(groupPosition)) {
                    expandableListView.collapseGroup(groupPosition);
                } else {
                    // 收缩其他组
                    int count = expandableListAdapter.getGroupCount();
                    for (int i = 0; i < count; i++) {
                        if (i != groupPosition) {
                            expandableListView.collapseGroup(i);
                        }
                    }
                    expandableListView.expandGroup(groupPosition);
                }
                return true;
            }
        });



    }
    private void prepareListData() {
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        listDataHeader.add("言语理解与表达");
        List<String> group1 = new ArrayList<>();
        group1.add("阅读理解");
        group1.add("语句表达");
        group1.add("逻辑填空");
        listDataChild.put(listDataHeader.get(0), group1);

        listDataHeader.add("数量关系");
        List<String> group2 = new ArrayList<>();
        group2.add("工程问题");
        group2.add("最值问题");
        group2.add("年龄问题");
        group2.add("和差倍比问题");
        group2.add("周期问题");
        group2.add("数列问题");
        group2.add("行程问题");
        group2.add("几何问题");
        group2.add("容斥原理问题");
        group2.add("排列组合问题");
        group2.add("概率问题");
        group2.add("经济利润问题");
        group2.add("不定方程问题");
        group2.add("统筹规划问题");
        group2.add("数学运算-其他");
        group2.add("公倍数和公约数问题");
        listDataChild.put(listDataHeader.get(1), group2);

        listDataHeader.add("判断推理");
        List<String> group3 = new ArrayList<>();
        group3.add("图形推理");
        group3.add("定义判断");
        group3.add("逻辑判断");
        group3.add("类比推理");
        listDataChild.put(listDataHeader.get(2), group3);
    }
}