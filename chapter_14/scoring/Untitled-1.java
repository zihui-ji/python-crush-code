// Import the HashMap class
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {

  HashMap<String,String> fruit = new HashMap<String, String>();

  Fruit.put("apple", "red");
  Fruit.put("banana", "yellow");
  Fruit.put("watermelon", "green");

  For(String i:fruit.keyset()) {
   Fruit.remove("apple");
   System.out.println("Name: " +i + "color: " +fruit.get(i));

     }

   }
}