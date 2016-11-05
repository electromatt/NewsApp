package com.electromatt.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        String newsTitle = currentNews.getTitle();
        TextView titleView = (TextView) listItemView.findViewById(R.id.news_title);
        titleView.setText(newsTitle);

        String newsDate = currentNews.getDate();
        TextView authorView = (TextView) listItemView.findViewById(R.id.news_date);
        authorView.setText(newsDate);

        return listItemView;
    }
}
