package org.ocpsoft.prettytime.i18n;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.ocpsoft.prettytime.PrettyTime;

/**
 * @author : Omid Pourhadi omidpourhadi [AT] gmail [DOT] com
 */
public class PrettyPersianTest
{

    public static void main(String[] args)
    {
        PrettyPersianTest ppt = new PrettyPersianTest();
        ppt.testMonth();
        ppt.testYear();
    }

    public void testMonth()
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
        PrettyTime pt = new PrettyTime(new Locale("fa"));
        System.out.println(pt.format(cal.getTime()));
        PrettyTime pt2 = new PrettyTime();
        System.out.println(pt2.format(cal.getTime()));
    }

    public void testYear()
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + 1);
        PrettyTime pt = new PrettyTime(new Locale("fa"));
        System.out.println(pt.format(cal.getTime()));
        PrettyTime pt2 = new PrettyTime();
        System.out.println(pt2.format(cal.getTime()));
    }
    
    

}
