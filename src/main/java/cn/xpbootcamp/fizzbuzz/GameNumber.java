package cn.xpbootcamp.fizzbuzz;

public class GameNumber {
    private int num;

    public GameNumber(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (num % 3 == 0) {
            result.append("Fizz");
        }
        if (num % 5 == 0) {
            result.append("Buzz") ;
        }
        if (num % 7 == 0) {
            result.append("Whizz");
        }
        return result.length() == 0 ? String.valueOf(num) : result.toString();
    }

}
