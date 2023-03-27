package Smart;

import Phone.*;

public class Smartphone extends Telephone {
    boolean E5G;
    boolean foldable;
    boolean dual;

    public Smartphone(int mobileID, String mobileName, int availQuant, boolean E5G, boolean foldable, boolean dual) {
        super(mobileID, mobileName, availQuant);
        this.E5G = E5G;
        this.foldable = foldable;
        this.dual = dual;
    }

    public void display() {
        super.display();
        System.out.println("5G Enabled: " + E5G);
        System.out.println("Foldable: " + foldable);
        System.out.println("Dual Sim: " + dual);
    }

    public int calculate(int purchased) {
        super.availQuant -= purchased;
        return super.availQuant;
    }
}
