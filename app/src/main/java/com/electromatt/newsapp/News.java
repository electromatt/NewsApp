package com.electromatt.newsapp;

public class News {

    private String mTitle;
    private String mUrl;
    private String mDate;


    public News(String title, String url, String date){
        mTitle=title;
        mUrl=url;
        mDate=date;
    }
    public String getTitle(){ return mTitle; }
    public String getUrl(){ return mUrl; }
    public String getDate(){ return mDate; }
}
