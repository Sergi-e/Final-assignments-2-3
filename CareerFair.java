public class CareerFair {

    // event information
    private String name;
    private String location;
    private String date;
    private String time;
    private String speaker;
    private double duration;
    private int numOfCompanies;

    // default constructor
    public CareerFair() {}

    // main constructor
    public CareerFair(String name, String location, String date, String time,
                      String speaker, double duration, int numOfCompanies) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.speaker = speaker;
        this.duration = duration;
        this.numOfCompanies = numOfCompanies;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setNumOfCompanies(int numOfCompanies) {
        this.numOfCompanies = numOfCompanies;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getSpeaker() {
        return speaker;
    }

    public double getDuration() {
        return duration;
    }

    public int getNumOfCompanies() {
        return numOfCompanies;
    }

    // returns event details
    @Override
    public String toString() {
        return "CareerFair{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", speaker='" + speaker + '\'' +
                ", duration=" + duration +
                ", numOfCompanies=" + numOfCompanies +
                '}';
    }

    // prints a short summary
    public void summary() {
        System.out.println("The career fair '" + name + "' will take place at " +
                location + " on " + date + " starting at " + time +
                ". The main speaker is " + speaker + ". The event lasts " +
                duration + " hours and features " + numOfCompanies +
                " participating companies.");
    }
}