package Phone;

public class Telephone {
    public int mobileID;
    public String mobileName;
    public int availQuant;

    public Telephone(int mobileID, String mobileName, int availQuant) {
        this.mobileID = mobileID;
        this.mobileName = mobileName;
        this.availQuant = availQuant;
    }

    public void display() {
        System.out.println("Mobile ID: " + mobileID);
        System.out.println("Mobile Name: " + mobileName);
        System.out.println("Available Quantity: " + availQuant);
    }
}

