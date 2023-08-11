package com.example.task01spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/operations")
public class OperationsController {
    @GetMapping
    public String getSum(Model model,
                         @RequestParam("a") int a,
                         @RequestParam("b") int b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int sum = a + b;
        int multiplication = a * b;
        int subtraction = a - b;
        int division = a / b;
        model.addAttribute("sum", sum);
        model.addAttribute("multiplication", multiplication);
        model.addAttribute("subtraction", subtraction);
        model.addAttribute("division", division);
        return "nums";
    }
}
