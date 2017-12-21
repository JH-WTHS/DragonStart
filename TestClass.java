import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       Scanner input = new Scanner(System.in);
       ArrayList<Dragon> dragons = new ArrayList<Dragon>();
       
       int num;
       //Ask user how many Dragons
       do{
           System.out.println("How many Dragons would you like to create?");
           num = input.nextInt();
        }
        while(num <=0);
       //Create correct number of Dragons
        for(int i = 1; i <= num; i++){
           Dragon temp = new Dragon(90*i +25, 90*i + 50,1 , new Color(50*i, 50*i, 50*i), "#" + i); //contruct a new Dragon
           dragons.add(temp); //Add the new Dragon to the ArrayList
        }
       //Draw the Dragons
       for(int i = 0; i < dragons.size(); i++){ //Traverse ArrayList of Dragons
           dragons.get(i).drawDragon(g); //Get Dragon from ArrayList to draw it
           dragons.get(i).dragonSayHello(g); //Get Dragon from ArrayList to introduce itself
        }   
       
    }
}
