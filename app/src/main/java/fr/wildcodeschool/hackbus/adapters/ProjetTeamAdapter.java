package fr.wildcodeschool.hackbus.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import fr.wildcodeschool.hackbus.R;
import fr.wildcodeschool.hackbus.models.ProjetModel;

public class ProjetTeamAdapter extends RecyclerView.Adapter<ProjetTeamAdapter.MyViewHolder> {

    private List<ProjetModel> projetTeamList;
    private Context ctx;


    public ProjetTeamAdapter(List<ProjetModel> projetTeamList, Context ctx) {
        this.projetTeamList = projetTeamList;
        this.ctx = ctx;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_projet_team, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final ProjetModel projetTeam = projetTeamList.get(position);
        holder.nom.setText(projetTeam.getNom());

    }

    @Override
    public int getItemCount() {
        return projetTeamList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nom;


        public MyViewHolder(View view) {
            super(view);
            nom = view.findViewById(R.id.tv_nom);
        }
    }
}