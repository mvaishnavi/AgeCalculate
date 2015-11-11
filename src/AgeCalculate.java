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
        computeAge(currentYear,birthYear);
        int leap= calculateLeapYear(birthYear);
        if(leap==1)
            System.out.println("BirthYear is a Leap year");
        else
            System.out.println("Birthyear is not a leap year.");
    }

    private static void computeAge(int currentYear, int birthYear ) {
        int age= currentYear- birthYear;
        System.out.println("The current age of dob=31.8.1993 is" + age);
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


}
