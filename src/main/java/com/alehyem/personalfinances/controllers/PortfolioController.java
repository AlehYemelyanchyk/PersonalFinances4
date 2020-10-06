package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.entity.Portfolio;
import com.alehyem.personalfinances.services.PortfolioService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/portfolios")
public class PortfolioController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/list")
    public String getList(Model model) {

        List<Portfolio> portfoliosList;
        try {
            portfoliosList = portfolioService.findAll();
            model.addAttribute("portfoliosList", portfoliosList);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return "portfolios/list";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model model) {
        Portfolio portfolio = new Portfolio();
        model.addAttribute("portfolio", portfolio);
        return "portfolios/addForm";
    }

    @PostMapping("/savePortfolio")
    public String save(@ModelAttribute Portfolio portfolio) {
//        Portfolio portfolio = (Portfolio) model.getAttribute("portfolio");
        System.out.println(portfolio);
        System.out.println(portfolio.getUser());
//        portfolioService.save(portfolio);
        return "redirect:/portfolios/list";
    }

    @GetMapping("/showUpdateForm")
    public String showUpdateForm(Model model) {
        return "portfolios/updateForm";
    }
}
