package App;

// Membuat class dengan nama Calculator
public class Calculator {
    private int operan1, operan2;
    private float hasilBagi; 
    
    public void setOperan1(int x) {
        this.operan1 = x;
    }
    public void setOperan2(int y) {
        this.operan2 = y;
    }
    public int getTambah() {
        return operan1 + operan2;
    }
    public int getKurang() {
        return operan1 - operan2;
    }
    public int getKali() {
        return operan1 * operan2;
    }
    public float getBagi() {
        this.hasilBagi = (float)operan1 / operan2;
        return hasilBagi;
    }
    public int getModulus() {
        return operan1 % operan2;
    }
}
