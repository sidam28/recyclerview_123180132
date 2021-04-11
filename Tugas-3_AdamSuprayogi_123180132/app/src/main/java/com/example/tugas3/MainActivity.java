package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> imageGame = new ArrayList<Integer>();
    private ArrayList<String> namaGame = new ArrayList<>();
    private ArrayList<String> genreGame = new ArrayList<>();
    private ArrayList<String> detailGame = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataGame();
    }
    private void getDataGame(){
        namaGame.add("Aspalt");
        imageGame.add(R.drawable.aspalt);
        genreGame.add("Rancing, Driver");
        detailGame.add("Tear up the Asphalt in the ultimate console racing experience! Enjoy the intuitive TouchDrive controls as you take the wheel of the most prestigious dream cars across 70 gravity-defying tracks. Complete over 800 events in the solo Career mode and face up to 7 players in real time in multiplayer mode.");

        namaGame.add("Minecraft");
        imageGame.add(R.drawable.minecraft);
        genreGame.add("Adventure, Action");
        detailGame.add("Create anything you can imagine. Explore randomly generated worlds. Survive dangerous mobs at night. This collection includes the Minecraft base game and the Starter Pack compilation: Greek Mythology Mash-up, Plastic Texture Pack, Skin Pack 1, and Villains Skin Pack. Also get 700 Minecoins to use in the in-game Marketplace!");

        namaGame.add("Forza Horizon");
        imageGame.add(R.drawable.forzahorizon);
        genreGame.add("Rancing");
        detailGame.add("Forza Motorsport 7 is where Racers, Drifters, Drag Racers, Tuners, and Creators come together in a community devoted to everything automotive. Drive the cars of your dreams, with more than 700 amazing vehicles to choose from. Challenge yourself across 30 famous");
        processRecyclerViewAdapter();
    }
    private void processRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rv_game_seru);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(imageGame, namaGame, genreGame, detailGame,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}