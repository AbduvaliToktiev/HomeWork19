package task3.product;

public class Compound {
    private Compound[] compounds;

    public Compound[] getCompounds() {
        return compounds;
    }

    public void setCompounds(Compound[] compounds) {
        this.compounds = compounds;
    }

    @Override
    public String toString() {
        return "Compound : " +
                "name = " + name;
    }

    private String name;

   public Compound() {

   }
    public Compound(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
