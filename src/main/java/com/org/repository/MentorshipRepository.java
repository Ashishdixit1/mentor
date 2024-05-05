package com.org.repository;

import com.org.Entity.MentorshipdetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorshipRepository extends JpaRepository<MentorshipdetailEntity ,Integer> {
}
