package com.example.jianghonda.model.datahonda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class DatahondaService { 
    @Autowired 
    DatahondaRest datahonda;

    public Iterable<Datahonda> findAll(){
        return datahonda.findAll();
    }

    public boolean addDatahonda(Datahonda from){
        try{
            Datahonda y = new Datahonda();
            y.setHonda_id(from.getHonda_id());
            y.setData_honda(from.getData_honda());
            y.setImage(from.getImage());
            y.setDetail(from.getDetail());
            

            System.out.println(y);
            datahonda.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateDatahonda(Datahonda from){
        try{
           var y = datahonda.findById(from.getId()).get();
           y.setHonda_id(from.getHonda_id());
            y.setData_honda(from.getData_honda());
            y.setImage(from.getImage());
            y.setDetail(from.getDetail());

           datahonda.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delDatahonda(int id){
           try{
            datahonda.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}