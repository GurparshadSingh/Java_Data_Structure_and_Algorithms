public class getandset{
    public static void main(String args[]){
      Pen p1 = new Pen();// created a pen object called p1
      p1.setColor("Blue");
      System.out.print(p1.getColor());
      p1.setTip(5);
      System.out.print(p1.getTip());

     
    }
}

class Pen{
    private String Color;
    private int Tip;
    
    String getColor() {
        return this.Color;
    }

     int getTip() {
        return this.Tip;
    }


    void setColor(String newColor){
      Color = newColor;
    }

    void setTip(int newTip){
           Tip = newTip;
    }
}



