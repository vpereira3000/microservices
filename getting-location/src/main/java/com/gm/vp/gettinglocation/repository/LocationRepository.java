package com.gm.vp.gettinglocation.repository;

import org.springframework.data.repository.CrudRepository;
import com.gm.vp.gettinglocation.model.Location;

public interface LocationRepository extends CrudRepository<Location, Integer> {

}
