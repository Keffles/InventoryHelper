package com.example.Inventory.Helper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {
    @RequestMapping(value = "")
    @ResponseBody
    public String index(){
        return "Welcome to inventory helper";
    }

    @RequestMapping(value = "Dairy")
    @ResponseBody
    public String DairyController(){
        return "Enter the number of milks pulled for each type below";
    }

    @RequestMapping(value = "Pastries")
    @ResponseBody
    public String PastriesController(){return "Enter the number of pastries pulled for each value below";}

    @RequestMapping(value = "Coffee")
    @ResponseBody
    public String CoffeeController(){return "Enter the number of units pulled for each type of coffee below";}

    @RequestMapping(value = "Cups")
    @ResponseBody
    public String CupsController(){return "Enter the number of sleeves pulled for each size of cup below";}

    @RequestMapping(value = "Inclusions")
    @ResponseBody
    public String InclusionsController(){return "Enter the number of Inclusions pulled below.";}

    @RequestMapping(value = "Syrups")
    @ResponseBody
    public String SyrupsController(){return "Enter the number of Syrups pulled for each type below";}

    @RequestMapping(value = "Refreshers")
    @ResponseBody
    public String RefreshersController(){return "Enter the number of refreshers pulled for each type below";}

    @RequestMapping(value = "Oatmeal")
    @ResponseBody
    public String OatmealController(){return "Enter the number of oatmeal components pulled below";}


    @RequestMapping(value = "Tea")
    @ResponseBody
    public String TeaController(){return "Enter the number of teas pulled below.  Iced tea is per box, hot tea bags are per unit";}

    @RequestMapping(value = "Sandwich")
    @ResponseBody
    public String SandwichController(){return "Enter the number of Sandwiches, egg bites and wraps pulled below";}


    @RequestMapping(value = "Inventory")
    @ResponseBody
    public String InventoryController(){return "Below lists current inventory numbers";}








}
