
package com.androidsmile.soccerapp.standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StandingsResultDatum {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("league_id")
    @Expose
    private Integer leagueId;
    @SerializedName("season_id")
    @Expose
    private Integer seasonId;
    @SerializedName("stage_id")
    @Expose
    private Integer stageId;
    @SerializedName("stage_name")
    @Expose
    private String stageName;
    @SerializedName("standings")
    @Expose
    private Standings standings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Integer getStageId() {
        return stageId;
    }

    public void setStageId(Integer stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Standings getStandings() {
        return standings;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }

}
