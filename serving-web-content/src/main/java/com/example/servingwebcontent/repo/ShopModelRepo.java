package com.example.servingwebcontent.repo;

import com.example.servingwebcontent.Models.ShopModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopModelRepo extends CrudRepository <ShopModel,Long > {

}
