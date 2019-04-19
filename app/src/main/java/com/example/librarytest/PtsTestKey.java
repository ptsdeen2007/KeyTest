package com.example.librarytest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class PtsTestKey {
    public static String getcurrentDate() {
        Calendar myCalendar = Calendar.getInstance();
        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        return sdf.format(myCalendar.getTime());
    }
}
