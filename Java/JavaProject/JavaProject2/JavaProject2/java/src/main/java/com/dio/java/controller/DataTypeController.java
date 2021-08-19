package com.dio.java.controller;

import com.dio.java.model.DataType;
import com.dio.java.service.DataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/dataType")
public class DataTypeController {

    @Autowired
    DataTypeService dataTypeService;

    @PostMapping
    public DataType createDataType(@RequestBody DataType dataType){
        return dataTypeService.saveDataType(dataType);
    }

    @PutMapping
    public DataType updateDataType(@RequestBody DataType dataType){
        return dataTypeService.updateDataType(dataType);
    }

    @GetMapping
    public List<DataType> getDataTypeList(){
        return dataTypeService.findAll();
    }

    @GetMapping("/{idDataType}")
    public ResponseEntity<DataType> getDataTypeById(@PathVariable("idDataType") Long idDataType) throws Exception{
        return ResponseEntity.ok(dataTypeService.getById(idDataType).orElseThrow(() -> new NoSuchElementException("Not found")));
    }

    @DeleteMapping("/{idDataType}")
    public ResponseEntity<DataType> deleteDataTypeById(@PathVariable("idDataType") Long idDataType) throws Exception{
        try {
            dataTypeService.deleteDataType(idDataType);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<DataType>) ResponseEntity.ok();
    }
}
