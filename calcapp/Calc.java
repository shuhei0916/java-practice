package calcapp.main;
import calcapp.logics.*; // calcapp.logicsパッケージに所属するすべてのクラスをインポート

public class Calc {
    public static void main(String[] args) {
        int a = 10; int b = 2;
        int total = CalcLogic.tasu(a, b);
        System.out.println("added result: " + total);
    }
}