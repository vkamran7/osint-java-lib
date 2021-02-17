package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RelativesByUserIDResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("count_full")
    @Expose
    private Integer countFull;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCountFull() {
        return countFull;
    }

    public void setCountFull(Integer countFull) {
        this.countFull = countFull;
    }

    public static class Result {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("relationship")
        @Expose
        private String relationship;
        @SerializedName("birthday")
        @Expose
        private String birthday;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRelationship() {
            return relationship;
        }

        public void setRelationship(String relationship) {
            this.relationship = relationship;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

    }

}
