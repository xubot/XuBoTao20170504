package com.example.administrator.xubotao20170504.Adater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.xubotao20170504.MainActivity;

import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 09:16
 */

public class HomeTypeAdater extends FragmentPagerAdapter{
    private final FragmentManager supportFragmentManager;
    private final MainActivity mainActivity;
    private final List<Fragment> fragmentList;
    private final String[] typeArr;

    public HomeTypeAdater(FragmentManager supportFragmentManager, MainActivity mainActivity, List<Fragment> fragmentList, String[] typeArr) {
        super(supportFragmentManager);
        this.supportFragmentManager = supportFragmentManager;
        this.mainActivity = mainActivity;
        this.fragmentList = fragmentList;
        this.typeArr = typeArr;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return typeArr[position];
    }
}
