public class OOPS{
    public static void main(String args[]){
    //   pen p1 = new pen();// created a pen object called p1
      
    //   p1.setColor("Blue");
    //   System.out.print(p1.Color);
      
    //   p1.setTip("5")
    //   System.out.print(p1.Tip);

      Bankaccount Myacc1= new Bankaccount(); 
         Myacc1.username="Gurparshad Singh";
         Myacc1.password="abc123";
    }
}

// class Pen{
//     String Color;
//     int Tip;

//     void setColor(String newColor){
//       Color = newColor;
//     }

//     void setTip(int newTip){
//            Tip = newTip;
//     }
// }

// class Student{

//    String name;
//    int age;
//    float percentage;
//      void calcPercentage(int Phy, int Chem, int Maths){
//         percentage = (Phy + Chem + Maths)/3;

//      }
// }
class Bankaccount{
 public String username;
 private String password;

}