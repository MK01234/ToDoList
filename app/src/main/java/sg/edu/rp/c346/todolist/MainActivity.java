package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<ItemList> alitem;
    CustomAdapter caItem;
    Calendar date;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.lvitem);
        Calendar date1 = Calendar.getInstance();
        date1.set(2018, 7, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018, 9, 22);

        {


            alitem = new ArrayList<>();
            ItemList item1 = new ItemList("MSA", date1);
            ItemList item2 = new ItemList("Go For Haircut", date2);
            alitem.add(item1);
            alitem.add(item2);

            caItem = new CustomAdapter(this, R.layout.todolist, alitem);

            lvMovie.setAdapter((ListAdapter) caItem);

        }


    }
}

