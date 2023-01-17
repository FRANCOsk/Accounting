package com.example.Accounting.service;

import com.example.Accounting.model.Fee;
import com.example.Accounting.repository.FeeRepository;
import org.springframework.stereotype.Service;

@Service
public class FeeService {


   FeeRepository feeRepository;


    public FeeService(FeeRepository feeRepository) {
        this.feeRepository = feeRepository;
    }

    public int getFee(String feeName, String algoritm) {

        int result = 0;

        //creating Mock data
        setData();

        switch(algoritm){

            case "fix": result = calculateFixedFee(feeName); break;
          //space for extensions




        }

        return result;
    }

    private int calculateFixedFee(String feeName){

        return feeRepository.findByName(feeName).getFee();

    }

    private void setData(){

        Fee fee = new Fee();
        fee.setName("VAT");
        fee.setFee(20);
        feeRepository.save(fee);

    }


}
