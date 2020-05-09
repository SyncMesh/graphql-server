package xyz.itshark.conf.tutorial.diveintographqlinjava.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class AttendeeTalk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long attendeeId;
    private Long talkId;

    public AttendeeTalk() {
    }

    public AttendeeTalk(Long id, Long attendeeId, Long talkId) {
        this.id = id;
        this.attendeeId = attendeeId;
        this.talkId = talkId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(Long attendeeId) {
        this.attendeeId = attendeeId;
    }

    public Long getTalkId() {
        return talkId;
    }

    public void setTalkId(Long talkId) {
        this.talkId = talkId;
    }
}
