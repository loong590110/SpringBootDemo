package com.spring.mvc.been;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
public class Message {

    /**
     * id : 1000000
     * title : xxx
     * content : xxx
     * datetime : 100000000
     */

    private long id;
    private String title;
    private String content;
    private long datetime;

    public Message(){}

    public Message(long id, String title, String content, long datetime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.datetime = datetime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }
}
