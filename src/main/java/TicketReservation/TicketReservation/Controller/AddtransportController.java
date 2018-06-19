/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketReservation.TicketReservation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddtransportController {

    @GetMapping("/addtransport")
    public String addtransport() {
        
        return "addtransport";
    }
}