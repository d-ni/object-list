package occupation;

/* Main.java
 * This file contains the executable class for a project * demonstrating the use of a OccupationList object
 * last edited September 21, 2020 by D. Duncan
 * The file declaring the Occupation class must be visible to this Main class.
 */

import java.io.FileNotFoundException;
import java.util.*;

public class OccupationProject {
    public static void main(String[] args) throws FileNotFoundException {

        OccupationList Test = new OccupationList();
        Test.loadArray();
        Test.printList();
        Test.searchList();

    } //end OccupationProject
} // end class
