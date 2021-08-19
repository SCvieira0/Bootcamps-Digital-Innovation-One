package com.dio.java.service;

import com.dio.java.model.DataType;
import com.dio.java.repository.DataTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataTypeService {

    @Autowired
    DataTypeRepository dataTypeRepository;

    public DataType saveDataType(DataType dataType){
        return dataTypeRepository.save(dataType);
    }

    public List<DataType> findAll(){
        return dataTypeRepository.findAll();
    }

    public Optional<DataType> getById(Long idDataType){
        return dataTypeRepository.findById(idDataType);
    }

    public DataType updateDataType(DataType dataType){
        return dataTypeRepository.save(dataType);
    }

    public void deleteDataType(Long idDataType){
        dataTypeRepository.deleteById(idDataType);
    }
}
