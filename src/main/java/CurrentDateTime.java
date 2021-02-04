import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    
    CurrentDateTime(){
    
    }
    
    Date today,timeNow;

    public String getDate() 
    {
      today = new Date();
      SimpleDateFormat ft = 
      new SimpleDateFormat ("dd/MM/yyyy");

      return ft.format(today);
    }

    public String getTime() 
    {
       timeNow = new Date();
       SimpleDateFormat ft = 
       new SimpleDateFormat ("hh:mma");

       return ft.format(timeNow);
    }
}
