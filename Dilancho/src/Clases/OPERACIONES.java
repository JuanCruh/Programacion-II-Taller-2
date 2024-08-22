package Clases;

public class OPERACIONES {
    private int num1;
    private int num2;
    private int answer;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int suma() {
        answer = num1 + num2;
        return answer;
    }

    public int resta() {
        answer = num1 - num2;
        return answer;
    }

    public int multiplicación() {
        answer = num1 * num2;
        return answer;
    }
}
