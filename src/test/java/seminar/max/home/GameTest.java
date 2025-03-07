package seminar.max.home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Тест кейс для тестирования методов порадокса
 */
public class GameTest extends AbstractTest {

    @Test
    void checkNotRiskWin() {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void checkNotRiskLose() {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(1);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void checkRiskWin(int num) {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(num);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    void checkRiskLose() {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    /**
     * Negative Tests
     */

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void checkNotRiskWinNegative(int numDoor) {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(numDoor);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @Test
    void checkNotRiskLoseNegative() {
        //given
        Player player = new Player("Игрок", false);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertTrue(door.isPrize());
    }

    @Test
    void checkRiskWinNegative() {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(0);
        //then
        Assertions.assertFalse(door.isPrize());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    void checkRiskLoseNegative(int num) {
        //given
        Player player = new Player("Игрок", true);
        Game game = new Game(player, doors);
        //when
        Door door = game.round(num);
        //then
        Assertions.assertTrue(door.isPrize());
    }
}
