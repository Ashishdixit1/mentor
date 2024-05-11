package com.org.repository;

import com.org.model.MentorDTO;
import com.org.model.MentorDetail;

public interface MentorRepo {

    MentorDetail getMentorByName(String name);

}
