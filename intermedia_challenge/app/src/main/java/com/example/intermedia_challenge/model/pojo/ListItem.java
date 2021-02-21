package com.example.intermedia_challenge.model.pojo;

public class ListItem {

    //temporary
    private int mItemImageResource;
    private String mItemTitle;
    private String mItemDescription;

    public ListItem(int imageResource, String itemTitle, String itemDescription){
        mItemImageResource = imageResource;
        mItemTitle = itemTitle;
        mItemDescription = itemDescription;
    }

    public int getItemImageResource() {
        return mItemImageResource;
    }

    public String getItemTitle() {
        return mItemTitle;
    }

    public String getItemDescription() {
        return mItemDescription;
    }
}
