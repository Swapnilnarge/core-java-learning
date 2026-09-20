package threads;

class MLThreads1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MLThreads2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class MultipleThreads {
    public static void main(String[] args) {
        MLThreads1 obj1 = new MLThreads1();
        MLThreads2 obj2 = new MLThreads2();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}


//class threads.MLThreads1 extends Thread {
//
//    public void run() {
//
//        for (int i = 1; i <= 100; i++) {
//
//            System.out.println("Hi");
//
//        }
//
//    }
//
//}
//
//class threads.MLThreads2 extends Thread {
//
//    public void run() {
//
//        for (int i = 1; i <= 100; i++) {
//
//            System.out.println("Hello");
//
//        }
//
//    }
//
//}
//
//public class threads.MultipleThreads {
//
//    public static void main(String[] args) {
//
//        threads.MLThreads1 obj1 = new threads.MLThreads1();
//
//        threads.MLThreads2 obj2 = new threads.MLThreads2();
//
//
//        obj1.start();
//
//        obj2.start();
//
//    }
//
//}