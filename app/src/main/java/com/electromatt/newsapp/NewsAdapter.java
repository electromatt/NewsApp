package com.electromatt.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    static class ViewHolder {
        TextView title;
        TextView section;
        TextView date;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
            holder = new ViewHolder();
            holder.title = (TextView) listItemView.findViewById(R.id.news_title);
            holder.section = (TextView) listItemView.findViewById(R.id.news_section);
            holder.date = (TextView) listItemView.findViewById(R.id.date);
            listItemView.setTag(holder);
        } else{
            holder = (ViewHolder) listItemView.getTag();
        }
        News currentNews = getItem(position);
        holder.title.setText(currentNews.getTitle());
        holder.section.setText(currentNews.getSection());
        holder.date.setText(formatDate(currentNews.getDate()));
        return listItemView;
    }
    private String formatDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        Date convertedDate = new Date();
        try {
            convertedDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateFormat.format(convertedDate);
    }

}
