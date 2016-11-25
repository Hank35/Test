package oef0801;
import java.util.ArrayList;

public class Voorraad {
  private ArrayList<Item> lijst;
  
  public Voorraad() {
  	lijst = new ArrayList<Item>();
  }
  
  public void voegtoe( Item item ) {
  	lijst.add( item );
  }
  
  public void print() {
  	System.out.println( "Voorraad" );
  	for( Item item : lijst ) {
      System.out.println( item );
  	}
  }
}
