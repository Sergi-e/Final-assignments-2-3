import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Assignment2Test {

    @Test
    void testCareerFair() {
        // CareerFair objects with updated driver data
        CareerFair fair1 = new CareerFair("A Hub of Opportunities", "New Car Park",
                "2026-03-20", "8:00 AM", "Patrick Awuar", 5.0, 50);
        CareerFair fair2 = new CareerFair("Innovators Meet", "Old Car Park",
                "2024-11-20", "9:00 AM", "Abdul Mahdi", 4.0, 30);

        // Getters test
        assertEquals("A Hub of Opportunities", fair1.getName());
        assertEquals("Old Car Park", fair2.getLocation());

        // Setters test
        fair1.setDuration(6.0);
        assertEquals(6.0, fair1.getDuration());

        // Extra method test
        fair1.summary();
        fair2.summary();

        // toString test
        assertTrue(fair1.toString().contains("A Hub of Opportunities"));
    }

    @Test
    void testSpeaker() {
        // Speaker objects with updated driver data
        Speaker speaker1 = new Speaker("Patrick Awuar", "Education/Software Dev",
                "Patrick is the founder and president of Ashesi.", "11:00 AM - 12:00 PM");
        Speaker speaker2 = new Speaker("Abdul Mahdi", "Education",
                "Abdul is a dean of students and community affairs at Ashesi University.", "01:00 PM - 02:00 PM");

        // Getters and setters
        assertEquals("Patrick Awuar", speaker1.getSpeakerName());
        speaker2.setTopic("Education/Leadership");
        assertEquals("Education/Leadership", speaker2.getTopic());

        // Extra method test
        speaker1.showProfile();
        speaker2.showProfile();

        // toString test
        assertTrue(speaker2.toString().contains("Abdul Mahdi"));
    }

    @Test
    void testCompany() {
        // Company objects with updated driver data
        Company company1 = new Company("AmaliTech Ltd", "Information Technology",
                "David Kweku", "Software Engineer", "www.amalitech.com", 101);
        Company company2 = new Company("Ayadata company", "Cybersecurity",
                "Abena Morris", "Security Analyst", "www.ayadata.com", 202);

        // Getters and setters
        assertEquals("AmaliTech Ltd", company1.getCompanyName());
        company2.setBoothNumber(205);
        assertEquals(205, company2.getBoothNumber());

        // Extra method test
        company1.showCompany();
        company2.showCompany();

        // toString test
        assertTrue(company1.toString().contains("AmaliTech Ltd"));
    }

    @Test
    void testOrganiser() {
        // Organiser objects with updated driver data
        Organiser organiser1 = new Organiser("Selasi Nukpe", "Event Coordinator",
                "selasi.nukpe@ashesi.edu.gh", "7");
        Organiser organiser2 = new Organiser("Najeeb Mohammed", "Senior Director/Career Services",
                "najeebmoh@ashesi.edu.gh", "10");

        // Getters and setters
        assertEquals("Selasi Nukpe", organiser1.getOrganiserName());
        organiser2.setRole("Director of Career Services");
        assertEquals("Director of Career Services", organiser2.getRole());

        // Extra method test
        organiser1.organiserDetails();
        organiser2.organiserDetails();

        // toString test
        assertTrue(organiser2.toString().contains("Najeeb Mohammed"));
    }
}