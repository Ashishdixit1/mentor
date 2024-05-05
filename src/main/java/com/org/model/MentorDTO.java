package com.org.model;

import com.org.Entity.MentorshipdetailEntity;

public class MentorDTO {
    private Integer id;
    private String name;
    private Integer contact;
    private  Integer  mentorshipId;

    MentorshipdetailEntity mentorship;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Integer getMentorshipId() {
        return mentorshipId;
    }

    public void setMentorshipId(Integer mentorshipId) {
        this.mentorshipId = mentorshipId;
    }

    public MentorshipdetailEntity getMentorship() {
        return mentorship;
    }

    public void setMentorship(MentorshipdetailEntity mentorship) {
        this.mentorship = mentorship;
    }
}
