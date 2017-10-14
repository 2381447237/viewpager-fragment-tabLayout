package com.youli.testfragmentandvp2017_10_13.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.youli.testfragmentandvp2017_10_13.R;
import com.youli.testfragmentandvp2017_10_13.adapter.LvAdapter;
import com.youli.testfragmentandvp2017_10_13.entity.Content;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者: zhengbin on 2017/10/13.
 * <p>
 * 邮箱:2381447237@qq.com
 * <p>
 * github:2381447237
 */

public class FragmentOne extends BaseFragment{

    private ListView lv;
    private LvAdapter adapter;
    private List<Content> data=new ArrayList<>();
    private TextView tv;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_one,container,false);

        Log.e("2017/10/14","11111111111111111111111111111111");
        isViewCreated=true;
        return view;
    }

    @Override
    public void lazyLoadData() {

        if(isViewCreated){
            Log.e("2017/10/14","懒加载11111111111111111111111111111111");

            lv= (ListView) view.findViewById(R.id.lv);

            for(int i=1;i<25;i++){

                data.add(new Content("条目"+i));

            }

            adapter=new LvAdapter(getActivity(),data);

            lv.setAdapter(adapter);

            tv= (TextView) view.findViewById(R.id.tv_f1);
            tv.setText("我是fragment1");

        }
    }
}
