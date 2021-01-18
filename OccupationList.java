package occupation;

import java.io.FileNotFoundException;
import java.util.*;

public class OccupationList {

        private Occupation[] occupationList = new Occupation[1000];
        private int count; //the list size; # of elements in array

        //null constructor
        void OccupationList() {
        }
        //can't figure out why it won't actually load the array
        public void loadArray() throws FileNotFoundException {
            int i = 0; //loop counter

            //declare variables
            String inOcc;
            String inTitle;
            int inEmployed;
            double inHourly;
            int inAnnual;

            java.io.File occFile = new java.io.File("occMay2019.txt");
            Scanner infile = new Scanner(occFile);

            while (infile.hasNextLine()) {
                inOcc = infile.nextLine();
                inTitle = infile.nextLine();
                inEmployed = Integer.parseInt(infile.nextLine());
                inHourly = Double.parseDouble(infile.nextLine());
                inAnnual = Integer.parseInt(infile.nextLine());

                occupationList[i] = new Occupation(inOcc, inTitle, inEmployed, inHourly, inAnnual);
                i = i + 1;
            }

            infile.close();
            count = i;


        }
        //I know this "sorta" works because it's sending out everything but the array because it is null because O can't get it to load
        public void printList() {
            System.out.println("List of Occupations from List. \n");
            System.out.println("Each line has: \nOccupation Id, Title, People Currently Employed, Avg. Hourly Rate & Avg. Annual Rate");
            for (int i = 0; i < count; i++) {
                System.out.println(occupationList[i].toString());
            }
        }
        //as above so below.
        public void searchList() {

            System.out.println("Please enter either the OccId that you're looking for");
            Scanner searchItem = new Scanner(System.in);
            String searchInput = searchItem.nextLine();

            boolean isExists = false;
            String output = null;
            for (int i = 0; i < count; i++) {
                String arrayValue = occupationList[i].toString();
                if (arrayValue.contains(searchInput)){
                    isExists = true;
                    output = arrayValue;
                    break;
                }
            }

            if (isExists) {
                System.out.println(output);
            }
            else{
                System.out.println("OccID not found.");
            }


        }

}


