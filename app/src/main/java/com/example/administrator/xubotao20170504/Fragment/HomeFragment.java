package com.example.administrator.xubotao20170504.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.xubotao20170504.Adater.HomeAdater;
import com.example.administrator.xubotao20170504.Bean.DataBean;
import com.example.administrator.xubotao20170504.Bean.News;
import com.example.administrator.xubotao20170504.R;
import com.example.administrator.xubotao20170504.Uitls.DataInterface;
import com.example.administrator.xubotao20170504.Uitls.GlideImageLoader;
import com.example.administrator.xubotao20170504.Uitls.OkHttp;
import com.google.gson.Gson;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 09:12
 */

public class HomeFragment extends Fragment implements DataInterface{
    private List<String> imgList=new ArrayList<>();
    private List<DataBean> dataBeanList=new ArrayList<>();
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, null);
        String path="http://news-at.zhihu.com/api/4/news/latest";
        OkHttp.okhttp(path,this);
        final SwipeRefreshLayout srl= (SwipeRefreshLayout) view.findViewById(R.id.srl);
        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                srl.setRefreshing(true);
                setBanner();
                setRecycleView();
                ( new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        srl.setRefreshing(false);
                    }
                }, 2000);
            }
        });
        return view;
    }

    @Override
    public void setData(String vaule) {
        Log.d("zzz", vaule);
        Gson gson = new Gson();
        News news = gson.fromJson(vaule, News.class);
        List<News.TopStoriesBean> top_stories = news.getTop_stories();
        List<News.StoriesBean> stories = news.getStories();
        for(News.TopStoriesBean ts:top_stories){
            String image = ts.getImage();
            imgList.add(image);
        }
        for(News.StoriesBean sb:stories){
            List<String> images = sb.getImages();
            String img = images.get(0);
            String title = sb.getTitle();
            dataBeanList.add(new DataBean(title,img));
        }
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                setBanner();
                setRecycleView();
            }
        });
    }
    private void setBanner() {
        Banner banner= (Banner) view.findViewById(R.id.banner);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(imgList);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }

    private void setRecycleView() {
        RecyclerView recyclerView= (RecyclerView) view.findViewById(R.id.rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        HomeAdater homeAdater = new HomeAdater(getActivity(),dataBeanList);
        recyclerView.setAdapter(homeAdater);
    }
}
