package com.joan.listview_joan;

public class EmailItem {
    private int imageResource;
    private String date;
    private String title;
    private String preview;
    private String country;
    private boolean isRead;
    private String message;

    public EmailItem(int imageResource, String date, String title, String preview, String country, boolean isRead, String message) {
        this.imageResource = imageResource;
        this.date = date;
        this.title = title;
        this.preview = preview;
        this.country = country;
        this.isRead = isRead;
        this.message = message;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getPreview() {
        return preview;
    }

    public String getCountry() {
        return country;
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
