/**
 * Created by mohan on 11-Nov-15.
 */
public class AgeCalculate {

    public static void main(String args[]){
        String dateOfBirth = new String("31.8.1993");
        String[] dateSplit = dateOfBirth.split(".");
        for(int i=0;i<dateSplit.length;i++)
            System.out.print(dateSplit[i]);
        int currentYear=2015;
        int birthYear= Integer.parseInt(dateSplit[2]);



        int age= currentYear- birthYear;
        System.out.println("The current age of dob=31.8.1993 is" + age);

    }
   

}
