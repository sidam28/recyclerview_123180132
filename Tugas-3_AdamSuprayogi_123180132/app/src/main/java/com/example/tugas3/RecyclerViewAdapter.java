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

    private ArrayList<Integer> imageGame = new ArrayList<Integer>();
    private ArrayList<String> namaGame = new ArrayList<>();
    private ArrayList<String> genreGame = new ArrayList<>();
    private ArrayList<String> detailGame = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<Integer> imageTeam, ArrayList<String> namaTeam, ArrayList<String> courtTeam, ArrayList<String> teamDetail, Context context) {
        this.imageGame = imageTeam;
        this.namaGame = namaTeam;
        this.genreGame = courtTeam;
        this.detailGame = teamDetail;
        this.context = context;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(imageGame.get(position)).into(holder.imageViewBasketball);

        holder.textViewBasketball.setText(namaGame.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                               // variabel ke detail activity
//                Toast.makeText(context, imageTeam.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("image_game", imageGame.get(position));
                intent.putExtra("nama_game", namaGame.get(position));
                intent.putExtra("genre_game", genreGame.get(position));
                intent.putExtra("detail_game", detailGame.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaGame.size();
    }

    public class ViewHolder extends RecyclerView  // ke view holder
            .ViewHolder{
        CircleImageView imageViewBasketball;
        TextView textViewBasketball;
        ConstraintLayout constraintLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewBasketball = itemView.findViewById(R.id.iv_logo_game);
            textViewBasketball = itemView.findViewById(R.id.tv_nama_game);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { //ketampilan
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
}
