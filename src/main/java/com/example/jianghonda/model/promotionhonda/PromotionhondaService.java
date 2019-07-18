package com.example.jianghonda.model.promotionhonda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PromotionhondaService { 
    @Autowired 
    PromotionhondaRest promotionhonda;

    public Iterable<Promotionhonda> findAll(){
        return promotionhonda.findAll();
    }

    public boolean addPromotionhonda(Promotionhonda from){
        try{
            Promotionhonda y = new Promotionhonda();
            y.setHonda_id(from.getHonda_id());
            y.setPromotion_honda(from.getPromotion_honda());
            y.setDetail(from.getDetail());

            System.out.println(y);
            promotionhonda.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePromotionhonda(Promotionhonda from){
        try{
           var y = promotionhonda.findById(from.getId()).get();
           y.setHonda_id(from.getHonda_id());
            y.setPromotion_honda(from.getPromotion_honda());
            y.setDetail(from.getDetail());
           
            promotionhonda.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPromotionhonda(int id){
           try{
            promotionhonda.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}