package com.example.assignment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class HomeFragment extends Fragment {
    private ListView lvWatch;
    String listWatch[] = {"Tourbillion Gold", "Zeitwerk Date"};
    int listImage[] = {R.drawable.watch_1, R.drawable.watch_2};
    int listPrice[] = {4250, 3050};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        lvWatch = root.findViewById(R.id.lvWatch);
        WatchAdapter watchAdapter = new WatchAdapter(getActivity(), listImage, listWatch, listPrice);
        lvWatch.setAdapter(watchAdapter);

        return root;
    }
}