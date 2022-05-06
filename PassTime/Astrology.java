import java.util.Scanner;

public class Astrology {
    public static void main(String[] args) {
        Scanner octo = new Scanner(System.in);

        System.out.println("What month is your birthday?");
        String birthMonth = octo.nextLine();
        System.out.println("What day?");
        int birthDay = octo.nextInt();

        //january
        if (birthMonth.equals("January")) {
            if (birthDay >= 1 && birthDay <= 19) {
                System.out.println("You are a Capricorn!");
            }//end if
            if (birthDay >= 20 && birthDay <= 31) {
                System.out.println("You are an Aquarius!");
            } else {
                System.out.println("Run again.");
            }//end else if
        }//end if

        //february
        if (birthMonth.equals("February")) {
            if (birthDay >= 1 && birthDay <= 18) {
                System.out.println("You are an Aquarius!");
            }//end if
            if (birthDay >= 19 && birthDay <= 29) {
                System.out.println("You are a Pisces!");
            } else {
                System.out.println("Run Again.");
            }//end else ifFe
        }//end if

        //March
        if (birthMonth.equals("Aries")) {
            if (birthDay >= 1 && birthDay <= 20) {
                System.out.println("You are a Pisces!");
            }//end if
            if (birthDay >= 21 && birthDay <= 31) {
                System.out.println("You are an Aries!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //April
        if (birthMonth.equals("April")) {
            if (birthDay >= 1 && birthDay <= 19) {
                System.out.println("You are a Aries!");
            }//end if
            if (birthDay >= 20 && birthDay <= 30) {
                System.out.println("You are a Taurus!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //May
        if (birthMonth.equals("May")) {
            if (birthDay >= 1 && birthDay <= 20) {
                System.out.println("You are a Taurus!");
            }//end if
            if (birthDay >= 21 && birthDay <= 31) {
                System.out.println("You are a Gemini!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //June
        if (birthMonth.equals("June")) {
            if (birthDay >= 1 && birthDay <= 20) {
                System.out.println("You are a Gemini!");
            }//end if
            if (birthDay >= 21 && birthDay <= 30) {
                System.out.println("You are a Cancer!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //July
        if (birthMonth.equals("July")) {
            if (birthDay >= 1 && birthDay <= 22) {
                System.out.println("You are a Cancer!");
            }//end if
            if (birthDay >= 23 && birthDay <= 31) {
                System.out.println("You are a Leo!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //August
        if (birthMonth.equals("August")) {
            if (birthDay >= 1 && birthDay <= 22) {
                System.out.println("You are a Leo!");
            }//end if
            if (birthDay >= 23 && birthDay <= 31) {
                System.out.println("You are a Virgo!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //Septemeber
        if (birthMonth.equals("September")) {
            if (birthDay >= 1 && birthDay <= 22) {
                System.out.println("You are a Virgo!");
            }//end if
            if (birthDay >= 23 && birthDay <= 30) {
                System.out.println("You are a Libra!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //October
        if (birthMonth.equals("October")) {
            if (birthDay >= 1 && birthDay <= 22) {
                System.out.println("You are a Libra!");
            }//end if
            if (birthDay >= 23 && birthDay <= 31) {
                System.out.println("You are an Scorpio!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //November
        if (birthMonth.equals("November")) {
            if (birthDay >= 1 && birthDay <= 21) {
                System.out.println("You are a Scorpio!");
            }//end if
            if (birthDay >= 22 && birthDay <= 30) {
                System.out.println("You are an Sagittarius!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //December
        if (birthMonth.equals("December")) {
            if (birthDay >= 1 && birthDay <= 21) {
                System.out.println("You are a Sagittarius!");
            }//end if
            if (birthDay >= 22 && birthDay <= 31) {
                System.out.println("You are an Capricorn!");
            } else {
                System.out.println("Run Again.");
            }//end else if
        }//end if

        //System.out.println(birthMonth + " " + birthDay);

        octo.close();
    }//end main
}//end Astrology