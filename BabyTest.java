package ClassTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BabyTest {
    @Test
    public void requiredArgsConstructorTest() {
        Baby newBaby = new Baby(15);
        assertEquals(15, newBaby.getWeight());
        assertEquals(0, newBaby.getAge());
        assertEquals(null, newBaby.getName());

        Baby nextBabym = new Baby(7, "Ade");
        assertEquals(0, nextBabym.getWeight());
        assertEquals(7, nextBabym.getAge());
        assertEquals("Ade", nextBabym.getName());

        Baby lolaBabym = new Baby("Lola Baby");
        assertEquals(0, lolaBabym.getWeight());
        assertEquals(0, lolaBabym.getAge());
        assertEquals("Lola Baby", lolaBabym.getName());
    }
}
