package com.example.administrator.xubotao20170504;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.administrator.xubotao20170504.Adater.HomeAdater;
import com.example.administrator.xubotao20170504.Adater.LAdVater;
import com.example.administrator.xubotao20170504.Bean.DataBean;
import com.example.administrator.xubotao20170504.Bean.ShowNews;
import com.example.administrator.xubotao20170504.Uitls.DataInterface;
import com.example.administrator.xubotao20170504.Uitls.OkHttp;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ShowActivity extends AppCompatActivity implements DataInterface{
    private List<DataBean> dataBeanList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        String path="http://news-at.zhihu.com/api/4/theme/11";
        OkHttp.okhttp(path,this);
    }

    @Override
    public void setData(String vaule) {
        Log.d("zzz2", vaule);
        Gson gson = new Gson();
        ShowNews showNews = gson.fromJson(vaule, ShowNews.class);
        List<ShowNews.StoriesBean> stories = showNews.getStories();
        for(ShowNews.StoriesBean s:stories) {
            List<String> images = s.getImages();
            String imger = images.get(0);
            String title = s.getTitle();
            dataBeanList.add(new DataBean(title,imger));
        }
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                setAdaraer();
            }
        });
    }

    private void setAdaraer() {
        ListView listView= (ListView) findViewById(R.id.lv);
        listView.setAdapter(new LAdVater(ShowActivity.this,dataBeanList));
    }
}
