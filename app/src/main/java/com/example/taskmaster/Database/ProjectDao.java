package com.example.taskmaster.Database;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ProjectDao {
    @Query("SELECT * FROM project")
    List<Project> getAll();

    @Insert
    void insertAll(Project... project);

    @Delete
    void delete(Project... project);
}
