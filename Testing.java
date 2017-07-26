
public class Testing {

      public static void main(String[] args){

          Pizza basicPizza = new Mozzarella(new TomatoSauce(new PlainPizza()));

          System.out.println("Ingredient: " + basicPizza.getDescription());
          System.out.println("Cost " + basicPizza.getCost());
      }
}
