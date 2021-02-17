package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageDetailsByPageResponse {
    @SerializedName("exec_time")
    @Expose
    private Double execTime;
    @SerializedName("result")
    @Expose
    private List<Object> result = null;

    public Double getExecTime() {
        return execTime;
    }

    public void setExecTime(Double execTime) {
        this.execTime = execTime;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }
}
