package cn.yer.service;

import cn.yer.dao.YpDao;
import cn.yer.entity.Pc_yp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class YpService {

    @Autowired
    public YpDao ypDao;

    public Page<Pc_yp> queryYps(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return ypDao.findAll(pageable);
    }

    public Pc_yp queryYpById(int id){
        return ypDao.findOne(id);
    }

    public void insetYp(Pc_yp yp){
        ypDao.save(yp);
    }

}
