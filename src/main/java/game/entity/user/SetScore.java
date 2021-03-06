package game.entity.user;

public interface SetScore {
    /**
     * Вызывается при победе. Должен увеличивать счетчик побед.
     */
    void win();

    /**
     * Вызывается при поражении. Должен увеличивать счетчик поражений.
     */
    void lose();

    /**
     * Вызывается при ничьей. Должен увеличивать счетчик ничьих.
     */
    void draw();
}
