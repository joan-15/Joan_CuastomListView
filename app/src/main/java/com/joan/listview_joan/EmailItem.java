package com.joan.listview_joan;

public class EmailItem {
    private int imageResource;
    private String name;
    private boolean isRead;
    private String message;


    public EmailItem(int imageResource, String name, boolean isRead, String message) {
        this.imageResource = imageResource;
        this.name = name;
        this.isRead = isRead;
        this.message = message;
    }


    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getMessage() {
        return message;
    }
}
