import Project.NumMath;

import View.InputData;
import View.Log;
import View.LogConsole;
import View.LogFile;

public class Presenter {
    private Log currentLog;
    private String pathLog;

    /**
     * Конструктор
     *
     * @param startLog задание первоначального интерфейса для вывода
     */
    public Presenter(Log startLog) {
        this.currentLog = startLog;
        pathLog = "log.txt";
    }

    /**
     * Процедура завершения программы
     *
     * @param message Сообщение для записи в лог при завершении программы
     * @return возращает false для завершения
     */
    private boolean stop(String message) {
        currentLog.writeMessage("Завершение работы");
        currentLog.setLog(new LogFile(pathLog));
        currentLog.writeLog(message);
        return false;
    }

    /**
     * Выбор операции над числами
     *
     * @param number1 первое число
     * @param number2 второе число
     * @param operand операция с числами
     * @return результат
     */
    private Number calculations(Number number1, Number number2, String operand) {
        switch (operand) {
            case "+":
                return NumMath.add(number1, number2);
            case "*":
                return NumMath.multiply(number1, number2);
            case "/":
                return NumMath.divide(number1, number2);
            default:
                throw new IllegalStateException("Неизвестный операнд: " + operand);
        }
    }

    private boolean operation() {

        String data;

        Number number1;
        while (true) {
            number1 = currentLog.writeMessage("Введите число");
            data = InputData.getData();
            break;

        }

        String operand;

        while (true) {
            currentLog.writeMessage("Введите операцию + * /");
            operand = InputData.getData();
            if (operand.matches("[+*/]")) {
                break;
            } else {
                currentLog.writeMessage("Неверно");
            }

        }

        Number number2;
        while (true) {
            number2 = currentLog.writeMessage("Введите второе число");
            data = InputData.getData();
            break;

        }
        Number result = calculations(number1, number2, operand);
        currentLog.writeMessage(number1 + " " + operand + " " + number2 + " = " + result);
        currentLog.setLog(new LogFile(pathLog));
        currentLog.writeLog(number1 + " " + operand + " " + number2 + " = " + result);
        currentLog.setLog(new LogConsole());
        return true;
    }

    /**
     * Стартовая процедура
     *
     */
    public void start() {
        currentLog.writeMessage("Калькулятор чисел");
        boolean run = true;
        String data;
        while (run) {
            currentLog.writeMessage("Выберите действие\n1. Операции c числами\n2. Выход");
            data = InputData.getData();
            switch (data) {
                case "1":
                    run = operation();
                    break;
                case "2":
                    run = stop("Exit");
                    break;
                default:
                    currentLog.writeMessage("Неверный ввод");
            }
        }
    }
}
