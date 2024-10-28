package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test()
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }
    @Test()
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType );
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test()
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }
    @Test()
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1.toString().startsWith("System.lineSeparator()")); //How do I use assertEquals?
        assertTrue(testJob1.toString().endsWith("System.lineSeparator()"));
    }
    @Test()
    public void testToStringContainsCorrectLabelsAndData(){ //I'm assuming the index? I'm not sure why this is working
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(System.lineSeparator()+"ID: "+testJob1.getId()+System.lineSeparator()+
                "Name: Product tester" + System.lineSeparator()+
                "Employer: ACME" + System.lineSeparator()+
                "Location: Desert" + System.lineSeparator()+
                "Position Type: Quality control" + System.lineSeparator()+
                "Core Competency: Persistence"+System.lineSeparator(), testJob1.toString().substring(1, (testJob1.toString().length() - 1)));
    }
    @Test()
    public void testToStringHandlesEmptyField(){
        Job testJob3 = new Job("Product tester", new Employer(), new Location("Desert"),
                new PositionType(), new CoreCompetency("Persistence"));
        assertEquals(System.lineSeparator()+"ID: "+testJob3.getId()+System.lineSeparator() +
                "Name: Product tester" +System.lineSeparator()+
                "Employer: Data not available" +System.lineSeparator()+
                "Location: Desert" + System.lineSeparator()+
                "Position Type: Data not available" + System.lineSeparator()+
                "Core Competency: Persistence"+System.lineSeparator(), testJob3.toString().substring(1, (testJob3.toString().length() - 1)));
    }
}
