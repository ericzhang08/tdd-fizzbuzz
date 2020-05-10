package cn.xpbootcamp.fizzbuzz;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    public String say() {
        StringBuilder result = new StringBuilder();
        if (Contains(7)) {
            if (isDividableBy(3)) {
                result.append("Fizz") ;
            }
            if (isDividableBy(7)) {
                result.append("Whizz");
            }
            return result.toString();
        }
        if(Contains(5)){
            if (isDividableBy(5)) {
                result.append("Buzz") ;
            }
            if (isDividableBy(7)) {
                result.append("Whizz");
            }
            return result.toString();

        }
        if (isDividableBy(3) || Contains(3)) {
            result.append("Fizz");
        }
        if (Contains(3)) {
            return result.toString();
        }
        if (isDividableBy(5)) {
            result.append("Buzz") ;
        }
        if (isDividableBy(7)) {
            result.append("Whizz");
        }

        return result.length() == 0 ? String.valueOf(num) : result.toString();
    }

    private  boolean Contains(int n) {
        return String.valueOf(this.num).contains(String.valueOf(n));
    }

    private boolean isDividableBy(int i) {
        return num % i == 0;
    }
}
