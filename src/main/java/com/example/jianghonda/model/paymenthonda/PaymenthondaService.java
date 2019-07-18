package com.example.jianghonda.model.paymenthonda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PaymenthondaService { 
    @Autowired 
    PaymenthondaRest paymenthonda;

    public Iterable<Paymenthonda> findAll(){
        return paymenthonda.findAll();
    }

    public boolean addPaymenthonda(Paymenthonda from){
        try{
            Paymenthonda y = new Paymenthonda();
            y.setHonda_id(from.getHonda_id());
            y.setPayment_honda(from.getPayment_honda());

            System.out.println(y);
            paymenthonda.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePaymenthonda(Paymenthonda from){
        try{
           var y = paymenthonda.findById(from.getId()).get();
           y.setHonda_id(from.getHonda_id());
           y.setPayment_honda(from.getPayment_honda());
   
            paymenthonda.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPaymenthonda(int id){
           try{
            paymenthonda.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}