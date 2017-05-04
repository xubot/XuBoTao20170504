package com.example.administrator.xubotao20170504.Adater;

import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.administrator.xubotao20170504.Bean.DataBean;
import com.example.administrator.xubotao20170504.R;
import com.example.administrator.xubotao20170504.ShowActivity;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 10:53
 */

public class LAdVater extends BaseAdapter {
    private final ShowActivity showActivity;
    private final List<DataBean> dataBeanList;
    private int TYPE1=0;
    private int TYPE2=1;

    public LAdVater(ShowActivity showActivity, List<DataBean> dataBeanList) {
        this.showActivity = showActivity;
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
    public int getItemViewType(int position) {
        if(position%2==0){
            return TYPE1;
        }else {
            return TYPE2;
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int itemViewType = getItemViewType(position);
        if(itemViewType==TYPE1){
            convertView=View.inflate(showActivity, R.layout.lv_item_one,null);
            ImageView lv_img= (ImageView) convertView.findViewById(R.id.lv_img);
            TextView  lv_tv= (TextView) convertView.findViewById(R.id.lv_tv);
            ImageLoader.getInstance().displayImage(dataBeanList.get(position).getImg(),lv_img);
            lv_tv.setText(dataBeanList.get(position).getTitle());
        }else {
            convertView=View.inflate(showActivity, R.layout.lv_item_twe,null);
            TextView  lv_name= (TextView) convertView.findViewById(R.id.lv_name);
            lv_name.setText(dataBeanList.get(position).getTitle());
        }
        return convertView;
    }
}
