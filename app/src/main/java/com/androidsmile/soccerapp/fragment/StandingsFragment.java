package com.androidsmile.soccerapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidsmile.soccerapp.R;
import com.androidsmile.soccerapp.adapter.StandingsAdapter;
import com.androidsmile.soccerapp.app.Api;
import com.androidsmile.soccerapp.app.App;
import com.androidsmile.soccerapp.standings.StandingDatum;
import com.androidsmile.soccerapp.standings.StandingsResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StandingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StandingsFragment extends Fragment {

    final int SEASON_ID = 7953;

    Api api;
    RecyclerView recycler;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public StandingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StandingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StandingsFragment newInstance(String param1, String param2) {
        StandingsFragment fragment = new StandingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_standings, container, false);

        recycler = (RecyclerView) view.findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));

        getStandings();

        return view;
    }

    private void getStandings(){

        api = App.getApi();
        api.getStandings(SEASON_ID).enqueue(new Callback<StandingsResult>() {
            @Override
            public void onResponse(Call<StandingsResult> call, Response<StandingsResult> response) {
                StandingsResult standingsResult = response.body();
                showStandings(standingsResult.getData().get(0).getStandings().getData());
            }

            @Override
            public void onFailure(Call<StandingsResult> call, Throwable t) {

            }
        });

    }

    private void showStandings(List<StandingDatum> standings){
        StandingsAdapter adapter = new StandingsAdapter(standings);
        recycler.setAdapter(adapter);
    }

}
