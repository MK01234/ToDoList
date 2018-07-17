package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 17045740 on 17/7/2018.
 */

public class ItemList {

    private String name;
    private Calendar date;

    public ItemList(String name, Calendar date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Calendar getDate(){
        return date;
    }
    public Calendar setDate(){
        return date;
    }


    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);

        return str;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "To Do This{" +
                "Title='" + name + '\'' +
                ", date='" + getDateString() + '\'' +
                '}';
    }
}

