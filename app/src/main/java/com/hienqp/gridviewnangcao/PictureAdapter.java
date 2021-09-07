package com.hienqp.gridviewnangcao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class PictureAdapter extends BaseAdapter {
    private Context context;
    private List<Picture> pictureList;
    private int itemTemplate;

    public PictureAdapter(Context context, int itemTemplate, List<Picture> pictureList) {
        this.context = context;
        this.pictureList = pictureList;
        this.itemTemplate = itemTemplate;
    }

    @Override
    public int getCount() {
        return pictureList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imageViewPicture;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(itemTemplate, null);
            viewHolder.imageViewPicture = (ImageView) convertView.findViewById(R.id.imageview_item);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Picture picture = pictureList.get(position);
        viewHolder.imageViewPicture.setImageResource(picture.getPictureID());

        return convertView;
    }
}
