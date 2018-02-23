package com.itdreamworks.datamanage.service;

import com.itdreamworks.datamanage.entity.CustomerCategory;
import com.itdreamworks.datamanage.mapper.CustomerCategoryMapper;
import com.itdreamworks.datamanage.mapper.CustomerProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerCategoryService {
    @Autowired
    CustomerProductMapper productDao;
    @Autowired
    CustomerCategoryMapper  customerCategoryDao;

    @Transactional
    public void delete(int customerId,String localId){
        CustomerCategory category = customerCategoryDao.findOneByLocal(customerId,localId);
        if(null != category) {
            productDao.deleteCustomerProductCategory(customerId, category.getId());
            customerCategoryDao.deleteCustomerCategory(customerId, localId);
        }
    }
}
