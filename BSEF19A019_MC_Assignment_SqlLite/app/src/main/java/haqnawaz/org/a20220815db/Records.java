package haqnawaz.org.a20220815db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

public class Records extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        listView = findViewById(R.id.listView);
        DBHelper dbHelper = new DBHelper(Records.this);
        List<StudentModel> list = dbHelper.getAllStudents();
        ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>
                (Records.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }
}