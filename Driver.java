public class Driver{
    public static void main(String[] args) {
        // initializing the career fair objects
        CareerFair fair1=new CareerFair("Tech Career Expo","New York","2024-09-15","10:00 AM","John Doe",5.0,50);
        CareerFair fair2=new CareerFair("Innovators Meet","San Francisco","2024-10-20","09:00 AM","Jane Smith",4.0,30);

        //initializing the speaker objects 
        Speaker speaker1=new Speaker("Alice Johnson","Software Development","Alice has over 10 years of experience in software engineering.","11:00 AM - 12:00 PM");
        Speaker speaker2=new Speaker("Bob Williams","Cybersecurity","Bob is a leading expert in cybersecurity with numerous publications.","01:00 PM - 02:00 PM");

        //initlaizing the company objects
        Company company1=new Company("Tech Solutions","Information Technology","Michael Brown","Software Engineer","www.techsolutions.com",101);
        Company company2=new Company("SecureNet","Cybersecurity","Sarah Davis","Security Analyst","www.securenet.com",202);

        //initializing the organiser objects
        Organiser organiser1=new Organiser("Emily Clark","Event Coordinator","emilyclark@gmail.com","7");
        Organiser organiser2=new Organiser("David Lee","Logistics Manager","kwabenabonsu@gmail.com","10");
        
        // Display using toString methods
        System.out.println(fair1.toString());
        System.out.println(speaker1.toString());
        System.out.println(company1.toString());
        System.out.println(organiser1.toString());
        
        System.out.println(fair2.toString());
        System.out.println(speaker2.toString());
        System.out.println(company2.toString());
        System.out.println(organiser2.toString());

        // Displaying the summary
        System.out.println("\nCareer Services 1 Summary:");
        fair1.Summary();
        
        System.out.println("\nCompany 1 Summary");
        company1.showCompany();
       
        System.out.println("\nOrganiser 1 Details");
        organiser1.organiserDetails();
        
        System.out.println("\nSpeaker 1 Profile");
        speaker1.showProfile();

        System.out.println("\nCareer Services 2 Summary:");
        fair2.Summary();
        
        System.out.println("\nCompany 2 Summary");
        company2.showCompany();
        
        System.out.println("\nOrganiser 2 Details");
        organiser2.organiserDetails();
        
        System.out.println("\nSpeaker 2 Profile");
        speaker2.showProfile();
        }
}