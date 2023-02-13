package com.isidora.bookrepository.repository;

import com.isidora.bookrepository.domain.Title;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitleRepository extends JpaRepository<Title, Long> {

}
