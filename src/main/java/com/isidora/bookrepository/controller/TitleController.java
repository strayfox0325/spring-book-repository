package com.isidora.bookrepository.controller;

import com.isidora.bookrepository.domain.Title;
import com.isidora.bookrepository.service.TitleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    // Edit Title
    @GetMapping("/titles/edit/{isbn}")
    public String editTitleForm(@PathVariable Long isbn, Model model) {
        model.addAttribute("title", titleService.getTitleByIsbn(isbn));
        return "edit_title";
    }

    @PostMapping("/titles/{isbn}")
    public String updateTitle(@PathVariable Long isbn, @ModelAttribute("title") Title title, Model model) {

        // get title by isbn from database
        Title currentTitle = titleService.getTitleByIsbn(isbn);
        currentTitle.setIsbn(title.getIsbn());
        currentTitle.setName(title.getName());
        currentTitle.setYear(title.getYear());
        currentTitle.setGenre(title.getGenre());
        currentTitle.setAuthor(title.getAuthor());

        // save updated title
        titleService.updateTitle(currentTitle);
        return "redirect:/titles";
    }

    // delete title
    @GetMapping("/titles/{isbn}")
    public String deleteTitle(@PathVariable Long isbn, Model model) {
        titleService.deleteTitleByIsbn(isbn);
        return "redirect:/titles";
    }
}
