package com.dhaker.nggallery.repositories;

import com.dhaker.nggallery.entities.Image;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "image", path = "image")
@CrossOrigin(origins = "http://localhost:4200")
public interface ImageRespository extends PagingAndSortingRepository<Image, String> {

}
