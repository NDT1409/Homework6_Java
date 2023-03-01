package homework2;


public class Task1 {

    public static void main(String[] args) {

        int month = 1;

        switch (month) {
            case 1, 2, 12:
                switch (month) {
                    case 1:
                        System.out.println("Jan");
                        break;
                    case 2:
                        System.out.println("Feb");
                        break;
                    case 12:
                        System.out.println("Dec");
                        break;
                }
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                switch (month) {
                    case 3:
                    System.out.println("March");
                    break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                }
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                switch (month) {
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                }
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                switch (month) {
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                }
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Please enter month from 1-12");
                break;
        }
        System.out.println("App finished work.");
    }
}
