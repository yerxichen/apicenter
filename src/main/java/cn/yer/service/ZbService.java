package cn.yer.service;

import cn.yer.dao.ZbDao;
import cn.yer.entity.Pc_zb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class ZbService {

    @Autowired
    public ZbDao zbDao;

    public Page<Pc_zb> queryZbs(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return zbDao.findAll(pageable);
    }

    public Pc_zb queryZbById(int id){
        return zbDao.findOne(id);
    }

    public void insetZb(Pc_zb zb){
        zbDao.save(zb);
    }

}
