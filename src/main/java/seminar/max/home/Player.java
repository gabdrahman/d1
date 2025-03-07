package seminar.max.home;

/**
 * Класс для описания игрока
 *
 * @param name имя игрока
 * @param risk стратегия игрока, если true игрок меняет дверь
 */
public record Player(String name, boolean risk) {

}
