/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lasitha Ranawaka
 */
public class currentdate {
    
    public static String currentdate1;
    public static String getselected_calenderdate;
    public static String time_duration;

    public static String today() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        return format;

    }
    
    
    
    
   
}
