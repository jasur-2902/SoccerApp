
package com.androidsmile.soccerapp.standings;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Standings {

    @SerializedName("data")
    @Expose
    private List<StandingDatum> data = null;

    public List<StandingDatum> getData() {
        return data;
    }

    public void setData(List<StandingDatum> data) {
        this.data = data;
    }

}
