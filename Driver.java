public class Driver {

    public static void main(String[] args) {

        // Create speaker objects
        Speaker speaker1 = new Speaker("Patrick Awuar", "Education/Software Dev",
                "Patrick is the founder and president of Ashesi.", "11:00 AM - 12:00 PM");
        Speaker speaker2 = new Speaker("Abdul Mahdi", "Educatio",
                "Abdul is a dean of  students and community affairs at Ashesi University.", "01:00 PM - 02:00 PM");

        // Create company objects
        Company company1 = new Company("AmaliTech Ltd", "Information Technology",
                "David Kweku", "Software Engineer", "www.amalitech.com", 101);
        Company company2 = new Company("Ayadata company", "Cybersecurity",
                "Abena Morris", "Security Analyst", "www.ayadata.com", 202);

        // Create organiser objects
        Organiser organiser1 = new Organiser("Selasi Nukpe", "Event Coordinator",
                "selasi.nukpe@ashesi.edu.gh", "7");
        Organiser organiser2 = new Organiser("Najeeb Mohammed", "Senior Director/Career Services",
                "najeebmoh@ashesi.edu.gh", "10");

        // Create career fair objects and associate them with speakers, companies, organisers
        CareerFair fair1 = new CareerFair("A Hub of Opportunities", "New Car Park",
                "2026-03-20", "8:00 AM", speaker1.getSpeakerName(), 5.0, 50);
        CareerFair fair2 = new CareerFair("Innovators Meet", "Old Car Park",
                "2024-11-20", "9:00 AM", speaker2.getSpeakerName(), 4.0, 30);

        // Array of CareerFair events
        CareerFair[] fairs = {fair1, fair2};
        Speaker[] speakers = {speaker1, speaker2};
        Company[] companies = {company1, company2};
        Organiser[] organisers = {organiser1, organiser2};

        // Loop through the Careerfairs and display all details
        for (int i = 0; i < fairs.length; i++) {
            System.out.println("\n=== Career Fair " + (i + 1) + " ===");
            fairs[i].summary();          // display career fair summary
            companies[i].showCompany();  // display company info
            organisers[i].organiserDetails(); // display organiser info
            speakers[i].showProfile();   // display speaker profile
        }
    }
}