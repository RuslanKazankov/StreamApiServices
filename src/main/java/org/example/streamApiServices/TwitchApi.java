package org.example.streamApiServices;

import org.example.streamersSource.ITwitchStreamersSource;

import java.util.List;

public class TwitchApi extends BaseStreamApi {
    private String title = "Twitch";
    private ITwitchStreamersSource twitchStreamersSource;
    public TwitchApi(ITwitchStreamersSource twitchStreamersSource){
        this.twitchStreamersSource = twitchStreamersSource;
    }
    @Override
    public String getTitlePlatform(){
        return title;
    }
    @Override
    public int getCountStreamers() {
        return twitchStreamersSource.getTwitchStreamers().size();
    }

    @Override
    public List<String> getStreamers(){
        return twitchStreamersSource.getTwitchStreamers();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("На твиче стримят такие стримеры:\n");
        for(String streamer : twitchStreamersSource.getTwitchStreamers()){
            sb.append(streamer);
            sb.append("\n");
        }
        return sb.toString();
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;

        TwitchApi otherStreamApi = (TwitchApi) obj;

        if (this.getCountStreamers() != otherStreamApi.getCountStreamers())
            return false;

        List<String> thisStreamers = this.getStreamers();
        List<String> otherStreamers = otherStreamApi.getStreamers();

        for(int i = 0; i < this.getCountStreamers(); i++){
            if (!thisStreamers.get(i).equals(otherStreamers.get(i)))
                return false;
        }

        return true;
    }
}
