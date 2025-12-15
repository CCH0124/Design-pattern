package design.template;

import org.junit.jupiter.api.Test;

public class ClientTest {

    @Test
    public void clientTest() {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
