package com.baitaptransition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Tree tree = (Tree) getIntent().getSerializableExtra("TREE");
        ImageView imageView = findViewById(R.id.imageView2);
        int imageId = this.getMipmapResIdByName(tree.getFile());
        imageView.setImageResource(imageId);
        findViewById(R.id.button2).setOnClickListener(v -> finish());
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = this.getPackageName();
        // Return 0 if not found.
        int resID = this.getResources().getIdentifier(resName , "mipmap", pkgName);
        return resID;
    }
}