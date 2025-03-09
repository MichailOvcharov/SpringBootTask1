package ru.diasoft.example;


public class Greeting {
    private long id;
    private String content;
    public Greeting(long incrementAndGet, String format) {
        this.id = incrementAndGet;
        this.content = format;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
