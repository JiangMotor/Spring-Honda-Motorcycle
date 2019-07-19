package com.example.jianghonda.model.honda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class HondaService { 
    @Autowired 
    HondaRest honda;

    public Iterable<Honda> findAll(){
        return honda.findAll();
    }

    public boolean addHonda(Honda from){
        try{
            Honda y = new Honda();
            y.setImg_honda(from.getImg_honda());
            y.setName_honda(from.getName_honda());
            y.setVideo_honda(from.getVideo_honda());
            y.setCategory_name(from.getCategory_name());

            System.out.println(y);
            honda.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateHonda(Honda from){
        try{
           var y = honda.findById(from.getId()).get();
           y.setImg_honda(from.getImg_honda());
            y.setName_honda(from.getName_honda());
            y.setVideo_honda(from.getVideo_honda());
            y.setCategory_name(from.getCategory_name());
   
           honda.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delHonda(int id){
           try{
            honda.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}
