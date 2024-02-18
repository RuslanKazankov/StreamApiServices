package org.example.streamApiServices;

import java.util.List;

public abstract class BaseStreamApi implements Comparable<BaseStreamApi> {
    abstract int getCountStreamers();
    abstract List<String> getStreamers();

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
