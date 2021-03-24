package com.mastery.java.task.rest;

import com.mastery.java.task.dto.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/home")
public class EmployeeController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askForm")
    public String employeeForm(Model model) {
        model.addAttribute(new Employee());
        return "ask-emp-form-view";
    }

    @RequestMapping("/showForm")
    public String showEmployeeForm(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-form-view";
        } else {
            return "show-emp-form-view";
        }
    }

}
