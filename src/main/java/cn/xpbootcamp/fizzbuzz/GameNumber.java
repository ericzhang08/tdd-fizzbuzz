package cn.xpbootcamp.fizzbuzz;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (isDividedBy(3)) {
            result.append("Fizz");
        }
        if (isDividedBy(5)) {
            result.append("Buzz") ;
        }
        if (isDividedBy(7)) {
            result.append("Whizz");
        }
        return result.length() == 0 ? String.valueOf(num) : result.toString();
    }

    private boolean isDividedBy(int i) {
        return num % i == 0;
    }
}
