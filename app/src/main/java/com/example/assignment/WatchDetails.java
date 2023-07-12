package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class WatchDetails extends AppCompatActivity {

    private ListView lvSimilarProduct;
    String listWatch[] = {"Tourbillion Gold", "Zeitwerk Date"};
    int listImage[] = {R.drawable.watch_1, R.drawable.watch_2};
    int listPrice[] = {4250, 3050};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_details);

        lvSimilarProduct = findViewById(R.id.lvSimilarProduct);
        WatchAdapter watchAdapter = new WatchAdapter(getApplication(), listImage, listWatch, listPrice);
        lvSimilarProduct.setAdapter(watchAdapter);
    }
}