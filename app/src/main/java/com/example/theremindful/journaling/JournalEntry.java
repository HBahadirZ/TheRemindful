package com.example.theremindful.journaling;

public class JournalEntry {
    private String title;
    private String content;
    private String date;

    public JournalEntry(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}

@Entity(tableName = "journal_entries")
public class JournalEntryEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String content;
    private String date;

    // Getters and Setters
}

@Dao
public interface JournalEntryDao {
    @Insert
    void insert(JournalEntryEntity entry);

    @Query("SELECT * FROM journal_entries")
    List<JournalEntryEntity> getAllEntries();
}

@Database(entities = {JournalEntryEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract JournalEntryDao journalEntryDao();
}

