package com.example.task01spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/operations")
public class OperationsController {
    @GetMapping("/sum")
    public String getSum(Model model,
                         @RequestParam("a") int a,
                         @RequestParam("b") int b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int sum = a + b;
        model.addAttribute("sum", sum);
        return "nums";
    }

    @GetMapping("/multiplication")
    public String getMultiplication(Model model,
                                    @RequestParam("a") int a,
                                    @RequestParam("b") int b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int multiplication = a * b;
        model.addAttribute("multiplication", multiplication);
        return "nums";
    }

    @GetMapping("/subtraction")
    public String getSubtraction(Model model,
                                 @RequestParam("a") int a,
                                 @RequestParam("b") int b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int subtraction = a - b;
        model.addAttribute("subtraction", subtraction);
        return "nums";
    }

    @GetMapping("/division")
    public String getDivision(Model model,
                              @RequestParam("a") int a,
                              @RequestParam("b") int b) {
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        int division = a / b;
        model.addAttribute("division", division);
        return "nums";
    }
}
