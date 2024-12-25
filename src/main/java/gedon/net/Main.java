package gedon.net;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lumineux lumineux = new Lumineux("Lumineux", 54);
        Obscur obscur = new Obscur("Obscur", 47);
        lumineux.rencontre(obscur);
        obscur.rencontre(lumineux);
    }

}