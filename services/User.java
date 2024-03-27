package services;
import operations.Operations;
import java.util.Scanner;

public class User {
    public static void main(String[] argsStrings) {
        Scanner scanner = new Scanner(System.in);

        Operations num1 = new Operations(87.0);
        Operations num2 = new Operations(2.3);

        Calculator calculator = new Calculator();

        Log.log("Выберите действие:");
        Log.log("Нажмите 1, чтобы сложить");
        Log.log("Нажмите 2, чтобы вычесть");
        Log.log("Нажмите 3, чтобы умножить");
        Log.log("Нажмите 4, чтобы поделить");
        int input = scanner.nextInt();
        System.out.println(input);
        switch (input) {
            case 1 -> calculator.setTask(new Task(){
            @Override
            public Operations task(Operations num1, Operations num2){
                return num1.addition(num2);
            }
            });
            case 2 -> calculator.setTask(new Task(){
            @Override
            public Operations task(Operations num1, Operations num2){
                return num1.substruction(num2);
            }
            });
            case 3 -> calculator.setTask(new Task(){
            @Override
            public Operations task(Operations num1, Operations num2){
                return num1.multiplication(num2);
            }
            });
            case 4 -> calculator.setTask(new Task(){
            @Override
            public Operations task(Operations num1, Operations num2){
                return num1.division(num2);
            }
            });
            default -> Log.log("Выбрана неверная операция");
        }
        
        calculator.startTask(num1,num2);
    }
}
