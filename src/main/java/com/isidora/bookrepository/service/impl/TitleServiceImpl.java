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


}
