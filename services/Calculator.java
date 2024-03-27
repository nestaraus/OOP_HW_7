package services;
import operations.Operations;

class Calculator {
    private Task task;

    public void setTask(Task task){
        this.task =task;
    }

    public void startTask(Operations num1, Operations num2){
        Operations result = task.task(num1, num2);
        Log.log("Результат: "+ result.GetNumber());
    }
}
