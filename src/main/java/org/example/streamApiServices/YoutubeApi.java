package org.example.streamApiServices;

import org.example.streamersSource.IYoutubeStreamersSource;

import java.util.List;

public class YoutubeApi extends BaseStreamApi{
    private String title = "Youtube";
    private IYoutubeStreamersSource youtubeStreamersSource;
    public YoutubeApi(IYoutubeStreamersSource youtubeStreamersSource){
        this.youtubeStreamersSource = youtubeStreamersSource;
    }
    @Override
    public String getTitlePlatform(){
        return title;
    }
    @Override
    public int getCountStreamers() {
        return youtubeStreamersSource.getYoutubeStreamers().size();
    }
    @Override
    public List<String> getStreamers(){
        return youtubeStreamersSource.getYoutubeStreamers();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("На ютубе стримят такие стримеры:\n");
        for(String streamer : youtubeStreamersSource.getYoutubeStreamers()){
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

        YoutubeApi otherStreamApi = (YoutubeApi) obj;

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
