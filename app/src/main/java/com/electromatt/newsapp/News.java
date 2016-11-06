package com.electromatt.newsapp;

public class News {

    private String mTitle;
    private String mSection;
    private String mUrl;
    private String mDate;

    public News(String title, String section, String url, String date){
        mTitle=title;
        mSection=section;
        mUrl=url;
        mDate=date;
    }
    public String getTitle(){ return mTitle; }
    public String getSection(){ return mSection; }
    public String getUrl(){ return mUrl; }
    public String getDate(){ return mDate; }
}