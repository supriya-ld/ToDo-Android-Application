package com.example.todo;

/**
 * Created by engMa_000 on 2017-04-03.
 */

public class ToDo {


    private int mId;
    private String mContent;
    private int mImportant;
    public ToDo(int id, String content, int important) {
        mId = id;
        mImportant = important;
        mContent = content;
    }
    public ToDo(){}
    public int getId() {
        return mId;
    }
    public void setId(int id) {
        mId = id;
    }
    public int getImportant() {
        return mImportant;
    }
    public void setImportant(int important) {
        mImportant = important;
    }
    public String getContent() {
        return mContent;
    }
    public void setContent(String content) {
        mContent = content;
    }
    public boolean isImportant(){return mImportant==1;}

}
