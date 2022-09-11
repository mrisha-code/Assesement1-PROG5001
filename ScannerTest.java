
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; //importing scanner for input
import java.util.ArrayList; // importing arrylist for java
import java.lang.Math; // importing Math language for java

public class ScannerTest{ //java scanner class declaration

    // Declaration 
    public static void main(String []args){ 
        Scanner sc=new Scanner(System.in); //construnction of new scanner
        String[] stundetNames={"Ram","Sita","Babita","Gita","Shyam","Harry","James","Pitter","John","Henry","Jhony","Papa","Hitter",
            "Aldo","Hari","Gagan","Ramu","Pawan","Rojina","Rehya","Salman","Amir","Ajay","Marbal","Elon"}; //pre-defined Student names
        System.out.println("Please enter your unit name"); //taking inputs for Subject
        String unit= sc.nextLine(); //line break down after input
        
        ArrayList<Integer> marksList = new ArrayList<>(); //new array list to store marks of students
        //for loop for the pre-defined 25 users and taking marks as a input increased by 1
        for(int i=0; i<25; i++){ 
            
            System.out.println("Please enter your marks:"); // printing marks
            int marks=sc.nextInt(); //Creating interger marks for input function
            //checking the marks greater then 0 and smaller than 100
            if(marks >= 0 && marks <= 100){ 
                marksList.add(marks); // Adding markList to marks
            }
            else{
                System.out.println ("Please enter your marks between 0 to 100."); // printing and asking input for marks between 0 and 100
                continue; // asking input for marks untill loop break
            }
        }
        
        int max = marksList.get(0), min = marksList.get(0), total=0; //declartion of maximum and mininum marks
        System.out.println("studnetNames"); //printing studnet names
        // measurement of length of student names 
        for(int i=1; i<stundetNames.length; i++){
            System.out.println(stundetNames[i]); //printing Array of student names
        
        }
        
        System.out.println("Unit Name: " + unit); // printing unit name
        for(int mark: marksList){
            System.out.println ("Mark: "+mark); // printing student mark
            total += mark;
        }
        
        //for loop for highest and lowest marks.. 
        for(int i=1; i<marksList.size(); i++){
            if(max<marksList.get(i)){
                max = marksList.get(i); //storing highest mark
            }
            if(min>marksList.get(i)){
                min = marksList.get(i); //storing lowest mark
            }
        }
        
        System.out.println("Highest Mark is : " + max + " \nLowest Mark is : " + min); // printing highest and lowest marks
        
        float mean = total/marksList.size(); // calcuating mean
        System.out.println("Mean: " + mean); // printing mean
        float sum = 0;
        //creating loop to calcuate standard devation
        for(int i=0; i<marksList.size(); i++){
            int xi = marksList.get(i); //geting marks of all studnets
            sum += (xi-mean)*(xi-mean); // calcuating square value by substracting mean from total marks
            
        }
        
        int c = marksList.size()-1; //storing of total length of marks substracting 1

        
        System.out.println((Math.sqrt(sum))/c);// printing the value of Standard devation..
        
        sc.close(); // closing the scanner sc
    }
     
     
}


