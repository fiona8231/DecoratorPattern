
public class Mozzarella extends ToppingDecorating {


 public Mozzarella(Pizza newPizza) {
  //super --> ToppingDecorating
  super(newPizza);

  System.out.println("Adding Dough");
  System.out.println("Adding Moz");
 }

 public String getDescription(){
  return tempPizza.getDescription() + " Mozzarella";
 }

 public double getCost(){
  return tempPizza.getCost() + 4.00;
 }
}
