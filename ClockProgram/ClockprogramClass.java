
package clock.program;


public class ClockprogramClass {
    int hours,minutes,seconds; 

    public void setTime(int h, int m, int s){ /*creating this function to set
        the time, with a manual user input
        */
     hours=((h>=0 && h<=24)?h:0); //limits set for what the time could be
     minutes=((m>=0 && m<=60)?m:0);/* Only if the manually inputted numbers fit
     do the actual variables get initialized
     */
     seconds=((s>=0 && s<=60)?s:0);
        
    }
    public String toMilitary() {
    return String.format("%02d:%02d:%02d", hours, minutes, seconds);/*sets the
    military time for inputted numbers
    */
}
    public String toNormal(){
        return String.format("%2d:%02d:%02d %s", ((hours==0 || hours==12)?
                12:hours%12), minutes, seconds, (hours>12)?"PM":"AM");
    }
    /*sets the normal time 
    
    */
    
}
