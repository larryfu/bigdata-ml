package com.tencent.lucas.recommend;

import com.tencent.lucas.recommend.model.Video;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by larry on 6/15/2017.
 */
public class DataImporter {

    public static void main(String[] args) throws IOException {
        String path = "D:\\home\\data\\recommend\\video_data.txt";
        importPlay(path);
    }

    public static List<Video> importPlay(String path) throws IOException {
        List<Video> videoPlays = new ArrayList<>();
        List<String> strings = Files.readAllLines(Paths.get(path));
        for (String str : strings) {
            try {
                String[] strArray = str.split(",");
                String video_id = strArray[0];
                String uid = strArray[1];
                String pulish_date = strArray[2];
                String title = strArray[3];
                String len = strArray[strArray.length - 1];
                String[] tagsArr = new String[strArray.length - 5];
                System.arraycopy(strArray, 4, tagsArr, 0, tagsArr.length);
                String tags = String.join(",", Arrays.asList(tagsArr));
                Video videoPlay = new Video();
                videoPlay.setVideo_id(video_id);
                videoPlay.setUid(uid);
                videoPlay.setPulish_date(pulish_date);
                videoPlay.setTags(tags);
                videoPlay.setLen(Integer.parseInt(len));
                videoPlay.setTitle(title);
                videoPlays.add(videoPlay);
               // System.out.println(videoPlay);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return videoPlays;
    }
}
