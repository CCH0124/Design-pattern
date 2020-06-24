package adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {

            @Override
            public void m1() {
                // TODO Auto-generated method stub
                System.out.println("m1");
            }

            @Override
            public void m3() {
                // TODO Auto-generated method stub
                System.out.println("m3");
            }
            
        };

        absAdapter.m1();
        absAdapter.m3();
    }
}