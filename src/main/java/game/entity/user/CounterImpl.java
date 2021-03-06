package game.entity.user;

public class CounterImpl implements Counter{
    private int wins;
    private int lose;
    private int draw;
    private int score;

    @Override
    public void win(){
        wins++;
        score++;
    }

    @Override
    public void lose(){
        lose++;
        score--;
    }

    @Override
    public void draw() {
        draw++;
    }

    @Override
    public void reset(){
        wins = 0;
        lose = 0;
        draw = 0;
        score = 0;
    }

    @Override
    public int getWinCount() {
        return wins;
    }

    @Override
    public int getLoseCount() {
        return lose;
    }

    @Override
    public int getDrawCount() {
        return draw;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "wins=" + wins +
                ", lose=" + lose +
                ", draw=" + draw +
                ", score=" + score;
    }
}
