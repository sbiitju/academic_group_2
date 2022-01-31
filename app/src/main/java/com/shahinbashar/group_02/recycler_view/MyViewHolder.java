package com.shahinbashar.group_02.recycler_view;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahinbashar.group_02.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView courseNameTV,courseCodeTV;
    Button button;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        courseCodeTV=itemView.findViewById(R.id.courseCode);
        courseNameTV=itemView.findViewById(R.id.courseName);
        button=itemView.findViewById(R.id.btn);
    }
}
