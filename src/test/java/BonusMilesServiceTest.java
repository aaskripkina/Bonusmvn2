import static org.junit.jupiter.api.Assertions.*;

public class BonusMilesServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();


        long amount = 1000;
        boolean registered = true;
        long expected = 30;


        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();


        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;


        long actual = service.calculate(amount, registered);


        assertEquals(expected, actual);
    }
}
