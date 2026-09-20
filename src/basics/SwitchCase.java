package basics;

public class SwitchCase {
    public static void main(String[] args) {
        String day = "Monday";
        String result = "";
        result = switch (day) {
            case "saturday", "Sunday" :yield "7am";
            case "Monday" :yield "8am";
            default :yield  "9am";


        };
        System.out.println(result);

//        String day = "saturday";
//        switch (day) {
//            case "saturday", "Sunday" -> System.out.println("7am");
//
//
//            case "Monday" -> System.out.println("8am");
//
//
//            case "Tue", "Wen" -> System.out.println("8am");
//
//
//            default -> System.out.println("8am");
//
//
//        }

//        int n = 10;
//        switch (n) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("wendesday");
//                break;
//
//            case 4:
//                System.out.println("thursday");
//                break;
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter a valid number");


    }

}

