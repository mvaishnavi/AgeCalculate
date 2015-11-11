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
        int age = computeAge(currentYear,birthYear);
        int leap= calculateLeapYear(birthYear);
        if(leap==1) {
            System.out.println("BirthYear is a Leap year");
            calculateSpecialPower(age);
        }
        else {
            System.out.println("Birthyear is not a leap year.");
        }
        int x = 4;
        int newBirthYear = birthYear + x;
        int newAge=computeAge(currentYear,newBirthYear);
        int checkLeap= calculateLeapYear(newBirthYear);
        if(checkLeap==1) {
            calculateSpecialPower(newAge);
        }
    }

    private static int computeAge(int currentYear, int birthYear ) {
        int age= currentYear- birthYear;
        System.out.println("The current age of dob=31.8.1993 is" + age);
        return(age);
    }

    public static int calculateLeapYear(int birthYear) {
        if(birthYear%4 == 0 && birthYear % 400 ==0)
        {
            int ret = 1;
            return (ret);
        }
        else {
            return (0);
        }
    }
    
    public static void calculateSpecialPower(int age) {
        if ( age == 18)
            System.out.println("He has special powers!");
        else
            System.out.println("He has no special powers!");
    }


}
