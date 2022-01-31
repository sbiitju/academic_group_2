package com.shahinbashar.group_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.shahinbashar.group_02.model.Course;
import com.shahinbashar.group_02.recycler_view.MyAdapter;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoActivity extends AppCompatActivity {
    int[] pic={R.drawable.kambaiilogo,R.drawable.first_image,R.drawable.second_image,R.drawable.splashpic};
RecyclerView recyclerView;
List<Course> courseList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);
        courseList=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerview);
        Course course=new Course("A","B","C","D");
        Course course1=new Course("A","B","C","D");
        Course course2=new Course("A","B","C","D");
        Course course3=new Course("A","B","C","D");
        courseList.add(course);
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        MyAdapter myAdapter=new MyAdapter(courseList,pic,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdapter);
    }
}