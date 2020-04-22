package com.api.repo;

import com.api.model.Polling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPollingRepo extends JpaRepository<Polling,Long> {

    @Query(value = "Select * from POLLING_STATUS  where "
            +"DeviceId = :id and  CreatedTime between " + ":date and " + ":edate",nativeQuery = true)
    List<Polling> find(@Param("id") String id, @Param("date") String date, @Param("edate") String edate);
}
