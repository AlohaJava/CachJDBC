import Cache.ChacheProxy;


public class Main {

    public static void main(String[] args) {
        Test testImp = new ChacheProxy().cache(new TestImp());
        System.out.println(testImp.test(6));
        System.out.println(testImp.test(5));
        System.out.println(testImp.test(8));
    }
}
