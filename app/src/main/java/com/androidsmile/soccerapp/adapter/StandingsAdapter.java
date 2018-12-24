package com.androidsmile.soccerapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidsmile.soccerapp.R;
import com.androidsmile.soccerapp.standings.StandingDatum;

import java.util.List;

/**
 * Created by joe on 07.09.17.
 */

public class StandingsAdapter extends RecyclerView.Adapter<StandingsAdapter.ViewHolder> {

    List<StandingDatum> standings;

    public StandingsAdapter(List<StandingDatum> standings) {
        this.standings = standings;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listitem_standing, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView position;
        TextView name;
        TextView matchesPlayed;
        TextView goalsFor;
        TextView goalsAgainst;
        TextView points;
        public ViewHolder(View view) {
            super(view);
            position = (TextView) view.findViewById(R.id.position);
            name = (TextView) view.findViewById(R.id.name);
            matchesPlayed = (TextView) view.findViewById(R.id.matches_played);
            goalsFor = (TextView) view.findViewById(R.id.goals_for);
            goalsAgainst = (TextView) view.findViewById(R.id.goals_against);
            points = (TextView) view.findViewById(R.id.points);
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        StandingDatum standingsDatum = standings.get(position);
        holder.position.setText(String.valueOf(standingsDatum.getPosition()));
        holder.name.setText(standingsDatum.getTeamName());
        holder.matchesPlayed.setText(String.valueOf(standingsDatum.getOverall().getGamesPlayed()));
        holder.goalsFor.setText(String.valueOf(standingsDatum.getOverall().getGoalsScored()));
        holder.goalsAgainst.setText(String.valueOf(standingsDatum.getOverall().getGoalsAgainst()));
        holder.points.setText(String.valueOf(standingsDatum.getPoints()));
    }

    @Override
    public int getItemCount() {
        return standings.size();
    }

}
