package cn.xpbootcamp.fizzbuzz;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    public String say() {
        StringBuilder result = new StringBuilder();
        if (isDividedBy(3) || Contains(3)) {
            result.append("Fizz");
        }
        if (Contains(3)) {
            return result.toString();
        }
        if (isDividedBy(5)) {
            result.append("Buzz") ;
        }
        if (isDividedBy(7)) {
            result.append("Whizz");
        }
        return result.length() == 0 ? String.valueOf(num) : result.toString();
    }

    private  boolean Contains(int n) {
        return String.valueOf(this.num).contains(String.valueOf(n));
    }

    private boolean isDividedBy(int i) {
        return num % i == 0;
    }
}
