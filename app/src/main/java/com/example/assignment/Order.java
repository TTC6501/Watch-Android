package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Order extends AppCompatActivity {

    private ListView lvOrder;
    String listWatch[] = {"Tourbillion Gold", "Zeitwerk Date"};
    int listImage[] = {R.drawable.watch_1, R.drawable.watch_2};
    int listPrice[] = {4250, 3050};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        lvOrder = findViewById(R.id.lvOrder);
        WatchAdapter watchAdapter = new WatchAdapter(getApplication(), listImage, listWatch, listPrice);
        lvOrder.setAdapter(watchAdapter);
    }
}