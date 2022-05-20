class Calculation {
    int add(int x, int y) {
        int result = x + y;
        return result;
    }

    int subtract(int x, int y) {
        int result = x - y;
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        int addResult = calculation.add(100, 90);
        int subResult = calculation.subtract(90, 70);

        System.out.println("더하기 값은 " + addResult);
        System.out.println("빼기 값은 " + subResult);
    }
}