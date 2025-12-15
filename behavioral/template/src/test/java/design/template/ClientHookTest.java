package design.template;

import design.template.hook.TeaWithHook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ClientHookTest {
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private TeaWithHook tea;

    @BeforeEach
    void setUp() {
        tea = new TeaWithHook();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }


    @Test
    void testCustomerWantsCondiments_Yes() {

        String simulatedInput = "y";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));


        boolean result = tea.customerWantsCondiments();


        assertTrue(result, "當輸入為 'y' 時，應該回傳 true");
    }

    @Test
    void testCustomerWantsCondiments_No() {

        String simulatedInput = "n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        boolean result = tea.customerWantsCondiments();


        assertFalse(result, "當輸入為 'n' 時，應該回傳 false");
    }

    @Test
    void testCustomerWantsCondiments_CaseInsensitive() {

        String simulatedInput = "YES";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        boolean result = tea.customerWantsCondiments();

        assertTrue(result, "輸入 'YES' 應該被視為 true (startsWith 'y')");
    }


    @Test
    void testBrew() {
        tea.brew();


        assertEquals("Steeping the tea", outContent.toString().trim());
    }


    @Test
    void testAddCondiments() {
        tea.addCondiments();

        assertEquals("Adding Lemon", outContent.toString().trim());
    }
}
