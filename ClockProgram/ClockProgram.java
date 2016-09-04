
package clock.program;


public class ClockProgram {

   
    public static void main(String[] args) {
   
       ClockprogramClass Object= new ClockprogramClass();
       Object.setTime(11, 40, 20); //setting the time with the following parameters
       System.out.println(Object.toNormal()); /*prints out the normal time */
    }
    
}
