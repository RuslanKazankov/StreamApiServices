package org.example;

import org.example.streamApiServices.*;
import org.example.streamersSource.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DbContext db = new DbContext();
        YoutubeApi youtubeApi = new YoutubeApi(db);
        TwitchApi twitchApi = new TwitchApi(db);
        TiktokApi tiktokApi = new TiktokApi(db);

        System.out.println(youtubeApi);
        System.out.println(twitchApi);
        System.out.println(tiktokApi);

        Set<BaseStreamApi> apiList = new HashSet<>();
        apiList.add(twitchApi);
        apiList.add(youtubeApi);
        apiList.add(tiktokApi);

        System.out.println("На платформе " + apiList.iterator().next().getTitlePlatform() + " больше всего стримеров!" );
    }
}