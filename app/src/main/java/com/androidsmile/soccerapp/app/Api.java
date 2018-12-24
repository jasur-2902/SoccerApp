package com.androidsmile.soccerapp.app;

import com.androidsmile.soccerapp.standings.StandingsResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by joe on 06.09.17.
 */

public interface Api {

    @GET("standings/season/{seasonId}")
    Call<StandingsResult> getStandings(@Path("seasonId") int seasonId);

}
