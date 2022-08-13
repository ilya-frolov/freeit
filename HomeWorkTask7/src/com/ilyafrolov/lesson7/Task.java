package com.ilyafrolov.lesson7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    private String task;
    private Date curDate;

    public Task(String newTask) {
        this.task = newTask;
        curDate = new Date();
    }

    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");
        return task + " (" + dateFormat.format(curDate) + ")";
    }

    public String getTask() {
        return task;
    }

    public Date getDate() {
        return curDate;
    }
}
