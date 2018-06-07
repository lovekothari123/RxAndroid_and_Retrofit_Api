package com.jackandphantom.ciruclarprogressbar.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllSongsModel {

@SerializedName("status")
@Expose
private Integer status;
@SerializedName("msg")
@Expose
private String msg;
@SerializedName("data")
@Expose
private List<AllSongsDatum> data = null;

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public List<AllSongsDatum> getData() {
return data;
}

public void setData(List<AllSongsDatum> data) {
this.data = data;
}

}
