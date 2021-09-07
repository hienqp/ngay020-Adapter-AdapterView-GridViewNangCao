package com.hienqp.gridviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Picture> arrayListPicture;
    PictureAdapter adapterPicture;
    GridView gridViewPicture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapterPicture = new PictureAdapter(MainActivity.this, R.layout.item_template, arrayListPicture);
        gridViewPicture.setAdapter(adapterPicture);
        
        gridViewPicture.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayListPicture.get(position).getPictureName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void AnhXa() {
        gridViewPicture = (GridView) findViewById(R.id.gridview_picture);
        arrayListPicture = new ArrayList<>();
        arrayListPicture.add(new Picture("Hình số 1", R.drawable.pic1));
        arrayListPicture.add(new Picture("Hình số 2", R.drawable.pic2));
        arrayListPicture.add(new Picture("Hình số 3", R.drawable.pic3));
        arrayListPicture.add(new Picture("Hình số 4", R.drawable.pic4));
        arrayListPicture.add(new Picture("Hình số 5", R.drawable.pic5));
        arrayListPicture.add(new Picture("Hình số 6", R.drawable.pic6));
        arrayListPicture.add(new Picture("Hình số 7", R.drawable.pic7));
        arrayListPicture.add(new Picture("Hình số 8", R.drawable.pic8));
        arrayListPicture.add(new Picture("Hình số 9", R.drawable.pic9));
    }
}