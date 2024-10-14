package com.example.theremindful.tasks;


public class DailyTask {
    private String taskDescription;
    private boolean isCompleted;

    public DailyTask(String taskDescription, boolean isCompleted) {
        this.taskDescription = taskDescription;
        this.isCompleted = isCompleted;
    }

    // Getters and setters
    public String getTaskDescription() { return taskDescription; }
    public void setTaskDescription(String taskDescription) { this.taskDescription = taskDescription; }

    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean completed) { isCompleted = completed; }
}