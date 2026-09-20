package oop;

interface Computer {
    void code();
}

class LaptopNI implements Computer {
    public void code() {
        System.out.println("Working on Laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Working on oop.Desktop");
    }
}


class Developer {
    public void devApp(Computer obj) {
        obj.code();
    }
}

public class NeedOInterfaces {
    public static void main(String[] args) {
        Developer swapnil = new Developer();
        Computer lap = new LaptopNI();
        Computer desk = new Desktop();
        swapnil.devApp(lap);
    }
}
