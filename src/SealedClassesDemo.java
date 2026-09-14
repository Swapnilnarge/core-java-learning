sealed class SealedCDemoC2 permits SealedCDemoC3 , SealedCDemoC4 {

}
non-sealed class SealedCDemoC3 extends SealedCDemoC2 {

}
final class SealedCDemoC4 extends SealedCDemoC2 {

}
class SealedCDemo5 extends  SealedCDemoC3 {

}
public class SealedClassesDemo {
    public static void main(String[] args) {

    }
}
