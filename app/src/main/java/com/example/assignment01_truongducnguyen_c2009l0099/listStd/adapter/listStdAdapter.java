package com.example.assignment01_truongducnguyen_c2009l0099.listStd.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.assignment01_truongducnguyen_c2009l0099.R;
import com.example.assignment01_truongducnguyen_c2009l0099.listStd.model.StudentModel;

import java.util.List;

public class listStdAdapter extends BaseAdapter {
    private List<StudentModel> studentModels;

    public listStdAdapter(List<StudentModel> studentModels) {
        this.studentModels = studentModels;
    }

    @Override
    public int getCount() {//Cho listview biết số lượng dòng sẽ được hiển thị
        return studentModels.size();
    }

    @Override
    public Object getItem(int i) {//Cho listview biết object data được hiển thị ở vị trí thứ i là object nào
        return studentModels.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.activity_list_studet, viewGroup, false);
        }
        TextView txtName = view.findViewById(R.id.txt_name);
        TextView txtRollNumber = view.findViewById(R.id.txt_roll_number);
        StudentModel studentModel = studentModels.get(i);
        txtName.setText(studentModel.getName());
        txtRollNumber.setText(studentModel.getRollNumber());

        return view;
    }
}
