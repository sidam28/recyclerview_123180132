package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Integer> imageTeam = new ArrayList<Integer>();
    private ArrayList<Integer> jerseyTeam = new ArrayList<Integer>();
    private ArrayList<String> namaTeam = new ArrayList<>();
    private ArrayList<String> courtTeam = new ArrayList<>();
    private ArrayList<String> teamDetail = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<Integer> imageTeam,ArrayList<Integer> jerseyTeam, ArrayList<String> namaTeam, ArrayList<String> courtTeam, ArrayList<String> teamDetail, Context context) {
        this.imageTeam = imageTeam;
        this.jerseyTeam = jerseyTeam;
        this.namaTeam = namaTeam;
        this.courtTeam = courtTeam;
        this.teamDetail = teamDetail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(imageTeam.get(position)).into(holder.imageViewBasketball);

        holder.textViewBasketball.setText(namaTeam.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, imageTeam.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_team", imageTeam.get(position));
                intent.putExtra("jersey_team", jerseyTeam.get(position));
                intent.putExtra("nama_team", namaTeam.get(position));
                intent.putExtra("court_team", courtTeam.get(position));
                intent.putExtra("detail_team", teamDetail.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaTeam.size();
    }

    public class ViewHolder extends RecyclerView
            .ViewHolder{
        CircleImageView imageViewBasketball;
        TextView textViewBasketball;
        ConstraintLayout constraintLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewBasketball = itemView.findViewById(R.id.iv_basketball_team);
            textViewBasketball = itemView.findViewById(R.id.tv_nama_team);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
