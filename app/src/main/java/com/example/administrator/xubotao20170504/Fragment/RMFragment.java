package com.example.administrator.xubotao20170504.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.xubotao20170504.R;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/5/4 09:12
 */

public class RMFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rm, null);
        return view;
    }
}
