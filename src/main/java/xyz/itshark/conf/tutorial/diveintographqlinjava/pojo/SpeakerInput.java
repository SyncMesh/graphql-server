package xyz.itshark.conf.tutorial.diveintographqlinjava.pojo;

import lombok.Data;

@Data
public class SpeakerInput {

    private String name;
    private String twitter;

    public SpeakerInput() {
    }

    public SpeakerInput(String name, String twitter) {
        this.name = name;
        this.twitter = twitter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}
