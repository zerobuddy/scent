package com.scent.data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ResponseData {
    private String userId;
    private JSONObject jsonObject;
    private String latitude;
    private String longitude;
    private String status;
    private int code;
    private String message;

    public ResponseData(){
        jsonObject = new JSONObject();
    }

    public void addParam(String key, String value) throws JSONException {
        jsonObject.put(key,  value);
    }

    public Object getParamAsObject(String key) throws JSONException {
       return  jsonObject.get(key);
    }

    public String getparamAsString(String key) throws JSONException {
        return jsonObject.getString(key);
    }

    public Boolean getparamAsBoolean(String key) throws JSONException {
        return jsonObject.getBoolean(key);
    }

    public Double getParamAsDouble(String key) throws JSONException{
        return jsonObject.getDouble(key);
    }


    public JSONObject getParamAsJsonObject(String key) throws JSONException{
        return jsonObject.getJSONObject(key);
    }


    public JSONArray getParamAsJsonArray(String key) throws JSONException{
        return jsonObject.getJSONArray(key);
    }


    public Long getParamAsLong(String key) throws JSONException{
        return jsonObject.getLong(key);
    }


    public int getParamAsInteger(String key) throws JSONException{
        return jsonObject.getInt(key);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
