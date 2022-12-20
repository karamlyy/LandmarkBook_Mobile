package com.example.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.landmarkbook.databinding.ActivityDetailsBinding;
import com.example.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArrayList;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarkArrayList = new ArrayList<>();

        Landmark qiz_qalasi = new Landmark("Qiz Qalasi", "Azerbaijan", R.drawable.qiz_qalasi);
        Landmark eiffel = new Landmark("Eiffel Tower", "France", R.drawable.eiffel);
        Landmark great_wall = new Landmark("Great Wall of Chine", "Chine", R.drawable.great_wall);
        Landmark sheki_khan = new Landmark("Sheki Khan Sarayi", "Azerbaijan", R.drawable.sheki_khan);

        landmarkArrayList.add(qiz_qalasi);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(great_wall);
        landmarkArrayList.add(sheki_khan);



        //RecyclerView

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}