package com.isidora.bookrepository.service;

import com.isidora.bookrepository.domain.Title;

import java.util.List;

public interface TitleService {
    List<Title> getAllTitles();
    Title saveTitle(Title title);
}
