package com.example.intermedia_challenge.view.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.intermedia_challenge.R;
import com.example.intermedia_challenge.model.pojo.ListItem;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private ArrayList<ListItem> mItemList;

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        public ImageView thumbnailImageView;
        public ProgressBar thumbnailProgressBar;
        public TextView cellNameTextView;
        public TextView cellDescriptionTextView;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            thumbnailImageView = itemView.findViewById(R.id.recylerCell_imageView_thumbnail);
            thumbnailProgressBar = itemView.findViewById(R.id.recyclerCell_progressbar);
            cellNameTextView = itemView.findViewById(R.id.recyclerCell_textView_name);
            cellDescriptionTextView = itemView.findViewById(R.id.recyclerCell_textView_description);
        }


        //method for saving space in onBindViewHolder..
        public void bindItem(ListItem listItem){
            //TODO set the information on it's corresponding textview/imageview.
            cellNameTextView.setText(listItem.getItemTitle());
            cellDescriptionTextView.setText(listItem.getItemDescription());
            thumbnailImageView.setImageResource(listItem.getItemImageResource());
        }


    }

    public RecyclerAdapter(ArrayList<ListItem> itemList){
        mItemList = itemList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cell,parent,false);
        RecyclerViewHolder rvh = new RecyclerViewHolder(view);
        return rvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        ListItem currentItem = mItemList.get(position);
        holder.bindItem(currentItem);
    }

    @Override
    public int getItemCount() {
        return mItemList.size();
    }


}
