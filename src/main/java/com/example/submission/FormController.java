package com.example.submission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    CustomersRepo repo;
    @Autowired
    @RequestMapping("/")
    public String details() {
        return "edureka.jsp";
    }
    @RequestMapping("/getdetails")
    public String getdetails(Customers customers) {
        repo.save(customers);
        return "edureka.jsp";
    }

//    @PostMapping("/getdetails")
//    public String viewdetails(@RequestParam("cid") int cid,
//                              @RequestParam("cname") String cname,
//                              @RequestParam("cemail") String cemail, ModelMap modelMap) {
//        modelMap.put("cid", cid);
//        modelMap.put("cname", cname);
//        modelMap.put("cemail", cemail);
//        return "ViewCustomers.jsp";
//    }
}
