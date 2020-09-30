package com.example.lizard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static androidx.core.os.LocaleListCompat.create;


public class showImages extends AppCompatActivity implements RecyclerViewClickInterface{

    private DatabaseHandler objectDatabaseHandler;
    private RecyclerView objectRecyclerview;
    private RVAdapter objectRVAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_images);

        try {
            objectRecyclerview = findViewById(R.id.imagesRV);
            objectDatabaseHandler = new DatabaseHandler(this);
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void getData(View view){
        try {
            objectRVAdapter = new RVAdapter(objectDatabaseHandler.getImagesData(),this);
            objectRecyclerview.setHasFixedSize(true);

            objectRecyclerview.setLayoutManager(new LinearLayoutManager(this));
            objectRecyclerview.setAdapter(objectRVAdapter);

        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onItemClick(int position) {
        Toast.makeText(this, "Long Press to delete selected item..." + position, Toast.LENGTH_SHORT).show();




    }

    @Override
    public void onLongItemClick(int position) {
     //   objectRVAdapter.remove(position);
        Toast.makeText(this, "Deleting ...", Toast.LENGTH_SHORT).show();

   /*     objectRecyclerview.remove(position);
        objectRVAdapter.notifyItemRemoved(position);
*/
    }
}
