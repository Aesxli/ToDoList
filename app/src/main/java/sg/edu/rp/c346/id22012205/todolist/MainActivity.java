package sg.edu.rp.c346.id22012205.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<ToDoItem> alTDL;
CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        alTDL=new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2023, 9, 11);
        Calendar date2 = Calendar.getInstance();
        date2.set(2023, 9, 12);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);

        alTDL.add(item1);
        alTDL.add(item2);
        adapter=new CustomAdapter(this,R.layout.rows,alTDL);
        lv.setAdapter((adapter));
    }
}