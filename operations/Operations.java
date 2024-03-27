package operations;

public class Operations {
    private double number;

    public Operations(double number){
        this.number = number;
    }
    public Operations addition(Operations other){
        return new Operations(this.number+other.GetNumber());
    }
    public Operations substruction(Operations other){
        return new Operations(this.number-other.GetNumber());
    }
    public Operations multiplication(Operations other){
        return new Operations(this.number*other.GetNumber());
    }
    public Operations division(Operations other){
        return new Operations(this.number/other.GetNumber());
    }
    public double GetNumber(){
        return number;
    }
}