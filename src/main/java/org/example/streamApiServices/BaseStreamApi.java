package org.example.streamApiServices;

import java.util.List;

public abstract class BaseStreamApi implements Comparable<BaseStreamApi> {
    public abstract String getTitlePlatform();
    public abstract int getCountStreamers();
    public abstract List<String> getStreamers();
    @Override
    public int compareTo(BaseStreamApi otherStreamApi) {
        if (otherStreamApi == null)
            return 1;
        if (this.getCountStreamers() > otherStreamApi.getCountStreamers())
            return 1;
        if (this.getCountStreamers() < otherStreamApi.getCountStreamers())
            return -1;
        return 0;
    }
}
