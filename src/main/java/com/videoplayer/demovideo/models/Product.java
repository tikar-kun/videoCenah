package com.videoplayer.demovideo.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tumbnail;
    private String videoFileName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTumbnail() {
        return tumbnail;
    }
    public void setTumbnail(String tumbnail) {
        this.tumbnail = tumbnail;
    }
    public String getVideoFileName() {
        return videoFileName;
    }
    public void setVideoFileName(String videoFileName) {
        this.videoFileName = videoFileName;
    }


    
}
