package com.example.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BudgetController {

    @GetMapping("/index")
    public String budgetingForm(Model model) {
        model.addAttribute("budgeting", new Budgeting());
        return "budgeting";
  }

    @PostMapping("/index")
    public String budgetingSubmit(@ModelAttribute Budgeting budgeting, Model model) {
        model.addAttribute("budgeting", budgeting);
        return "result";
  }
    
}
