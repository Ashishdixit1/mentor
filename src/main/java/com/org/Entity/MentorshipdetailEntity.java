package com.org.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mentorship")
public class MentorshipdetailEntity {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     private String mentorshipType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMentorshipType() {
        return mentorshipType;
    }

    public void setMentorshipType(String mentorshipType) {
        this.mentorshipType = mentorshipType;
    }
}
