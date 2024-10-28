package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job () {
        id = nextId;
        nextId++;
    }
    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString(){
        String jobString; //Need to make this a loop so that I can specify each name and value
        //What is the name? It's not a key... what is it? a class?
        //Then say if empty, say Data not available
        //Can I iterate over fields?
        //Why do I not need a return?
        //TODO - TestTaskFive last test is failing because the values are "" not null. must test that there is a character.
//        jobString = "Name: "+name+"\n"+
//                "Employer: "+employer.getValue()+"\n"+
//                "Location: "+location.getValue()+"\n"+
//                "Position Type: "+positionType.getValue()+"\n"+
//                "Core Competency: "+coreCompetency.getValue()+"\n";
        String jobStringAddition;
        jobString = System.lineSeparator()+"ID: "+id+System.lineSeparator();
        if (name.isBlank()){
            jobStringAddition = "Name: Data not available"+System.lineSeparator();
        } else {
            jobStringAddition = "Name: "+name+System.lineSeparator();
        }
        jobString = jobString.concat(jobStringAddition);

        if (employer.getValue() == null ||employer.getValue().isBlank()){
            jobStringAddition = "Employer: Data not available"+System.lineSeparator();
        } else {
            jobStringAddition = "Employer: "+employer.getValue()+System.lineSeparator();
        }
        jobString = jobString.concat(jobStringAddition);

        if (location.getValue() == null || location.getValue().isBlank()){
            jobStringAddition = "Location: Data not available"+System.lineSeparator();
        } else {
            jobStringAddition = "Location: "+location.getValue()+System.lineSeparator();
        }
        jobString += jobStringAddition;

        if (positionType.getValue() == null || positionType.getValue().isBlank()){
            jobStringAddition = "Position Type: Data not available"+System.lineSeparator();
        } else {
            jobStringAddition = "Position Type: "+positionType.getValue()+System.lineSeparator();
        }
        jobString += jobStringAddition;

        if (coreCompetency.getValue() == null || coreCompetency.getValue().isBlank()){
            jobStringAddition = "Core Competency: Data not available"+System.lineSeparator();
        } else {
            jobStringAddition = "Core Competency: "+coreCompetency.getValue()+System.lineSeparator();
        }
        jobString += jobStringAddition;

        return jobString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

}