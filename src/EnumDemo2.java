enum Status2 {
    Running, Failed, Pending, Success;
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Status2 s = Status2.Pending;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                 System.out.println("Wait a sec");
                 break;
            default:
                System.out.println("All Good" );
        }
    }
}
//        if (s == Status2.Running) {
//            System.out.println("All Good");
//
//        } else if (s == Status2.Failed) {
//            System.out.println("Try Again");
//
//        } else if (s == Status2.Pending) {
//            System.out.println("Wait a sec");
//
//        } else {
//            System.out.println("Done");
//        }
//    }
//}
