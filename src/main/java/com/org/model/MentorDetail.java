package com.org.model;

public class MentorDetail {
    private  Integer contact;
    private String mentorshipType;

    public MentorDetail(Integer contact, String mentorshipType) {
        this.contact = contact;
        this.mentorshipType = mentorshipType;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public String getMentorshipType() {
        return mentorshipType;
    }

    public void setMentorshipType(String mentorshipType) {
        this.mentorshipType = mentorshipType;
    }
}
