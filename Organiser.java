public class Organiser{
    private String organiserName;
    private String role;
    private String contactInfo;
    private String yearsOfExperience;
public Organiser(){}
public Organiser(String organiserName, String role, String contactInfo, String yearsOfExperience){
    this.organiserName = organiserName;
    this.role = role;
    this.contactInfo = contactInfo;
    this.yearsOfExperience = yearsOfExperience;
}
//setters
    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
//getters

    public String getOrganiserName() {
        return organiserName;
    }

    public String getRole() {
        return role;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }
    //to string method
    @Override
    public String toString() {
        return "Organiser{" +
                "organiserName='" + organiserName + '\'' +
                ", role='" + role + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", yearsOfExperience='" + yearsOfExperience + '\'' +
                '}';
    }
    // display method
    public void organiserDetails() {
        System.out.println("The organiser " + organiserName + " holds the role of " + role +
            " with " + yearsOfExperience + " years of experience. Contact info: " + contactInfo);
    }
}



