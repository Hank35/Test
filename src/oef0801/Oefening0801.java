package oef0801;


public class Oefening0801 {
    
  public static void main( String[] args ) {
      
    Voorraad voorraad = new Voorraad();
    Item item1 = new Boek( "racefiets", 24.00, 9 );
    Item item2 = new Boek( "driewieler", 80.00, 9 );
    Item item3= new Tijdschrift( "vliegtuig", 5.95, 15, "week 2 2016" );
    Item item4 = new Tijdschrift( "mobiel", 5.95, 15, "week 8 2015" );
    Item item5 = new Dvd("staar waars", 50.69, 40);
   
    voorraad.voegtoe( item1 );
    voorraad.voegtoe( item2 );
    voorraad.voegtoe( item3 );
    voorraad.voegtoe( item4 );
    voorraad.voegtoe( item5 );
    voorraad.print();
    

  }
}
