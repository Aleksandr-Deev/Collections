package Transport;

public class Sponsor {

    private final String name;
    private final int amountSupport;

    public Sponsor(String name, int amountSupport) {
        this.name = name;
        this.amountSupport = amountSupport;
    }

    public String getName() {
        return name;
    }

    public int getAmountSupport() {
        return amountSupport;
    }

    public void sponsorRace() {
        System.out.println("Спонсор " + getName() + " проспонсировал заезд на сумму " + getAmountSupport());
    }
}
