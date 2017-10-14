package com.youli.testfragmentandvp2017_10_13;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.youli.testfragmentandvp2017_10_13.adapter.MyFragmentPagerAdapter;
import com.youli.testfragmentandvp2017_10_13.fragment.FragmentOne;
import com.youli.testfragmentandvp2017_10_13.fragment.FragmentThree;
import com.youli.testfragmentandvp2017_10_13.fragment.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;
    private List<Fragment> fragmentList;
    private TabLayout tl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= (ViewPager) findViewById(R.id.viewPager);
        tl= (TabLayout) findViewById(R.id.tl);
        fragmentList=new ArrayList<>();
        fragmentList.add(new FragmentOne());
        fragmentList.add(new FragmentTwo());
        fragmentList.add(new FragmentThree());

        FragmentManager fm=getSupportFragmentManager();
        MyFragmentPagerAdapter fpAdapter=new MyFragmentPagerAdapter(fm,fragmentList);
        viewPager.setAdapter(fpAdapter);
        viewPager.setOffscreenPageLimit(3);
        tl.setupWithViewPager(viewPager);

        for(int i=0;i<tl.getTabCount();i++){
            TabLayout.Tab tab=tl.getTabAt(i);
            tab.setCustomView(getTabView(i));
        }
    }

    private View getTabView(int position){

        View view= LayoutInflater.from(this).inflate(R.layout.tab_item,null,false);

        ImageView iv= (ImageView) view.findViewById(R.id.tab_item_iv);
        TextView tv= (TextView) view.findViewById(R.id.tab_item_tv);
        iv.setImageResource(R.drawable.sel_image);
        tv.setText("Tab"+(position+1));
        return view;

    }

}
