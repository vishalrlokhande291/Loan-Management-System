package com.lentra.LoanManagementSystem.Controller;

import com.lentra.LoanManagementSystem.Entity.Address;
import com.lentra.LoanManagementSystem.Entity.BasicInfo;
import com.lentra.LoanManagementSystem.Service.AddressService;
import com.lentra.LoanManagementSystem.Service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applicant")
public class Controller {

    //BasicInfo

    @Autowired
    private BasicInfoService basicInfoService;


    @PostMapping("/addApplicant")
    public String addApplicant(@RequestBody BasicInfo basicInfo){
        return basicInfoService.addApplicant(basicInfo);
    }
    @GetMapping("{applicantMobile}")
    public BasicInfo getApplicantByMobile(@PathVariable String applicantMobile){
        return basicInfoService.getApplicantByMobile(applicantMobile);
    }
    @GetMapping("{applicantRefId}")
    public BasicInfo getApplicantByRefId(@PathVariable String applicantRefId){
        return basicInfoService.getApplicantByRefId(applicantRefId);
    }

    //Address

    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<Address> save(@RequestBody Address address){
        Address address1=addressService.save(address);
        if(address!=null){
            return new ResponseEntity<Address>(address1, HttpStatus.OK);
        }else{
            return new ResponseEntity<Address>(address1, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/allAddress")
    public ResponseEntity <List<Address>> saveMultiAddress(@RequestBody List<Address> addresses){
        List<Address> add = addressService.saveMultiAddress(addresses);
        if(add !=null) {
            return new ResponseEntity<List<Address>>(add, HttpStatus.OK);
        }else {
            return new ResponseEntity<List<Address>>(add,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
