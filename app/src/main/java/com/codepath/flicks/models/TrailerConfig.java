package com.codepath.flicks.models;

import org.json.JSONException;
import org.json.JSONObject;

public class TrailerConfig {
    // the base url for loading trailers
    String trailerBaseUrl;

    public TrailerConfig(JSONObject object) throws JSONException {
        JSONObject images = object.getJSONObject("images");
    }
}
