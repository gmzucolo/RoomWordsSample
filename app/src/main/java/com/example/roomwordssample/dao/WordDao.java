package com.example.roomwordssample.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.roomwordssample.model.Word;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("DELETE from word_table")
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();
}
