package models;

import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void Player_instantiatesCorrectly() {
        Player newPlayer =  new Player("qwerty");

        assertEquals(true, newPlayer instanceof Player);
    }
}