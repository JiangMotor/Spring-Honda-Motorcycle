package com.example.jianghonda.model.producthonda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class ProducthondaService { 
    @Autowired 
    ProducthondaRest producthonda;

    public Iterable<Producthonda> findAll(){
        return producthonda.findAll();
    }

    public boolean addProducthonda(Producthonda from){
        try{
            Producthonda y = new Producthonda();
            y.setHonda_id(from.getHonda_id());
            y.setProduct_honda(from.getProduct_honda());

            System.out.println(y);
            producthonda.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateProducthonda(Producthonda from){
        try{
           var y = producthonda.findById(from.getId()).get();
            y.setHonda_id(from.getHonda_id());
            y.setProduct_honda(from.getProduct_honda());
           
            producthonda.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delProducthonda(int id){
           try{
            producthonda.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}