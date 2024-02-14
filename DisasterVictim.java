package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.List;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private List<Supply> personalBelongings = new ArrayList<>();
    private List<FamilyRelation> familyConnections = new ArrayList<>();
    private List<MedicalRecord> medicalRecords = new ArrayList<>();
    private String ENTRY_DATE;
    private String gender;
    private int counter;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public String getComments() {
        return comments;
    }
    public void setASSIGNED_SOCIAL_ID(int ASSIGNED_SOCIAL_ID) {
        this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }
    public int getASSIGNED_SOCIAL_ID() {
        return ASSIGNED_SOCIAL_ID;
    }
    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }
    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }
    public void setFamilyConnections(List<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }
    public List<FamilyRelation> getFamilyConnections() {
        return familyConnections;
    }
    public void setENTRY_DATE(String ENTRY_DATE) {
        this.ENTRY_DATE = ENTRY_DATE;
    }
    public String getENTRY_DATE() {
        return ENTRY_DATE;
    }
    public void setPersonalBelongings(List<Supply> personalBelongings) {
        this.personalBelongings = personalBelongings;
    }
    public List<Supply> getPersonalBelongings() {
        return personalBelongings;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public int getCounter() {
        return counter;
    }
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        personalBelongings.remove(supply);
    }

    public void addFamilyConnection(FamilyRelation familyRelation) {
        familyConnections.add(familyRelation);
    }

    public void removeFamilyConnection(FamilyRelation familyRelation) {
        familyConnections.remove(familyRelation);
    }
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
}
