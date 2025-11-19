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
    //to string method
    @Override
    public String toString() {
        return "Speaker{" +
                "speakerName='" + speakerName + '\'' +
                ", topic='" + topic + '\'' +
                ", biography='" + biography + '\'' +
                ", timeslot='" + timeslot + '\'' +
                '}';
    }
    // display method
   public void showProfile() {
    System.out.println("Speaker Name: " + speakerName 
        + " is a dedicated professional in " + topic 
        + ". Biography: " + biography 
        + ". They will be speaking at " + timeslot + ".");
    }
}