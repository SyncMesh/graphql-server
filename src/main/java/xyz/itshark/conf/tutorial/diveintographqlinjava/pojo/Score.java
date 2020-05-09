package xyz.itshark.conf.tutorial.diveintographqlinjava.pojo;

import lombok.Data;

@Data
public class Score {

    private String title;
    private Integer score;

    public static class ScoreBuilder{
        private String title;
        private Integer score;

        public ScoreBuilder() {
        }

        public ScoreBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ScoreBuilder score(Integer score) {
            this.score = score;
            return this;
        }

        @Override
        public String toString() {
            return "ScoreBuilder{" +
                    "title='" + title + '\'' +
                    ", score=" + score +
                    '}';
        }

        public Score build(){
            return new Score(title, score);
        }
    }

    public Score() {
    }

    public Score(String title, Integer score) {
        this.title = title;
        this.score = score;
    }

    public static ScoreBuilder builder() {
        return new ScoreBuilder();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Score title(String title) {
        this.setTitle(title);
        return this;
    }
    public Score score(Integer score) {
        this.setScore(score);
        return this;
    }

}
