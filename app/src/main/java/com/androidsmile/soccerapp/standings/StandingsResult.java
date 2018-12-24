
package com.androidsmile.soccerapp.standings;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StandingsResult {

    @SerializedName("data")
    @Expose
    private List<StandingsResultDatum> data = null;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<StandingsResultDatum> getData() {
        return data;
    }

    public void setData(List<StandingsResultDatum> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
