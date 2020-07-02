package template.improve;

public class Client {
    public static void main(String[] args) {
        System.out.println("make read bean");
        SoyaMilk readBean = new RedBeanSoyaMilk();
        readBean.make();

        System.out.println("make 花生");
        SoyaMilk peanut = new PeanutSoyaMilk();
        peanut.make();

        System.out.println("make 純豆漿");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}