package com.zzy.cvmanagementsystem.service;

import com.zzy.cvmanagementsystem.dto.PublicationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PublicationService {

    void addPublication(PublicationDto publicationDto, String userid);

    void updatePublication(String id, PublicationDto publicationDto);

    void deletePublication(String id);

    List<PublicationDto> getAllPublication(String userid);

    void deleteByUserId(String userid);

}
