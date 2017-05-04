package com.example.administrator.xubotao20170504.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.administrator.xubotao20170504.Adater.GVAdater;
import com.example.administrator.xubotao20170504.Bean.DataBean;
import com.example.administrator.xubotao20170504.Bean.OthersNews;
import com.example.administrator.xubotao20170504.R;
import com.example.administrator.xubotao20170504.ShowActivity;
import com.example.administrator.xubotao20170504.Uitls.DataInterface;
import com.example.administrator.xubotao20170504.Uitls.OkHttp;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 09:12
 */

public class RBFragment extends Fragment implements DataInterface{
    private List<DataBean> dataBeanList=new ArrayList<>();
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_rb, null);
        String path="http://news-at.zhihu.com/api/4/themes";
        OkHttp.okhttp(path,this);
        return view;
    }

    @Override
    public void setData(String vaule) {
        Log.d("zzz1", vaule);
        Gson gson = new Gson();
        OthersNews othersNews = gson.fromJson(vaule, OthersNews.class);
        List<OthersNews.OthersBean> others = othersNews.getOthers();
        for(OthersNews.OthersBean other:others) {
            String name = other.getName();
            String thumbnail = other.getThumbnail();
            dataBeanList.add(new DataBean(name,thumbnail));
        }
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getData();
            }
        });
    }

    public void getData() {
        GridView gv= (GridView) view.findViewById(R.id.gv);
        gv.setAdapter(new GVAdater(getActivity(),dataBeanList));
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getActivity(), ShowActivity.class));
            }
        });
    }
}
