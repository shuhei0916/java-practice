public class Calc {
    public static void main(String[] args){
        System.out.println("hehe");
        int a = 10; int b = 2;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "、ひくと" + delta);
    }
}
