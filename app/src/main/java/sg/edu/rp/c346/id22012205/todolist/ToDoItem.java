package sg.edu.rp.c346.id22012205.todolist;

import android.icu.text.CaseMap;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)
                +"/"+date.get(Calendar.YEAR) + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";

        return str;
    }
    private String getDay(int day) {
        String dayn="";
        if(day==1){
            dayn="Monday";
        }else if(day==2){
            dayn="Tuesday";
        }else if(day==3){
            dayn="Wednesday";
        }else if(day==4){
            dayn="Thursday";
        }else if(day==5){
            dayn="Friday";
        }
        return dayn;

    }

}
