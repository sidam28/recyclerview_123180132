package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView ivLogo;
    TextView tvDetail,tvNama, tvGenre;


    private void getIncomingExtra(){
        if(getIntent().hasExtra("image_game") && getIntent().hasExtra("nama_game") && getIntent().hasExtra("genre_game")){
            Integer imageTeam = getIntent().getIntExtra("image_game",0);
            String namaTeam = getIntent().getStringExtra("nama_game");
            String courtTeam = getIntent().getStringExtra("genre_game");
            String detailTeam = getIntent().getStringExtra("detail_game");

            setDataActivity(imageTeam, namaTeam, courtTeam, detailTeam);
        }
    }

    private void setDataActivity(Integer image, String nama, String genre, String detail){

        Glide.with(this).asBitmap().load(image).into(ivLogo);


        tvNama.setText(nama);

        tvGenre.setText(genre);

        tvDetail.setText(detail);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {  //ke tampilan
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivLogo = findViewById(R.id.iv_logo_game);
        tvNama = findViewById(R.id.tv_nama_game);
        tvGenre = findViewById(R.id.tv_genre);
        tvDetail = findViewById(R.id.tv_detail);

        getIncomingExtra();
    }
}