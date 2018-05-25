package cn.yer.service;

import cn.yer.dao.SrDao;
import cn.yer.entity.Pc_sr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class SrService {

    @Autowired
    public SrDao srDao;

    public Page<Pc_sr> querySrs(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return srDao.findAll(pageable);
    }

    public Pc_sr querySrById(int id){
        return srDao.findOne(id);
    }

    public void insetSr(Pc_sr sr){
        srDao.save(sr);
    }

}
