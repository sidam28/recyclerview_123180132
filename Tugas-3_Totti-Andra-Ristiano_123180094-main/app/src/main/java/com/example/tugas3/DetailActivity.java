package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView ivLogoTeam,ivJerseyTeam;
    TextView tvDetailTeam,tvNamaTeamDetail, tvArena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivLogoTeam = findViewById(R.id.iv_logo_team);
        ivJerseyTeam = findViewById(R.id.iv_jersey_team);
        tvNamaTeamDetail = findViewById(R.id.tv_nama_team_detail);
        tvArena = findViewById(R.id.tv_arena);
        tvDetailTeam = findViewById(R.id.tv_detail_team);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("image_team") && getIntent().hasExtra("nama_team") && getIntent().hasExtra("court_team")){
            Integer imageTeam = getIntent().getIntExtra("image_team",0);
            Integer jerseyTeam = getIntent().getIntExtra("jersey_team",0);
            String namaTeam = getIntent().getStringExtra("nama_team");
            String courtTeam = getIntent().getStringExtra("court_team");
            String detailTeam = getIntent().getStringExtra("detail_team");

            setDataActivity(imageTeam, jerseyTeam, namaTeam, courtTeam, detailTeam);
        }
    }

    private void setDataActivity(Integer imageTeam,Integer jerseyTeam, String namaTeam, String courtTeam, String detailTeam){
        Glide.with(this).asBitmap().load(imageTeam).into(ivLogoTeam);

        Glide.with(this).asBitmap().load(jerseyTeam).into(ivJerseyTeam);

        tvNamaTeamDetail.setText(namaTeam);

        tvArena.setText(courtTeam);

        tvDetailTeam.setText(detailTeam);
    }
}