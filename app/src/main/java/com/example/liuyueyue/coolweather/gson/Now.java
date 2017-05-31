package com.example.liuyueyue.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by liuyueyue on 2017/5/27.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }


}
