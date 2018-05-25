package cn.yer.service;

import cn.yer.dao.NcDao;
import cn.yer.entity.Pc_nc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class NcService {

    @Autowired
    public NcDao ncDao;

    public Page<Pc_nc> queryNcs(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return ncDao.findAll(pageable);
    }

    public Pc_nc queryNcById(int id){
        return ncDao.findOne(id);
    }

    public void insetNc(Pc_nc nc){
        ncDao.save(nc);
    }

}
