package annotations;

class AnnotationC1 {
    public void show() {
        System.out.println(" In annotations.AnnotationC1 show");
    }
}

class AnnotationC2 extends AnnotationC1 {
    @Override
    public void show() {
        System.out.println(" In annotations.AnnotationC2 show");
    }
}

public class AnnotaionsFirst {
    public static void main(String[] args) {
        AnnotationC2 obj = new AnnotationC2();
        obj.show();
    }
}
