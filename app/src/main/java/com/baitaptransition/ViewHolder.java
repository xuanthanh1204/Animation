package com.baitaptransition;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ViewHolder extends RecyclerView.ViewHolder {
    private View itemview;
    public ImageView imageView;
    public TextView textViewName, textViewPrice;

    public ViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        this.itemview = itemView;
        imageView = itemView.findViewById(R.id.imgViewItem);
        textViewName = itemView.findViewById(R.id.tvItemName);
        textViewPrice = itemView.findViewById(R.id.tvItemPrice);
    }
}