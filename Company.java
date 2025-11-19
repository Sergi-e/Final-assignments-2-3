public class Company{
    private String companyName;
    private String industry;
    private String repName;
    private String positionPresented;
    private String website;
    private int boothNumber;

    public Company(){}
    public Company(String companyName, String industry, String repName, String positionPresented, String website, int boothNumber) {
        this.companyName = companyName;
        this.industry = industry;
        this.repName = repName;
        this.positionPresented = positionPresented;
        this.website = website;
        this.boothNumber = boothNumber;
    }
    //setters

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public void setPositionPresented(String positionPresented) {
        this.positionPresented = positionPresented;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setBoothNumber(int boothNumber) {
        this.boothNumber = boothNumber;
    }
    //getters

    public String getCompanyName() {
        return companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public String getRepName() {
        return repName;
    }

    public String getPositionPresented() {
        return positionPresented;
    }

    public String getWebsite() {
        return website;
    }

    public int getBoothNumber() {
        return boothNumber;
    }
    //to  String method
    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", industry='" + industry + '\'' +
                ", repName='" + repName + '\'' +
                ", positionPresented='" + positionPresented + '\'' +
                ", website='" + website + '\'' +
                ", boothNumber=" + boothNumber +
                '}';
    }

    // display method 
    public void showCompany() {
    System.out.println("The company " + companyName + " operates in the " + industry +
        ". It is hereby represented by " + repName + 
        " who is presenting the position of " + positionPresented +
        ". For more information, visit " + website +
        ". Find their booth at number " + boothNumber + ".");
    }
}