package com.example.lizard.adapters;

/*
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lizard.R;
import com.example.lizard.models.Picture;

import java.util.ArrayList;
import java.util.List;

public class GalleryItemAdapter extends RecyclerView.Adapter<GalleryItemAdapter.GalleryItemLViewHolder> {

    public interface ItemSelectedChangeListener{
        void onItemSelectedChange(int number);
    }

    private ItemSelectedChangeListener listener;

    private List<Picture> pictures;
    private Context context;
    private List<Picture> picturesSelected;
    int count = 0;

    public GalleryItemAdapter(Context context,List<Picture>,ItemSelectedChangeListener listener){
        this.context = context;
        this.pictures = pictures;
        this.listener = listener;
        this.picturesSelected = new ArrayList<>();
    }

    @NonNull
    @Override
    public GalleryItemLViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.image_gallery_picture,ViewGroup,false);

        return new GalleryItemLViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryItemLViewHolder holder, int position) {
        GalleryItemLViewHolder.bind(pictures.get(i),i);
    }

    @Override
    public int getItemCount(){
        return pictures.size();
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class GalleryItemLViewHolder extends RecyclerView.ViewHolder{
        ImageView imageViewPictureItem;
        TextView textViewSelectedCount;
        ConstraintLayout constraintLayoutItemGallery;


        public GalleryItemLViewHolder(View itemView) {
            super(itemView);
            imageViewPictureItem = itemView.findViewById(R.id.imageViewPictureItem);
            textViewSelectedCount = itemView.findViewById(R.id.item_gallery_select_count);
            constraintLayoutItemGallery = itemView.findViewById(R.id.ite)

        }

    }
}
*/