package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.Customer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerMapper {
    @Select("select * from Customer")
    @ResultType(Customer.class)
    List<Customer> findAll();

    @Select("select * from Customer where id=#{id}")
    Customer findOneById(@Param("id") int id);

    @Update("update Customer set EnterpriseId=#{enterpriseId},CustomerName=#{customerName},Status=#{status} where Id = #{id}")
    int modifyCustomer(Customer customer);

    @Update("update Customer set Status=#{status} where Id=#{id}")
    int changeCustomerStatus(Customer customer);

    @Insert("insert into Customer (EnterpriseId,CustomerName,Status) values (#{enterpriseId},#{customerName},#{status})")
    int addCustomer(Customer customer);


}
