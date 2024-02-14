package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private List<DisasterVictim> occupants = new ArrayList<>();
    private List<Supply> supplies = new ArrayList<>();

    public Location(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setOccupants(List<DisasterVictim> occupants) {
        this.occupants = occupants;
    }
    public List<DisasterVictim> getOccupants() {
        return occupants;
    }
    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }
    
    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }
    
    public void addSupply(Supply supply) {
        supplies.add(supply);
    }
    
    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }
}
