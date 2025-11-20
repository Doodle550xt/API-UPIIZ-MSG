package com.upiiz.ajedrez.entities;

public class Notification {
    /*
     * @Id
     * 
     * @GeneratedValue(strategy = GenerationType.IDENTITY)
     * 
     * @Schema(accessMode = Schema.AccessMode.READ_ONLY)
     * private Long id;
     * 
     */

    private String title;

    private String body;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
