package com.example.administrator.xubotao20170504.Adater;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.xubotao20170504.Bean.DataBean;
import com.example.administrator.xubotao20170504.R;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 10:12
 */

public class HomeAdater extends RecyclerView.Adapter<HomeAdater.MyHodle>{
    private final Context context;
    private final List<DataBean> dataBeanList;

    public HomeAdater(Context context, List<DataBean> dataBeanList) {
        this.context = context;
        this.dataBeanList = dataBeanList;
    }

    @Override
    public MyHodle onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false);
        MyHodle myHodle = new MyHodle(view);
        return myHodle;
    }

    @Override
    public void onBindViewHolder(MyHodle holder, int position) {
        ImageLoader.getInstance().displayImage(dataBeanList.get(position).getImg(),holder.img);
        holder.title.setText(dataBeanList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dataBeanList.size();
    }

    public class MyHodle extends RecyclerView.ViewHolder {
        ImageView img;
        TextView title;
        public MyHodle(View itemView) {
            super(itemView);
            img= (ImageView) itemView.findViewById(R.id.rv_img);
            title= (TextView) itemView.findViewById(R.id.rv_title);
        }
    }
}
