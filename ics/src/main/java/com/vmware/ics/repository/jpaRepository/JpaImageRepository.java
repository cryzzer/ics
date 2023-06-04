package com.vmware.ics.repository.jpaRepository;

import com.vmware.ics.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> getImageById(Long id);
    Optional<Image> getImageByUrl(String url);
}
