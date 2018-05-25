package cn.yer.service;

import cn.yer.dao.GtypDao;
import cn.yer.entity.Pc_gtyp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class GtypService {

    @Autowired
    public GtypDao gtypDao;

    public Page<Pc_gtyp> queryGtyps(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return gtypDao.findAll(pageable);
    }

    public Pc_gtyp queryGtypById(int id){
        return gtypDao.findOne(id);
    }

    public void insetGtyp(Pc_gtyp gtyp){
        gtypDao.save(gtyp);
    }

}
