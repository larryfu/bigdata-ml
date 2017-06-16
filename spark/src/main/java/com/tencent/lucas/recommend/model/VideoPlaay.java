package com.tencent.lucas.recommend.model;

/**
 * Created by larry on 6/15/2017.
 */
public class VideoPlaay {
    private String ftime;
    String uin;
    String os_version;
    String session;
    String video_id;
    int is_auto_play;
    String type;
    int oper_type;
    double play_time;

    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }

    public String getUin() {
        return uin;
    }

    public void setUin(String uin) {
        this.uin = uin;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public int getIs_auto_play() {
        return is_auto_play;
    }

    public void setIs_auto_play(int is_auto_play) {
        this.is_auto_play = is_auto_play;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOper_type() {
        return oper_type;
    }

    public void setOper_type(int oper_type) {
        this.oper_type = oper_type;
    }

    public double getPlay_time() {
        return play_time;
    }

    public void setPlay_time(double play_time) {
        this.play_time = play_time;
    }
}
