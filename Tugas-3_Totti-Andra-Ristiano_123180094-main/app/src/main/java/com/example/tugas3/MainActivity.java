package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> imageTeam = new ArrayList<Integer>();
    private ArrayList<Integer> jerseyTeam = new ArrayList<Integer>();
    private ArrayList<String> namaTeam = new ArrayList<>();
    private ArrayList<String> courtTeam = new ArrayList<>();
    private ArrayList<String> teamDetail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataTeamBasketball();
    }

    private void processRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rv_basketball);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageTeam, jerseyTeam, namaTeam, courtTeam, teamDetail,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataTeamBasketball(){
        namaTeam.add("Brooklyn Nets");
        imageTeam.add(R.drawable.img_tugas3_nets);
        jerseyTeam.add(R.drawable.nets_jersey);
        courtTeam.add("Barclays Center");
        teamDetail.add("The Brooklyn Nets are an American professional basketball team based in the New York City borough of Brooklyn. The Nets compete in the National Basketball Association as a member of the Atlantic Division of the Eastern Conference. The team plays its home games at Barclays Center.");

        namaTeam.add("Denver Nuggets");
        imageTeam.add(R.drawable.img_tugas3_nuggets);
        jerseyTeam.add(R.drawable.nuggets_jersey);
        courtTeam.add("Ball Arena");
        teamDetail.add("The Denver Nuggets are an American professional basketball team based in Denver. The Nuggets compete in the National Basketball Association as a member of the league's Western Conference Northwest Division.");

        namaTeam.add("Golden State Warriors");
        imageTeam.add(R.drawable.img_tugas3_warriors);
        jerseyTeam.add(R.drawable.warriors_jersey);
        courtTeam.add("Chase Center");
        teamDetail.add("The Golden State Warriors are an American professional basketball team based in San Francisco. The Warriors compete in the National Basketball Association, as a member of the league's Western Conference Pacific Division.");

        namaTeam.add("Los Angeles Lakers");
        imageTeam.add(R.drawable.img_tugas3_lakers);
        jerseyTeam.add(R.drawable.lakers_jersey);
        courtTeam.add("Staples Center");
        teamDetail.add("The Los Angeles Lakers are an American professional basketball team based in Los Angeles. The Lakers compete in the National Basketball Association as a member of the league's Western Conference Pacific Division.");

        namaTeam.add("Los Angeles Clippers");
        imageTeam.add(R.drawable.img_tugas3_clippers);
        jerseyTeam.add(R.drawable.clippers_jersey);
        courtTeam.add("Staples Center");
        teamDetail.add("The Los Angeles Clippers are an American professional basketball team based in Los Angeles. The Clippers compete in the National Basketball Association as a member of the Pacific Division in the league's Western Conference.");

        namaTeam.add("Miami Heat");
        imageTeam.add(R.drawable.img_tugas3_heat);
        jerseyTeam.add(R.drawable.heat_jersey);
        courtTeam.add("AmericanAirlines Arena");
        teamDetail.add("The Miami Heat are an American professional basketball team based in Miami. The Heat compete in the National Basketball Association as a member of the league's Eastern Conference Southeast Division. The club plays its home games at American Airlines Arena, and has won three NBA championships.");

        namaTeam.add("New York Knicks");
        imageTeam.add(R.drawable.img_tugas3_knicks);
        jerseyTeam.add(R.drawable.knicks_jersey);
        courtTeam.add("Madison Square Garden");
        teamDetail.add("The New York Knickerbockers, more commonly referred to as the New York Knicks, are an American professional basketball team based in the New York City borough of Manhattan. The Knicks compete in the National Basketball Association as a member of the Atlantic Division of the Eastern Conference.");

        namaTeam.add("Portland Trail Blazers");
        imageTeam.add(R.drawable.img_tugas3_trail);
        jerseyTeam.add(R.drawable.trail_jersey);
        courtTeam.add("Moda Center");
        teamDetail.add("The Portland Trail Blazers are an American professional basketball team based in Portland, Oregon. The Trail Blazers compete in the National Basketball Association as a member of the league's Western Conference Northwest Division.");

        processRecyclerViewAdapter();
    }
}