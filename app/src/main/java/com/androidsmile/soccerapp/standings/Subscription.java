
package com.androidsmile.soccerapp.standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subscription {

    @SerializedName("started_at")
    @Expose
    private StartedAt startedAt;
    @SerializedName("trial_ends_at")
    @Expose
    private Object trialEndsAt;
    @SerializedName("ends_at")
    @Expose
    private Object endsAt;

    public StartedAt getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(StartedAt startedAt) {
        this.startedAt = startedAt;
    }

    public Object getTrialEndsAt() {
        return trialEndsAt;
    }

    public void setTrialEndsAt(Object trialEndsAt) {
        this.trialEndsAt = trialEndsAt;
    }

    public Object getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Object endsAt) {
        this.endsAt = endsAt;
    }

}
