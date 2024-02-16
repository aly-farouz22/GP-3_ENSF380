import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        setDateOfInquiry(dateOfInquiry);
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return this.inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return this.missingPerson;
    }

    public String getDateOfInquiry() {
        return this.dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        if (!dateOfInquiry.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid date format. Expected format: YYYY-MM-DD");
        }
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided() {
        return this.infoProvided;
    }

    public Location getLastKnownLocation() {
        return this.lastKnownLocation;
    }

    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() + ", Missing Person: " + missingPerson.getName() + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: " + infoProvided + ", Last Known Location: " + lastKnownLocation.getName();
    }
}