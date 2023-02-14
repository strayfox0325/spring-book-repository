package com.isidora.bookrepository.service.impl;

import com.isidora.bookrepository.domain.Title;
import com.isidora.bookrepository.repository.TitleRepository;
import com.isidora.bookrepository.service.TitleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitleServiceImpl implements TitleService {

    private final TitleRepository titleRepository;

    public TitleServiceImpl(TitleRepository titleRepository) {
        super();
        this.titleRepository = titleRepository;
    }

    @Override
    public List<Title> getAllTitles() {
        return titleRepository.findAll();
    }

    @Override
    public Title saveTitle(Title title) {
        return titleRepository.save(title);
    }

    @Override
    public Title updateTitle(Title title) {
        return titleRepository.save(title);
    }

    @Override
    public Title getTitleByIsbn(Long isbn) {
        return titleRepository.findById(isbn).get();
    }

    @Override
    public void deleteTitleByIsbn(Long isbn) {
        titleRepository.deleteById(isbn);
    }


}
