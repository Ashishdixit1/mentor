package com.org.service;

import com.org.model.MentorDTO;
import org.springframework.stereotype.Service;


public interface MentorService {

MentorDTO createMentorDTO(MentorDTO mentorDTO);
MentorDTO updateMentorDTO(MentorDTO mentorDTO , Integer id);

MentorDTO getMentorById(Integer id);
MentorDTO deleteMentorById(Integer id);




}
