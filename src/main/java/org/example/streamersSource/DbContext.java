package org.example.streamersSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DbContext implements ITwitchStreamersSource, IYoutubeStreamersSource, ITiktokStreamersSource {
    private List<String> twitchStreamers;
    private List<String> youtubeStreamers;
    private List<String> tiktokStreamers;

    public DbContext(){
        twitchStreamers = new ArrayList<String>(Arrays.asList( "Bratishkinoff", "Buster", "SilverName", "AlinaRin" ));
        youtubeStreamers = new ArrayList<String>(Arrays.asList( "Lofi Girl", "donk", "Experience Game"));
        tiktokStreamers = new ArrayList<String>(Arrays.asList( "Zubareff", "Lolly Lips" ));
    }

    @Override
    public List<String> getTwitchStreamers() {
        return twitchStreamers;
    }

    @Override
    public List<String> getYoutubeStreamers() {
        return youtubeStreamers;
    }

    @Override
    public List<String> getTiktokStreamers(){
        return tiktokStreamers;
    }
}
