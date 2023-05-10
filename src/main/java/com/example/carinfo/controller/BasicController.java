package com.example.carinfo.controller;


import com.example.carinfo.domain.Car;
import com.example.carinfo.domain.Company;
import com.example.carinfo.service.CarInputDTO;
import com.example.carinfo.service.CarService;
import com.example.carinfo.service.CompanyInputDTO;
import com.example.carinfo.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BasicController {
  @Autowired
  CompanyService companyService;
  @Autowired
  CarService carService;

  @RequestMapping("/")
  public String index(Model model) {
    return "index";
  }

  @RequestMapping("/companyForm")
  public String companyForm(Model model){
    return "companyForm";
  }

  @RequestMapping("/saveCompany")
  public String saveCompany(@ModelAttribute(name="companyInputDto")CompanyInputDTO companyInputDTO, Model model){
    companyService.saveCompanyInputDto(companyInputDTO);
    return "index";
  }

  @RequestMapping("/companyList")
  public String companyList(@PageableDefault Pageable pageable, Model model){
    Page<Company> companyList = companyService.getCompanyPage(pageable);
    model.addAttribute("companyList", companyList);
    return "companyList";
  }

  @RequestMapping("/carForm")
  public String carList(Model model){
    List<Company> companyList = companyService.findAll();
    model.addAttribute("companyList", companyList);
    return "carForm";
  }

  @RequestMapping("/saveCar")
  public String saveCar(@ModelAttribute(name="carInputDto") CarInputDTO carInputDTO, Model model){
    carService.saveCarInputDto(carInputDTO);
    return "index";
  }

  @RequestMapping("/carList")
  public String carList(@PageableDefault Pageable pageable, Model model){
    Page<Car> carList = carService.getCarPage(pageable);
    model.addAttribute("carList", carList);
    return "carList";
  }

  @RequestMapping("/carListNoPage")
  public String carListNoPage(Model model){
    List<Car> carList = carService.getCarList();
    model.addAttribute("carList", carList);

    return "carListNoPage";
  }

}
