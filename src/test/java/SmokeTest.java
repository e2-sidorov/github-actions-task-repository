import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmokeTest {

    @Test
    void envIsPassed() {
        String env = System.getProperty("env");
        System.out.println("Running on env: " + env);
        assertNotNull(env, "env property must be passed from pipeline");
    }
}
