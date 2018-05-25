package cn.yer.service;

import cn.yer.dao.XsqDao;
import cn.yer.entity.Pc_xsq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class XsqService {

    @Autowired
    public XsqDao xsqDao;

    public Page<Pc_xsq> queryXsqs(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return xsqDao.findAll(pageable);
    }

    public Pc_xsq queryXsqById(int id){
        return xsqDao.findOne(id);
    }

    public void insetXsq(Pc_xsq xsq){
        xsqDao.save(xsq);
    }

}
