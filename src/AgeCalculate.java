/**
 * Created by mohan on 11-Nov-15.
 */
public class AgeCalculate {

    public static void main(String args[]){
        String dateOfBirth = new String("31.8.1993");
        String[] dateSplit= dateOfBirth.split("\\.");
        int currentYear=2015;
        int birthYear= Integer.parseInt(dateSplit[2]);
        System.out.println("Birth year "+birthYear );
        int age = computeAge(currentYear,birthYear);
        boolean checkLeap= calculateLeapYear(birthYear);
        calculateSpecialPower(age,checkLeap);
        int x = 4;
        int newBirthYear = birthYear + x;
        System.out.println("Birth year "+newBirthYear );
        int newAge=computeAge(currentYear,newBirthYear);
        checkLeap= calculateLeapYear(newBirthYear);
        calculateSpecialPower(newAge,checkLeap);
    }

    private static int computeAge(int currentYear, int birthYear ) {
        int age= currentYear- birthYear;
        System.out.println("The current age is " + age);
        return(age);
    }

    private static boolean calculateLeapYear(int birthYear) {
        if(birthYear%4 == 0 && birthYear % 400 ==0) {
            System.out.println("Birth Year is a Leap year");
            return true;
        }
        else {
            System.out.println("Birth Year is not a Leap year");
            return false;
        }
    }

    private static void calculateSpecialPower(int age, boolean checkLeap) {
        if ( checkLeap==true && age == 18)
            System.out.println("He has special powers!");
        else
            System.out.println("He has no special powers!");
    }


}
