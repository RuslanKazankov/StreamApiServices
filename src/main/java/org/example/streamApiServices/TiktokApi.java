package org.example.streamApiServices;

import org.example.streamersSource.ITiktokStreamersSource;

import java.util.List;

public class TiktokApi extends BaseStreamApi {
    ITiktokStreamersSource tiktokStreamersSource;
    public TiktokApi(ITiktokStreamersSource tiktokStreamersSource){
        this.tiktokStreamersSource = tiktokStreamersSource;
    }
    @Override
    public int getCountStreamers() {
        return tiktokStreamersSource.getTiktokStreamers().size();
    }
    @Override
    public List<String> getStreamers(){
        return tiktokStreamersSource.getTiktokStreamers();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("В тиктоке стримят такие стримеры:\n");
        for(String streamer : tiktokStreamersSource.getTiktokStreamers()){
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

        TiktokApi otherStreamApi = (TiktokApi) obj;

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
