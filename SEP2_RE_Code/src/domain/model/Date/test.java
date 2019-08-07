package domain.model.Date;

import java.util.Calendar;

public class test {


    public static void main(String args[]) {
        Calendar givenDate;
        int day = 0;

        Date date = new Date(Calendar.getInstance());
        //System.out.print(date.getCurrentWeekDay());
        int currentDay = date.getCurrentWeekDay();
        //System.out.print(date.toString());
        //System.out.print(date.getFirstDayOfWeek());

        givenDate = date.getFirstDayOfWeek();

        for(int i = 0; i < 7; i++)
        {
            Date newDate = new Date(givenDate);
            System.out.print(newDate.toString() + " ");
            givenDate.add(Calendar.DATE, +1);

        }





    }
}
