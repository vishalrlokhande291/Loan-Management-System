package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.PanCard;
import com.lentra.LoanManagementSystem.Service.PanCardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/panCard")
public class PanCardController {

    @Autowired
    private PanCardServices panCardServices;

    @GetMapping("/{panNo}")
    public PanCard getPanCard(@PathVariable String panNo){
        return panCardServices.getPanCardByPanNo(panNo);
    }

    @PostMapping("/addPan")
    public ResponseEntity<PanCard> addPan(@RequestBody PanCard panCard){
        PanCard panCard1=panCardServices.addPan(panCard);
        if(panCard1!=null){
            return new ResponseEntity<PanCard>(panCard1, HttpStatus.OK);
        }else {
            return new ResponseEntity<PanCard>(panCard1, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @PostMapping("/addPan")
//    public String AddPan(@RequestBody PanCard panCard){
//        return panCardServices.addPan(panCard);
//    }
}
