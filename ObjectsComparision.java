public class ObjectsComparision {
    public static void main(String[] args) {
        // create two Laptop objects with the same name and price
        Laptop laptop1 = new Laptop("MacBook Pro", 2000);
        Laptop laptop2 = new Laptop("MacBook Pro", 2001);

        // compare the two objects using the equals() method
        boolean isEqual = laptop1.equals(laptop2);

        // print the result
        System.out.println("Laptop 1 is equal to Laptop 2: " + isEqual);
    }
}

class Laptop {
    private String laptopName;
    private int laptopPrice;

    public Laptop(String laptopName, int laptopPrice) {
        this.laptopName = laptopName;
        this.laptopPrice = laptopPrice;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Laptop)) {
            return false;
        }
        Laptop other = (Laptop) o;
        return this.laptopName.equals(other.laptopName) && this.laptopPrice == other.laptopPrice;
    }
}