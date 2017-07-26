
abstract class ToppingDecorating implements Pizza {

    protected  Pizza tempPizza;

    public ToppingDecorating(Pizza newPizza){

           tempPizza = newPizza;
    }
    public String getDescription(){
        return   tempPizza.getDescription();
    }

    public double getCost(){
        return tempPizza.getCost();
    }
}
