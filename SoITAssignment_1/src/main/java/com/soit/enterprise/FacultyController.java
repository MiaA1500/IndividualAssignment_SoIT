package com.soit.enterprise;

import com.soit.enterprise.model.Faculty;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
@RequestMapping("/Faculties")
public class FacultyController {


    private List<Faculty> theFaculties;

    @PostConstruct
    private void loadData() {
        Faculty fac1 = new Faculty(1, "Kelly", "Miller", "Assistant Professor", "KellyMiller@mail.com");
        Faculty fac2 = new Faculty(2, "Robert", "Lee", "Teacher", "RobertLee@mail.com");
        Faculty fac3 = new Faculty(3, "Laura", "West", "Professor", "LauraWest@mail.com");

        theFaculties = new ArrayList<Faculty>();

        theFaculties.add(fac1);
        theFaculties.add(fac2);
        theFaculties.add(fac3);
    }

    @GetMapping("/list")
    public String listFaculties(Model theModel) {
        theModel.addAttribute("faculties", theFaculties);
        return "list-faculties";
    }

}




