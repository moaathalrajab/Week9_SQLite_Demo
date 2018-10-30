package edu.fsc.mobilecomputing.m_alrajab.week9_sqlite_demo;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.fsc.mobilecomputing.m_alrajab.week9_sqlite_demo.model.StudentContract;
import edu.fsc.mobilecomputing.m_alrajab.week9_sqlite_demo.model.StudentDbHelper;

import static edu.fsc.mobilecomputing.m_alrajab.week9_sqlite_demo.model.StudentContract.StudentEntry.*;
import static edu.fsc.mobilecomputing.m_alrajab.week9_sqlite_demo.model.StudentContract.TABLE_NAME;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.std_name_ma)  EditText nameField;
    @BindView(R.id.std_dept_ma)  EditText deptField;
    @BindView(R.id.std_age_ma)  EditText ageField;
    @BindView(R.id.std_address_ma)  EditText addressField;
    @BindView(R.id.tv_ma)  TextView tv;


    StudentDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mDbHelper=new StudentDbHelper(this);

    }


    public void addRecord(View view) {


    }

    public void updateRecord(View view) {
    }

    public void deleteRecord(View view) {
    }
}
