package org.example;

import org.example.streamApiServices.*;
import org.example.streamersSource.*;

public class Main {
    public static void main(String[] args) {
        DbContext db = new DbContext();
        TwitchApi twitchApi = new TwitchApi(db);
        YoutubeApi youtubeApi = new YoutubeApi(db);
        TiktokApi tiktokApi = new TiktokApi(db);

        System.out.println(twitchApi);
        System.out.println(youtubeApi);
        System.out.println(tiktokApi);

        if (twitchApi.getCountStreamers() > youtubeApi.getCountStreamers()){
            if (twitchApi.getCountStreamers() > tiktokApi.getCountStreamers())
                System.out.println("На твиче больше всего стримеров!");
            else
                System.out.println("В тиктоке больше всего стримеров!");
        }else {
            if (youtubeApi.getCountStreamers() > tiktokApi.getCountStreamers())
                System.out.println("На ютубе больше всего стримеров!");
            else
                System.out.println("В тиктоке больше всего стримеров!");
        }
    }
}