package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.AdharCard;
import com.lentra.LoanManagementSystem.Service.AdharCardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adhar")
public class AdharCardController {
    @Autowired
    private AdharCardServices adharCardServices;

    @GetMapping("/{adharNo}")
    public AdharCard getAdharCardByAdharNo(@PathVariable String adharNo){
        return adharCardServices.getAdharCardByAdharNo(adharNo);
    }
    @PostMapping("/addAdhar")
    public ResponseEntity<AdharCard> addAdhar(@RequestBody AdharCard adharCard){
        AdharCard adharCard1=adharCardServices.addAdhar(adharCard);
        if(adharCard1!=null){
            return new ResponseEntity<AdharCard>(adharCard1, HttpStatus.OK);
        }else {
            return new ResponseEntity<AdharCard>(adharCard1, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
