package com.org.service.impl;

import com.org.Entity.MentorEntity;
import com.org.Entity.MentorshipdetailEntity;
import com.org.model.MentorDTO;
import com.org.model.MentorDetail;
import com.org.repository.MentorRepo;
import com.org.repository.MentorRepository;
import com.org.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MentorServiceImpl implements MentorService {

    @Autowired
    MentorRepository mentorRepository;

    @Autowired
    MentorRepo mentorRepo;


    @Override
    public MentorDTO createMentorDTO(MentorDTO mentorDTO) {
    MentorEntity mentorEntity =new MentorEntity();
    mentorEntity.setName(mentorDTO.getName());
    mentorEntity.setContact(mentorDTO.getContact());
    MentorshipdetailEntity mentorshipdetail =new MentorshipdetailEntity();
    mentorshipdetail.setMentorshipType(mentorDTO.getMentorship().getMentorshipType());
    mentorEntity.setMentorship(mentorshipdetail);
    mentorRepository.save(mentorEntity);
    return mentorDTO;

    }

    @Override
    public MentorDTO updateMentorDTO(MentorDTO mentorDTO, Integer id) {
        Optional<MentorEntity> optionalMentorEntity = mentorRepository.findById(id);
        if (optionalMentorEntity.isPresent()) {
            MentorEntity mentorEntity = optionalMentorEntity.get();
            mentorEntity.setName(mentorDTO.getName());
            mentorEntity.setContact(mentorDTO.getContact());
            mentorEntity.setMentorship(mentorDTO.getMentorship());
            mentorRepository.save(mentorEntity);
        }
        return mentorDTO;
    }

    @Override
    public MentorDTO getMentorById(Integer id) {
        Optional<MentorEntity> optionalMentorEntity = mentorRepository.findById(id);
        if (optionalMentorEntity.isPresent()) {
            MentorDTO mentorDTO = new MentorDTO();
            mentorDTO.setName(optionalMentorEntity.get().getName());
            mentorDTO.setContact(optionalMentorEntity.get().getContact());
            mentorDTO.setMentorship(optionalMentorEntity.get().getMentorship());
            return mentorDTO;
        }
        return null;

    }

    @Override
    public MentorDTO deleteMentorById(Integer id) {
        mentorRepository.deleteById(id);
        return null;
    }

    @Override
    public MentorDetail getMentorByName(String name) {
     return mentorRepo.getMentorByName(name);
    }
}