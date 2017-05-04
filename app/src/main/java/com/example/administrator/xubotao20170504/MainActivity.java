package com.example.administrator.xubotao20170504;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.xubotao20170504.Adater.HomeTypeAdater;
import com.example.administrator.xubotao20170504.Fragment.HomeFragment;
import com.example.administrator.xubotao20170504.Fragment.RBFragment;
import com.example.administrator.xubotao20170504.Fragment.RMFragment;
import com.example.administrator.xubotao20170504.Fragment.ZTFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] typeArr=new String[]{"最新日报","专栏","热门","主题日报"};
    private List<Fragment> fragmentList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //得到控件
        TabLayout tabLayout= (TabLayout) findViewById(R.id.tab);
        ViewPager vp= (ViewPager) findViewById(R.id.vp);
        setData();
        HomeTypeAdater homeTypeAdater = new HomeTypeAdater(getSupportFragmentManager(), MainActivity.this, fragmentList, typeArr);
        vp.setAdapter(homeTypeAdater);
        tabLayout.setupWithViewPager(vp);
    }

    private void setData() {
        HomeFragment homeFragment = new HomeFragment();
        ZTFragment ztFragment = new ZTFragment();
        RMFragment rmFragment = new RMFragment();
        RBFragment rbFragment = new RBFragment();
        fragmentList.add(homeFragment);
        fragmentList.add(ztFragment);
        fragmentList.add(rmFragment);
        fragmentList.add(rbFragment);
    }
}
