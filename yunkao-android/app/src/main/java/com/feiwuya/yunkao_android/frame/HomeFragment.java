package com.feiwuya.yunkao_android.frame;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.feiwuya.yunkao_android.R;
import com.feiwuya.yunkao_android.util.CommonEnum;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private Banner homeBanner;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        homeBanner = getView().findViewById(R.id.home_banner);
//         =======================================

//         =======================================
        List<String> bannerList = new ArrayList<>();
        // :TODO 轮播图设置
        bannerList.add("https://p3.ssl.qhimgs1.com/t017e6730377e3c2003.jpg");
        bannerList.add("https://p1.ssl.qhimgs1.com/sdr/400__/t01da8cfe1feec230cb.jpg");
        bannerList.add("https://wallpaperm.cmcm.com/5209f7770b558faf5dccf56e416eb14e.jpg");
        bannerList.add("https://wallpaperm.cmcm.com/741908106926470dd8a298a6fda66189.jpg");
        homeBanner.setAdapter(new BannerImageAdapter<String>(bannerList) {
            @Override
            public void onBindView(BannerImageHolder holder, String data, int position, int size) {
                Glide.with(holder.itemView).load(data).apply(RequestOptions.bitmapTransform(new RoundedCorners(30))).into(holder.imageView);
            }
        }).addBannerLifecycleObserver(this).setBannerRound(30).setIndicator(new CircleIndicator(getContext()));
    }
}