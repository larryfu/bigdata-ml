package com.tencent.lucas.recommend.model;

/**
 * Created by larry on 6/15/2017.
 */
public class Video {
    String video_id;
    String uid;
    String pulish_date;
    String title;
    String tags;
    int len;

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPulish_date() {
        return pulish_date;
    }

    public void setPulish_date(String pulish_date) {
        this.pulish_date = pulish_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" video_id:").append(video_id)
                .append("   uid:").append(uid)
                .append("   pulish_date:").append(pulish_date)
                .append("   title:").append(title)
                .append("   tags:").append(tags)
                .append("   len:").append(len);
        return sb.toString();
    }
}
