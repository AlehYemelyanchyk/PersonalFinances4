package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.entity.Portfolio;
import com.alehyem.personalfinances.rest.exceptions.PortfolioNotFoundException;
import com.alehyem.personalfinances.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PortfolioRestController {

    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/showAddForm")
    public String showAddForm(Model model) {
        Portfolio portfolio = new Portfolio();
        model.addAttribute("portfolio", portfolio);
        return "portfolios/addForm";
    }

    @PostMapping("/portfolios")
    public Portfolio addPortfolio(@RequestBody Portfolio portfolio) {
        portfolio.setId(0);
        portfolioService.save(portfolio);

        return portfolio;
    }

    @GetMapping("/portfolios")
    public List<Portfolio> getList() {

        List<Portfolio> portfoliosList = portfolioService.findAll();
        return portfoliosList;
    }

    @GetMapping("/portfolios/{id}")
    public Portfolio getById(@PathVariable int id) {

        Portfolio portfolio = portfolioService.findById(id);
        if (portfolio == null) {
            throw new PortfolioNotFoundException("Customer id " + id + " is not found.");
        }
        return portfolio;
    }

    @PutMapping("/portfolios")
    public Portfolio updatePortfolio(@RequestBody Portfolio portfolio) {
        portfolioService.save(portfolio);

        return portfolio;
    }

    @DeleteMapping("/portfolios/{id}")
    public Portfolio deleteById(@PathVariable int id) {

        Portfolio portfolio = portfolioService.findById(id);
        if (portfolio == null) {
            throw new PortfolioNotFoundException("Customer id " + id + " is not found.");
        }
        portfolioService.deleteById(id);
        return portfolio;
    }
}
