
public class TomatoSauce extends ToppingDecorating {
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Adding Sauce");
        System.out.println("Adding Tomato");
    }

    public String getDescription(){
        return tempPizza.getDescription() + "TomatoSauce";
    }

    public double getCost(){
        return tempPizza.getCost() + 1.00;
    }
}
