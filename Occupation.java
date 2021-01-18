package occupation;

/* Occupation.java
 * This file contains the declaration for the Occupation class of objects,
 * as used in our textbook
 * last edited Sept 21, 2020 by D. Duncan
 * The file declaring the Book class must be visible to this OccupationProject class.
 */


public class Occupation {
    //declaring properties
    private String occ;
    private String title;
    private int employed;
    private double hourly;
    private int annual;

    //constructor methods
    //default constructor
    public Occupation() {
    }

    //constructor with classification code and title
    public Occupation(String occ, String title, int employed, double hourly, int annual) {
        this.occ = occ;
        this.title = title;
        this.employed = employed;
        this.hourly = hourly;
        this.annual = annual;
    }

    //accessor methods
    public int getEmployed() {
        return employed;
    }

    public double getHourly() {
        return hourly;
    }

    public int getAnnual() {
        return annual;
    }

    //mutator methods
    public void setEmployed(int employed) {
        this.employed = employed;
    }

    public void setHourly(double hourly) {
        this.hourly = hourly;
    }

    public void setAnnual(int annual) {
        this.annual = annual;
    }

    //method to return information about the book as a String
    public String toString() {
        return ("Occupation: " + occ + " " + title + " People currently employed: " + employed + " Average annual salary: " + annual);
    }

    public void toConsole() {
        System.out.println("Occupation: " + occ + " " + title + " People currently employed: " + employed + " Average annual salary: " + annual);
    }
}
//end class Occupation