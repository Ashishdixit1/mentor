package com.org.repository.impl;

import com.org.model.MentorDTO;
import com.org.model.MentorDetail;
import com.org.repository.MentorRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MentorRepoImpl implements MentorRepo {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public MentorDetail getMentorByName(String name) {
        Query query = entityManager.createQuery("Select new com.org.model.MentorDetail(men.contact ,m.mentorshipType) from MentorEntity men join men.mentorship m where men.name=:name ");
        query.setParameter("name", name);
        List<MentorDetail> mentorDetails = query.getResultList();
        if (!mentorDetails.isEmpty()) {
            MentorDetail mentorDetail = mentorDetails.get(0);
            return mentorDetail;
//            Integer contact = mentorDetails.get(0).getContact();
//            String mentorshipType = mentorDetails.get(0).getMentorshipType();
//            return new MentorDetail(contact, mentorshipType);
        }
        return null;
    }
}
