public class Speaker{
    private String speakerName;
    private String topic;
    private String biography;
    private String timeslot;
public Speaker(){}
public Speaker(String speakerName, String topic, String biography, String timeslot){
    this.speakerName = speakerName;
    this.topic = topic;
    this.biography = biography;
    this.timeslot = timeslot;
}
     //Setters 
    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    //getters

    public String getSpeakerName() {
        return speakerName;
    }

    public String getTopic() {
        return topic;
    }

    public String getBiography() {
        return biography;
    }

    public String getTimeslot() {
        return timeslot;
    }
    
}
