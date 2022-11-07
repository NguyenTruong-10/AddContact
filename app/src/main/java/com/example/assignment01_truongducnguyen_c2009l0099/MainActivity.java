package com.example.assignment01_truongducnguyen_c2009l0099;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.assignment01_truongducnguyen_c2009l0099.listStd.adapter.listStdAdapter;
import com.example.assignment01_truongducnguyen_c2009l0099.listStd.model.StudentModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Button btnAddNewContact;
    ListView listView;
    listStdAdapter studentAdapter;
    List<StudentModel> studentModels;
    private EditText edt_ho_va_ten;
    private EditText edt_ma_hoc_sinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configView();
        configListView();
        addListener();
    }
    private void configView() {
        btnAddNewContact = findViewById(R.id.btn_add_new_contact);
        listView = findViewById(R.id.list_view_contacts);
        edt_ho_va_ten = findViewById(R.id.txt_ho_va_ten);
        edt_ma_hoc_sinh = findViewById(R.id.txt_ma_sinh_vien);
    }
    private void configListView() {
        studentModels = new ArrayList<>();
        studentAdapter = new listStdAdapter(studentModels);
        listView.setAdapter(studentAdapter);
    }

    private void addListener() {
        btnAddNewContact.setOnClickListener(view -> {
            String name1 = edt_ho_va_ten.getText().toString();
            String rollNumber1 = edt_ma_hoc_sinh.getText().toString();
            Log.e(TAG, "Onclick: "+ name1);
            StudentModel contactModel = new StudentModel();
            contactModel.setName(name1);
            contactModel.setRollNumber(rollNumber1);
            studentModels.add(contactModel);
            studentAdapter.notifyDataSetChanged();
        });
    }
}