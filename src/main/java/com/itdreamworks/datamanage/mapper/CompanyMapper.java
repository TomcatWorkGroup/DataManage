package com.itdreamworks.datamanage.mapper;

import com.itdreamworks.datamanage.entity.db.Company;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CompanyMapper {
    @Select("select * from Company")
    @ResultType(Company.class)
    List<Company> findAll();

    @Select("select * from Company where id=#{id}")
    Company findOneById(@Param("id") int id);

    @Update("update Company set CompanyName=#{companyName},Status=#{status} where Id = #{id}")
    void modifyCompany(@Param("id") int id,@Param("companyName") String companyName,@Param("status") int status);

//    @Update("update Company set Status=#{status} where Id=#{id}")
//    int changeCompanyStatus(Company company);

    @Insert("insert into Company (CompanyName,Status) values (#{companyName},#{status})")
    void addCompany(@Param("companyName") String companyName,@Param("status") int status);
}
