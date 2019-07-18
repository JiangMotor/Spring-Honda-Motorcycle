package com.example.jianghonda;

import com.example.jianghonda.model.datahonda.Datahonda;
import com.example.jianghonda.model.datahonda.DatahondaService;
import com.example.jianghonda.model.honda.Honda;
import com.example.jianghonda.model.honda.HondaService;
import com.example.jianghonda.model.paymenthonda.Paymenthonda;
import com.example.jianghonda.model.paymenthonda.PaymenthondaService;
import com.example.jianghonda.model.producthonda.Producthonda;
import com.example.jianghonda.model.producthonda.ProducthondaService;
import com.example.jianghonda.model.promotionhonda.Promotionhonda;
import com.example.jianghonda.model.promotionhonda.PromotionhondaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JiangHondaConller {

    //Honda
    @Autowired
    private HondaService honda;

    @GetMapping(value = "/Honda")
    public Iterable<Honda> promotion() {
        return honda.findAll();
    }
    @PostMapping(value="/addHonda")
    public ResponseEntity<Boolean> addHonda(@RequestBody Honda model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(honda.addHonda(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateHonda")
    public ResponseEntity<Boolean> updateHonda(@RequestBody Honda model){
        return new ResponseEntity<Boolean>(honda.updateHonda(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delHonda/{id}")
    public ResponseEntity<Boolean> delHonda(@PathVariable int id){
        return new ResponseEntity<Boolean>(honda.delHonda(id),HttpStatus.OK);
    } 
    
    @Autowired
    private ProducthondaService producthonda;

    @GetMapping(value = "/Producthonda")
    public Iterable<Producthonda> producthonda() {
        return producthonda.findAll();
    }
    @PostMapping(value="/addProducthonda")
    public ResponseEntity<Boolean> addProducthonda(@RequestBody Producthonda model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(producthonda.addProducthonda(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateProducthonda")
    public ResponseEntity<Boolean> updateProducthonda(@RequestBody Producthonda model){
        return new ResponseEntity<Boolean>(producthonda.updateProducthonda(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delProducthonda/{id}")
    public ResponseEntity<Boolean> delProducthonda(@PathVariable int id){
        return new ResponseEntity<Boolean>(producthonda.delProducthonda(id),HttpStatus.OK);
    } 

    @Autowired
    private PromotionhondaService promotionhonda;

    @GetMapping(value = "/Promotionhonda")
    public Iterable<Promotionhonda> promotionhonda() {
        return promotionhonda.findAll();
    }
    @PostMapping(value="/addPromotionhonda")
    public ResponseEntity<Boolean> addPromotionhonda(@RequestBody Promotionhonda model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(promotionhonda.addPromotionhonda(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePromotionhonda")
    public ResponseEntity<Boolean> updatePromotionhonda(@RequestBody Promotionhonda model){
        return new ResponseEntity<Boolean>(promotionhonda.updatePromotionhonda(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPromotionhonda/{id}")
    public ResponseEntity<Boolean> delPromotionhonda(@PathVariable int id){
        return new ResponseEntity<Boolean>(promotionhonda.delPromotionhonda(id),HttpStatus.OK);
    } 

    @Autowired
    private PaymenthondaService paymenthonda;

    @GetMapping(value = "/Paymenthonda")
    public Iterable<Paymenthonda> paymenthonda() {
        return paymenthonda.findAll();
    }
    @PostMapping(value="/addPaymenthonda")
    public ResponseEntity<Boolean> addPaymenthonda(@RequestBody Paymenthonda model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(paymenthonda.addPaymenthonda(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePaymenthonda")
    public ResponseEntity<Boolean> updatePaymenthonda(@RequestBody Paymenthonda model){
        return new ResponseEntity<Boolean>(paymenthonda.updatePaymenthonda(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPaymenthonda/{id}")
    public ResponseEntity<Boolean> delPaymenthonda(@PathVariable int id){
        return new ResponseEntity<Boolean>(paymenthonda.delPaymenthonda(id),HttpStatus.OK);
    } 

    @Autowired
    private DatahondaService datahonda;

    @GetMapping(value = "/Datahonda")
    public Iterable<Datahonda> datahonda() {
        return datahonda.findAll();
    }
    @PostMapping(value="/addDatahonda")
    public ResponseEntity<Boolean> addDatahonda(@RequestBody Datahonda model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(datahonda.addDatahonda(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateDatahonda")
    public ResponseEntity<Boolean> updateDatahonda(@RequestBody Datahonda model){
        return new ResponseEntity<Boolean>(datahonda.updateDatahonda(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delDatahonda/{id}")
    public ResponseEntity<Boolean> delDatahonda(@PathVariable int id){
        return new ResponseEntity<Boolean>(datahonda.delDatahonda(id),HttpStatus.OK);
    } 



}
