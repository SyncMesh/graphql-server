package xyz.itshark.conf.tutorial.diveintographqlinjava.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class SpeakerTalk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long speakerId;
    private Long talkId;

    public SpeakerTalk() {
    }

    public SpeakerTalk(Long id, Long speakerId, Long talkId) {
        this.id = id;
        this.speakerId = speakerId;
        this.talkId = talkId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpeakerId() {
        return speakerId;
    }

    public void setSpeakerId(Long speakerId) {
        this.speakerId = speakerId;
    }

    public Long getTalkId() {
        return talkId;
    }

    public void setTalkId(Long talkId) {
        this.talkId = talkId;
    }
}
