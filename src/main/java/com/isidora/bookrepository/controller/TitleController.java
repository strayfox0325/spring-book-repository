package com.isidora.bookrepository.controller;

import com.isidora.bookrepository.domain.Title;
import com.isidora.bookrepository.service.TitleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TitleController {

    private final TitleService titleService;

    public TitleController(TitleService titleService) {
        super();
        this.titleService = titleService;
    }

    // Handler Methods

    // Show Title List
    @GetMapping("/titles")
    public String titleList(Model model) {
        model.addAttribute("titles", titleService.getAllTitles());
        return "titles"; // view in templates folder
    }

    // Add New Title
    @GetMapping("/titles/new")
    public String createTitleForm(Model model) {
        Title title = new Title();
        model.addAttribute("title", title);
        return "create_title";
    }

    // Save Title
    @PostMapping("/titles")
    public String saveTitle(@ModelAttribute("title") Title title) {
        titleService.saveTitle(title);
        return "redirect:/titles";
    }
}
