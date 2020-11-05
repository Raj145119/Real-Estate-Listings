package application;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class HouseList {
   
   ArrayList<House> houseList = new ArrayList<>();
   //Gets house.txt file for future use
   public HouseList(String HouseLists) {
       houseList = new ArrayList();
       Scanner myFileIn = null;
       try
       {
           //System.out.println(".........."+HouseLists);
           myFileIn = new Scanner(new File("houses.txt"));
       }
       catch (FileNotFoundException e)
       {
           System.out.println("File: "+HouseLists+" is not found");
       }
       //Gets house info from text file to place into arraylist
       String address1;
       int price1;
       int area1;
       int numBedrooms1;
       House h1;

       while (myFileIn.hasNextLine()) {
           address1 = myFileIn.next();
           price1 = myFileIn.nextInt();
           area1 = myFileIn.nextInt();
           numBedrooms1 = myFileIn.nextInt();

           h1 = new House(address1, price1, area1, numBedrooms1);
           houseList.add(h1);
       }
   }
   
   //prints houses that meet criteria
   public String printHouses(Criteria c) {
	   
	   int res[]=new int[houseList.size()];
	   int j=0;
	       for (int i = 0; i < houseList.size(); i++) {
	    	   if(houseList.get(i).satisfies(c)){
	    		   res[j++]=i; 
	    	   }
	       }
	   
	  int r = new Random().nextInt(j);
	  String result =houseList.get(res[r]).toString();
	  return result;
   }
   
   //returns string of details of houses
   public String getHouses(Criteria c) {
       String ans = "";
       for (int i = 0; i < houseList.size(); i++) {
           if (houseList.get(i).satisfies(c)) {
               ans = ans + houseList.get(i).toString() + "\n";
           }
       }
       return ans;
   }
}

