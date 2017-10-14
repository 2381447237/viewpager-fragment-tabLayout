package com.youli.testfragmentandvp2017_10_13.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.youli.testfragmentandvp2017_10_13.R;
import com.youli.testfragmentandvp2017_10_13.entity.Content;

import java.util.List;

/**
 * 作者: zhengbin on 2017/10/14.
 * <p>
 * 邮箱:2381447237@qq.com
 * <p>
 * github:2381447237
 */

public class LvAdapter extends BaseAdapter{

    private List<Content> data;
    private Context context;

    public LvAdapter(Context context, List<Content> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }


    @Override
    public Object getItem(int position) {
        return data.get(position);
    }


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh;

        if(convertView==null){

            vh=new ViewHolder();

            convertView=LayoutInflater.from(context).inflate(R.layout.item_lv,null);

            vh.tvTitle= (TextView) convertView.findViewById(R.id.tv_item);

            convertView.setTag(vh);
        }else{

            vh= (ViewHolder) convertView.getTag();

        }

        Content c=data.get(position);

        vh.tvTitle.setText(c.getTitle());

        return convertView;
    }

    class ViewHolder{

        TextView tvTitle;

    }

}
