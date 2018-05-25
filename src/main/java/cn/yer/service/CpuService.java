package cn.yer.service;

import cn.yer.dao.CpuDao;
import cn.yer.entity.Pc_cpu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CpuService {

    @Autowired
    public CpuDao cpuDao;

    public Page<Pc_cpu> queryCpus(int page,int size){
        Pageable pageable=new PageRequest(page,size);
        return cpuDao.findAll(pageable);
    }

    public Pc_cpu queryCpuById(int id){
        return cpuDao.findOne(id);
    }

    public void insetCpu(Pc_cpu cpu){
        cpuDao.save(cpu);
    }

}
