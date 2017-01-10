package com.khodayar.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Advertisement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    
    public Advertisement(){
        
    }
    
    public Advertisement(String title) {
            this.title = title;
      }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Advertisement [id=" + id + ", title=" + title + "]";
    }

    public Advertisement(String title, Long id) {
      
        this.id = id;
        this.title = title;
    }
    
    
}
