package com.ilyafrolov.lesson7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    public String task;
    public Date curDate;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy HH:mm:ss");

    public Task(String newTask) {
        this.task = newTask;
        curDate = new Date();
    }

    public String toString() {
        return task + " (" + dateFormat.format(curDate) + ")";
    }

    public String getTask() {
        return task;
    }

    public Date getDate() {
        return curDate;
    }
}
