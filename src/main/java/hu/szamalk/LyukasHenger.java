package hu.szamalk;

public class LyukasHenger extends TomorHenger{
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double fajsuly, double falvastagsag) {
        super(sugar, magassag, fajsuly);
        this.falvastagsag = falvastagsag;
    }
}
