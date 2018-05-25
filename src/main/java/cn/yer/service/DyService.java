package cn.yer.service;

import cn.yer.dao.DyDao;
import cn.yer.entity.Pc_dy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class DyService {

    @Autowired
    public DyDao dyDao;

    public Page<Pc_dy> queryDy(int page, int size){
        Pageable pageable=new PageRequest(page,size);
        return dyDao.findAll(pageable);
    }

    public Pc_dy queryDyById(int id){
        return dyDao.findOne(id);
    }

    public void insetDy(Pc_dy dy){
        dyDao.save(dy);
    }

}
