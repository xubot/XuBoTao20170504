package com.example.administrator.xubotao20170504.Adater;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.administrator.xubotao20170504.Bean.DataBean;
import com.example.administrator.xubotao20170504.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 10:32
 */

public class GVAdater extends BaseAdapter {
    private final FragmentActivity activity;
    private final List<DataBean> dataBeanList;

    public GVAdater(FragmentActivity activity, List<DataBean> dataBeanList) {
        this.activity = activity;
        this.dataBeanList = dataBeanList;
    }

    @Override
    public int getCount() {
        return dataBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=View.inflate(activity,R.layout.gv_item,null);
        ImageView gv_img= (ImageView) convertView.findViewById(R.id.gv_img);
        TextView gv_name= (TextView) convertView.findViewById(R.id.gv_name);
        ImageLoader.getInstance().displayImage(dataBeanList.get(position).getImg(),gv_img);
        gv_name.setText(dataBeanList.get(position).getTitle());
        return convertView;
    }
}
