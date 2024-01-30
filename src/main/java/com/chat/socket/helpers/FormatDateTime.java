package com.chat.socket.helpers;

import java.time.LocalDateTime;

public class FormatDateTime {
    
    public static String[] FormatDateTimeString(LocalDateTime dateTimeCore){
        String dateString = dateTimeCore.getYear() + "-" + dateTimeCore.getMonthValue() + "-" + dateTimeCore.getDayOfMonth();
        String timeString = dateTimeCore.getHour() + ":" +dateTimeCore.getMinute();
        String[] datimeArray = {dateString,timeString};
        return datimeArray; 
    }
}