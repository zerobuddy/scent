package com.scent.data;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class RequestData {
    private Map<String, Object> data;

    public RequestData(){
        data = new HashMap<>();
    }

    public void setParam(String key, Object value){
        data.put(key, value);
    }
    public Object getParam(String key){
        return data.get(key);
    }
}
