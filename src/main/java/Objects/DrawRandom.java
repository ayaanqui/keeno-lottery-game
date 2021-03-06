package Objects;

import java.util.TreeSet;
import java.util.Random;

public class DrawRandom {
    private int max;
    private int draws;
    private int numDraws;

    /**
     *
     * @param max Upper limit of the random number range
     * @param draws Number of random numbers that will be generated
     * @param numDraws The number of times we want to draw the set of random numbers
     */
    public DrawRandom(int max, int draws, int numDraws) {
        this.max = max;
        this.draws = draws;
        this.numDraws = numDraws;
    }

    public TreeSet<Integer> draw() {
        TreeSet<Integer> randomValues = new TreeSet<>();

        final int min = 1;
        final int param = (this.max - min) + 1;

        for (int i = 0; i < this.draws; i++) {
            Random rand = new Random();
            while (!randomValues.add(rand.nextInt(param) + min));
        }
        return randomValues;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getNumDraws() {
        return numDraws;
    }

    public void setNumDraws(int numDraws) {
        this.numDraws = numDraws;
    }
}
