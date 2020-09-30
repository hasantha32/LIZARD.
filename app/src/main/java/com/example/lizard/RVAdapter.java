package com.example.lizard;

import android.provider.MediaStore;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolderClass>{

    ArrayList<ModelClass>objectModelClassList;

    private RecyclerViewClickInterface recyclerViewClickInterface;

    public RVAdapter(ArrayList<ModelClass> objectModelClassList, RecyclerViewClickInterface recyclerViewClickInterface){
        this.objectModelClassList = objectModelClassList;
        this.recyclerViewClickInterface = recyclerViewClickInterface;
    }

    /**/
    @NonNull
    @Override
    public RVViewHolderClass onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new RVViewHolderClass(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_new,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolderClass rvViewHolderClass, int i) {
        ModelClass objectModelClass = objectModelClassList.get(i);
        rvViewHolderClass.imageNameTV.setText(objectModelClass.getImageName());

        rvViewHolderClass.objectImageView.setImageBitmap(objectModelClass.getImage());
    }

    @Override
    public int getItemCount() {
        return objectModelClassList.size();
    }

    public static class RVViewHolderClass extends RecyclerView.ViewHolder{
        TextView imageNameTV;
        ImageView objectImageView;
        private showImages recyclerViewClickInterface;

        public RVViewHolderClass(@NonNull View itemView){
            super(itemView);
            imageNameTV=itemView.findViewById(R.id.sr_imageDetailsTV);
            objectImageView= itemView.findViewById(R.id.sr_imageTV);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recyclerViewClickInterface.onItemClick(getAdapterPosition());
                }
            });//  itemView.setOnClickListener(n

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
              //       imageNameTV.remove(getAdapterPosition());
              //       objectImageView.remove(getAdapterPosition());

                    recyclerViewClickInterface.onLongItemClick(getAdapterPosition());



                     return true;
                }
            });{

            }//itemView.setOnLongClickListener
            }// public RVViewHolderClass(@NonNull View itemView){

        }



}//class
/* objectModelClassList*/