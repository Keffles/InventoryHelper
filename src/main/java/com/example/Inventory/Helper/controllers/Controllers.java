package com.example.Inventory.Helper.controllers;

import com.example.Inventory.Helper.dao.dairyDao;
import com.example.Inventory.Helper.models.Dairy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.Inventory.Helper.dao.dairyDao;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Controllers {

    @Autowired// look this shit up later
    public dairyDao dairyDao;
    //  returns a webpage at localhost:8080  it's the GET method that calls the templates.  the Request Map sets what method
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /*
    DONE Have a page with "Enter the number of milks pulled
    Update that page to have a place to type in the number and a button
    Have a page that accepts the result when the page above clicks the button
    Save the result to a List or HashMap of StockingEvents


    PARAMS set the name of the button.  It is needed because if we don't have it
    it won't know what button to use. This way we can use multiple buttons without
    tons of hassle.  So every button doesn't need its own form to keep it straight.
     */
    @RequestMapping(value = "/", params="Dairy", method= RequestMethod.POST)
    public String DairyController(){
        return "DairyPull";
    }

    @RequestMapping(value="/DairyPull", method = RequestMethod.GET)
    public String dairyPullGet(Model model){
        List<Dairy> dairyList = dairyDao.findAll();
        model.addAttribute("dairyList", dairyList);
        return "DairyPull";
    }

    @RequestMapping(value="/error", method = RequestMethod.GET)
    public String error () {
        return "error";
    }

    @RequestMapping(value = "Pastries")
    public String PastriesController(){return "Enter the number of pastries pulled for each value below";}

    @RequestMapping(value = "NonDairyCategories/Coffee")
    public String CoffeeController(){return "Enter the number of units pulled for each type of coffee below";}

    @RequestMapping(value = "NonDairyCategories/Cups")
    public String CupsController(){return "Enter the number of sleeves pulled for each size of cup below";}

    @RequestMapping(value = "Inclusions")
    public String InclusionsController(){return "Enter the number of Inclusions pulled below.";}

    @RequestMapping(value = "NonDairyCategories/Syrups")
    public String SyrupsController(){
    return "Enter the number of Syrups pulled for each type below";}

    @RequestMapping(value = "Refreshers")
    public String RefreshersController(){return "Enter the number of refreshers pulled for each type below";}

    @RequestMapping(value = "NonDairyCategories/Oatmeal")
    public String OatmealController(){return "Enter the number of oatmeal components pulled below";}


    @RequestMapping(value = "NonDairyCategories/Tea")
    public String TeaController(){return "Enter the number of teas pulled below.  Iced tea is per box, hot tea bags are per unit";}

    @RequestMapping(value = "Sandwich")
    public String SandwichController(){return "Enter the number of Sandwiches, egg bites and wraps pulled below";}


    /*
    go through the list of saved stocking events and print to the console
    * */
    @RequestMapping(value = "Inventory")
    public String InventoryController(){
        System.out.println("Print to console here");
        return "Below lists current inventory numbers";}








}
