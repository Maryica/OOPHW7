package Project;

/**
 * Класс для математических операций с числами
 *
 */
public class NumMath {
    Number number;

    /**
     * Сложение двух чисел
     * 
     * @param number1 первое число
     * @param number2 второе число
     * @return результат сложения чисел
     */
    public static Number add(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    /**
     * Умножение первого числа на второе
     * 
     * @param n1 первое число
     * @param n2 второе число
     * @return результат
     */
    public static Number multiply(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    /**
     * Деление первого числа на второе
     * 
     * @param n1 первое число
     * @param n2 второе число
     * @return результат деления чисел
     */
    public static Number divide(int n1, int n2) {
        if (n2 == 0) {

            return 000;
        } else {
            return n1 / n2;
        }
    }

    public static Number multiply(Number number1, Number number2) {
        return null;
    }

    public static Number divide(Number number1, Number number2) {
        return null;
    }

    public static Number add(Number number1, Number number2) {
        return null;
    }
}
