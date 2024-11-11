package hu.szamalk;

public class MertaniHenger {
    private static int hengerDB;
    private double sugar,magassag;

    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDB() {
        return hengerDB;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
public double terfogat(){
        return 0.0;
}

    @Override
    public String toString() {
        return "MertaniHenger{" +
                "sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
