package com.example.assignment01_truongducnguyen_c2009l0099.listStd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.assignment01_truongducnguyen_c2009l0099.R;
import com.example.assignment01_truongducnguyen_c2009l0099.listStd.adapter.listStdAdapter;
import com.example.assignment01_truongducnguyen_c2009l0099.listStd.model.StudentModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class listStudetActivity extends AppCompatActivity {

//    private static final String TAG = listStudetActivity.class.getSimpleName();
//
//    Button btnAddNewContact;
//    ListView listView;
//    listStdAdapter studentAdapter;
//    List<StudentModel> studentModels;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_studet);
//
//        configView();
//        configListView();
//        addListener();
//    }
//    private void configView() {
//        btnAddNewContact = findViewById(R.id.btn_add_new_contact);
//        listView = findViewById(R.id.list_view_contacts);
//    }
//    private void configListView() {
//        studentModels = new ArrayList<>();
//        studentAdapter = new listStdAdapter(studentModels);
//        listView.setAdapter(studentAdapter);
//    }
//
//    private void addListener() {
//        btnAddNewContact.setOnClickListener(view -> {
//            StudentModel contactModel = new StudentModel();
//            contactModel.setName("Name " + Calendar.getInstance().getTimeInMillis());
//            contactModel.setRollNumber("0987654321");
//            //Thêm vào datasource của listview để hiển thị luôn ra màn hình
//            studentModels.add(contactModel);
//            studentAdapter.notifyDataSetChanged();
//        });
//    }
}