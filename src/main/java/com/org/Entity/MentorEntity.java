package com.org.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mentor")
public class MentorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer contact;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "mentorship_id")
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



    public MentorshipdetailEntity getMentorship() {
        return mentorship;
    }

    public void setMentorship(MentorshipdetailEntity mentorship) {
        this.mentorship = mentorship;
    }
}
