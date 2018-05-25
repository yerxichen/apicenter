package cn.yer.service;

import cn.yer.dao.XkDao;
import cn.yer.entity.Pc_xk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class XkService {

    @Autowired
    public XkDao xkDao;

    public Page<Pc_xk> queryXks(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return xkDao.findAll(pageable);
    }

    public Pc_xk queryXkById(int id){
        return xkDao.findOne(id);
    }

    public void insetXk(Pc_xk xk){
        xkDao.save(xk);
    }

}
