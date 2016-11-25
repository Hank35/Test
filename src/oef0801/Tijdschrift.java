package oef0801;
public class Tijdschrift extends Item {
  private String weeknr;
  
  public Tijdschrift( String titel, double prijs, int aantal, String weeknr ) {
    super( titel, prijs, aantal );
    this.weeknr = weeknr;
  }
  
  public String getWeeknr() {
    return weeknr;
  }
  
  public String toString() {
    return super.toString() + " uitgave " + getWeeknr();
  }
}      