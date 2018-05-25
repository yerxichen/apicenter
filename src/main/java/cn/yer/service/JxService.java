package cn.yer.service;

import cn.yer.dao.JxDao;
import cn.yer.entity.Pc_jx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class JxService {

    @Autowired
    public JxDao jxDao;

    public Page<Pc_jx> queryJxs(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return jxDao.findAll(pageable);
    }

    public Pc_jx queryJxById(int id){
        return jxDao.findOne(id);
    }

    public void insetJx(Pc_jx jx){
        jxDao.save(jx);
    }

}
