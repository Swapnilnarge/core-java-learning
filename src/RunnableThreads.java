//class Rt1 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}

//class Rt2 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
public class RunnableThreads {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello");
            }
        });

        t1.start();
        t2.start();
    }
}


//public class RunnableThreads {
//    public static void main(String[] args) {
//
//        // Clean, modern lambda syntax
//        Thread t1 = new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("Hello");
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("Hello");
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }
//}


//public class RunnableThreads {
//    public static void main(String[] args) {
//
//        // Creating a thread with an anonymous Runnable on the fly
//        Thread t1 = new Thread(new Runnable() {
//            public void run() {
//                for (int i = 1; i <= 10; i++) {
//                    System.out.println("Hello from Thread 1");
//                }
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            public void run() {
//                for (int i = 1; i <= 10; i++) {
//                    System.out.println("Hello from Thread 2");
//                }
//            }
//        });
//
//        t1.start();
//        t2.start();
//    }
//}