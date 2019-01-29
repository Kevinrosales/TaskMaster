package com.example.taskmaster.Database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Project {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;

    public Project() {}

    @Ignore
    public Project(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "project: "+ this.name;
    }
}
