package com.baitaptransition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TreeAdapter extends RecyclerView.Adapter {
    private List<Tree> listTree;

    private Context context;

    public TreeAdapter(List<Tree> listTree, Context context) {
        this.listTree = listTree;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View treeLayout = inflater.inflate(R.layout.item_tree, parent, false);
        ViewHolder viewHolder = new ViewHolder(treeLayout);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerView.ViewHolder holder, int position) {
        Tree tree = listTree.get(position);
        ViewHolder holder1 = (ViewHolder) holder;
        holder1.textViewName.setText(tree.getName());
        holder1.textViewPrice.setText(tree.getName());

        int imageId = this.getMipmapResIdByName(tree.getFile());
        holder1.imageView.setImageResource(imageId);
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        return resID;
    }

    @Override
    public int getItemCount() {
        return listTree.size();
    }
}
