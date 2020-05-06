package cn.xpbootcamp.fizzbuzz;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if (num % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(num);
    }

}
