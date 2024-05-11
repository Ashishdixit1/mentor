package com.org.controller;

import com.org.model.MentorDTO;
import com.org.model.MentorDetail;
import com.org.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MentorController
{
    @Autowired
   MentorService mentorService;

    @PostMapping("/mentor")
  public MentorDTO createMentorDTO(@RequestBody MentorDTO mentorDTO){
    mentorService.createMentorDTO(mentorDTO);
    return mentorDTO;

    }

    @GetMapping("/mentor/{id}")
   public MentorDTO getMentorById(@PathVariable Integer id){
       MentorDTO mentorDTO = mentorService.getMentorById(id);
        return mentorDTO;
    }

   @PutMapping("mentor/{id}")
   public MentorDTO updateMentorById(@RequestBody MentorDTO mentorDTO , @PathVariable Integer id){
    return mentorService.updateMentorDTO(mentorDTO ,id);
   }

   @DeleteMapping("mentor/{id}")
    public  MentorDTO deleteMentorById(@PathVariable Integer id){
        mentorService.deleteMentorById(id);
        return null;
   }

   @GetMapping("/mentor/name/{name}")
    MentorDetail getMentorByName(@PathVariable String name){
      return   mentorService.getMentorByName(name);
   }




}
