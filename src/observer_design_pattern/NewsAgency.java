package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

/*
    Observable class
    Any update done in this class i.e. If any change in state happens for this class.
    It notifies(updates) all of it's subscriber about the changes.
 */
public class NewsAgency {

    private String news;

    private List<Channel> channelList = new ArrayList<>();

    public void addChannels(Channel channel){
        channelList.add(channel);
    }

    public void removeChannel(Channel channel){
        channelList.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        notifyChannels();
    }

    public void notifyChannels(){
        for (Channel channel : channelList){
            channel.update(this.news);
        }
    }
}
