package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.intity.Intity;



@RestController
@CrossOrigin(origins = "https://my-react-app-u9qm.vercel.app")
public class Controller {








    @PostMapping("/me")
    public String login(@RequestBody Intity pro) {
       
       String usern;
        usern = pro.getDev();
        String pasm="";
        if(usern.equals("hi")){

            pasm="hi how are you sir?";
        }

        else if(usern.equals("order")){

            pasm="you want to redirect to order page sir?";


        }

        else if(usern.equals("yes")){

            pasm="ok i am redirecting you within 2 seconds please hold on";


        }


        else if(usern.equals("where is my order")){

            pasm="your order will be deliver within 4 days ";


        }

        else{

            pasm="i think you entered wrong input ";
        }
 

    

        
        return pasm;

    }

    



}
