package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.BuisnessDetails;
import com.lentra.LoanManagementSystem.Service.BuisnessDetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buisnessDetails")
public class BuisnessDetailsController {
    @Autowired
    private BuisnessDetailsServices buisnessDetailsServices;

    @GetMapping("/{GSTNo}")
    public BuisnessDetails getBuisnessDetailsByGSTNo(@PathVariable String GSTNo){
        return buisnessDetailsServices.getBuisnessDdetailsByGSTNo(GSTNo);
    }

    @PostMapping("/addBuisness")
    public ResponseEntity<BuisnessDetails> addBuisness(@RequestBody BuisnessDetails buisnessDetails){
        BuisnessDetails buisnessDetails1=buisnessDetailsServices.addBuisness(buisnessDetails);
        if(buisnessDetails1!=null){
            return new ResponseEntity<BuisnessDetails>(buisnessDetails1, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<BuisnessDetails>(buisnessDetails1,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/updateBuisness")
    public ResponseEntity<BuisnessDetails> updateBuisness(@RequestBody BuisnessDetails buisnessDetails){
        BuisnessDetails buisnessDetails1=buisnessDetailsServices.addBuisness(buisnessDetails);
        if(buisnessDetails1!=null){
            return new ResponseEntity<BuisnessDetails>(buisnessDetails1, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<BuisnessDetails>(buisnessDetails1,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
