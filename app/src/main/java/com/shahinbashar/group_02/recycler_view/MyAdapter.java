package com.shahinbashar.group_02.recycler_view;


import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.shahinbashar.group_02.R;
import com.shahinbashar.group_02.model.Course;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<Course> courseList;
    private int[] pictureList;
    private Context context;

    public MyAdapter(List<Course> courseList, int[] pictureList, Context context) {
        this.courseList = courseList;
        this.pictureList = pictureList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.course_card, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.courseNameTV.setText(courseList.get(position).getCourseName());
        holder.courseCodeTV.setText(courseList.get(position).getCourseCode());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                View view1 = LayoutInflater.from(context).inflate(R.layout.teacher_info, null);
                TextView tName, tDesignation;
                ImageView imageView = view1.findViewById(R.id.teacherImg);
                tName = view1.findViewById(R.id.teacherName);
                tDesignation = view1.findViewById(R.id.teacherDesignation);
                tName.setText(courseList.get(holder.getAbsoluteAdapterPosition()).getCourseTeacherName());
                tDesignation.setText(courseList.get(holder.getAbsoluteAdapterPosition()).getCourseTeacherDesignation());
                imageView.setImageResource(pictureList[holder.getAbsoluteAdapterPosition()]);
                builder.setView(view1).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }
}
