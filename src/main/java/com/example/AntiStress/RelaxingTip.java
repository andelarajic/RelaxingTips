package com.example.AntiStress;
public class RelaxingTip {

    private static String title;
    private String text;

    public RelaxingTip(String title, String text) {
        this.title = title;
        this.text = text;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
