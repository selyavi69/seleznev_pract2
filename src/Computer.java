public class Computer {
    private String name;
    private double price;

    public Computer(String name, double price){
        this.name=name;
        this.price=price;

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Computer{" + "name=" + name + '\n' + "price=" + price + "}";
    }
}
