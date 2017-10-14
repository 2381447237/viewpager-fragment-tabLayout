package com.youli.testfragmentandvp2017_10_13.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.youli.testfragmentandvp2017_10_13.R;

/**
 * 作者: zhengbin on 2017/10/13.
 * <p>
 * 邮箱:2381447237@qq.com
 * <p>
 * github:2381447237
 */

public class FragmentThree extends BaseFragment{

    TextView tv;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_three,container,false);
        Log.e("2017/10/14","333333333333333333333333333333333333");

        isViewCreated=true;

        return view;
    }

    @Override
    public void lazyLoadData() {

        if(isViewCreated){
            Log.e("2017/10/14","懒加载33333333333333333333333");
            tv= (TextView) view.findViewById(R.id.tv_f3);
            tv.setText("我是fragment3");
        }
    }

}
