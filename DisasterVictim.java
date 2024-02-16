package edu.ucalgary.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int assignedSocialID;
    private Supply[] personalBelongingsArray;
    private FamilyRelation[] familyConnectionsArray;
    private MedicalRecord[] medicalRecordsArray;
    private String entryDate;
    private String gender;
    private static int nextSocialID = 1;

    public DisasterVictim(String firstName, String entryDate) {
        if (!isValidDateFormat(entryDate)) {
            throw new IllegalArgumentException("Invalid date format for entry date: " + entryDate);
        }
        this.firstName = firstName;
        this.entryDate = entryDate;
        this.assignedSocialID = nextSocialID++;
    }
    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecordsArray = medicalRecords;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecordsArray;
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
    if (!isValidDateFormat(dateOfBirth)) {
        throw new IllegalArgumentException("Invalid date format for date of birth: " + dateOfBirth);
    }
    this.dateOfBirth = dateOfBirth;
}
private boolean isValidDateFormat(String date) {
    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.parse(date);
        return true;
    } catch (ParseException e) {
        return false;
    }
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

    public void setAssignedSocialID(int assignedSocialID) {
        this.assignedSocialID = assignedSocialID;
    }

    public int getAssignedSocialID() {
        return assignedSocialID;
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnectionsArray = familyConnections;
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnectionsArray;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setPersonalBelongings(Supply[] personalBelongings) {
        this.personalBelongingsArray = personalBelongings;
    }

    public Supply[] getPersonalBelongings() {
        return personalBelongingsArray;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void addPersonalBelonging(Supply supply) {
        if (personalBelongingsArray == null) {
            personalBelongingsArray = new Supply[1];
            personalBelongingsArray[0] = supply;
        } else {
            Supply[] newArray = Arrays.copyOf(personalBelongingsArray, personalBelongingsArray.length + 1);
            newArray[personalBelongingsArray.length] = supply;
            personalBelongingsArray = newArray;
        }
    }

    public void removePersonalBelonging(Supply supply) {
        if (personalBelongingsArray != null) {
            int index = -1;
            for (int i = 0; i < personalBelongingsArray.length; i++) {
                if (personalBelongingsArray[i].equals(supply)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                Supply[] newArray = new Supply[personalBelongingsArray.length - 1];
                System.arraycopy(personalBelongingsArray, 0, newArray, 0, index);
                System.arraycopy(personalBelongingsArray, index + 1, newArray, index, personalBelongingsArray.length - index - 1);
                personalBelongingsArray = newArray;
            }
        }
    }

    public void addFamilyConnection(FamilyRelation familyRelation) {
        if (familyConnectionsArray == null) {
            familyConnectionsArray = new FamilyRelation[1];
            familyConnectionsArray[0] = familyRelation;
        } else {
            FamilyRelation[] newArray = Arrays.copyOf(familyConnectionsArray, familyConnectionsArray.length + 1);
            newArray[familyConnectionsArray.length] = familyRelation;
            familyConnectionsArray = newArray;
        }
    }

    public void removeFamilyConnection(FamilyRelation familyRelation) {
        if (familyConnectionsArray != null) {
            int index = -1;
            for (int i = 0; i < familyConnectionsArray.length; i++) {
                if (familyConnectionsArray[i].equals(familyRelation)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                FamilyRelation[] newArray = new FamilyRelation[familyConnectionsArray.length - 1];
                System.arraycopy(familyConnectionsArray, 0, newArray, 0, index);
                System.arraycopy(familyConnectionsArray, index + 1, newArray, index, familyConnectionsArray.length - index - 1);
                familyConnectionsArray = newArray;
            }

        }
    }
}    
