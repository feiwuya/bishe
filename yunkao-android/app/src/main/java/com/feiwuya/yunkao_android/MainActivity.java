package com.feiwuya.yunkao_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.feiwuya.yunkao_android.frame.HomeFragment;
import com.feiwuya.yunkao_android.frame.MyFragment;
import com.feiwuya.yunkao_android.frame.PracticeFragment;
import com.feiwuya.yunkao_android.frame.QuickCalFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        bottomNavigationView = findViewById(R.id.bottom_nav);
        // 解决导航过多只显示图片问题
        bottomNavigationView.setLabelVisibilityMode(NavigationBarView.LABEL_VISIBILITY_LABELED);
        /**
         * 底部导航栏点击事件
         */
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int selectedId = item.getItemId();
            if (selectedId == R.id.nav_home) {
                // 主页
                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new HomeFragment()).commit();
                return true;
            } else if (selectedId == R.id.nav_practice) {
                // 刷题页
                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new PracticeFragment()).commit();
                return true;
            } else if (selectedId == R.id.nav_quick_cal) {
                // 速算练习页
                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new QuickCalFragment()).commit();
                return true;
            } else if (selectedId == R.id.nav_my) {
                // 我的信息页
                getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, new MyFragment()).commit();
                return true;
            }
            return false;
        });
    }
}