//package com.example.taskmaster.Database;
//
//import androidx.room.ColumnInfo;
//import androidx.room.Entity;
//import androidx.room.Ignore;
//import androidx.room.PrimaryKey;
//
//@Entity
//public class Project {
//    @PrimaryKey(autoGenerate = true)
//    public long id;
//
//    @ColumnInfo(name = "task")
//    public String task;
//
//    @Ignore
//    public Project(String task) {
//        this.task = task;
//    }
//
//    public Project() {}
//
//    public String toString() {
//        return "Tasks: " + task;
//    }
//}
