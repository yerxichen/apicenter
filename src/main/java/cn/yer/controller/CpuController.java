package cn.yer.controller;

import cn.yer.dao.CpuDao;
import cn.yer.entity.Pc_cpu;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/cpu")
public class CpuController {

    @Autowired
    public CpuDao cpuDao;

    @ApiOperation(value = "分页查询cpu", notes = "分页查询")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<Pc_cpu> getCpus(@RequestParam Integer page, @RequestParam Integer size ){
        Pageable pageable=new PageRequest(page,size);
        return cpuDao.findAll(pageable);
    }

    @ApiOperation(value = "单条CPU记录",notes = "根据id查询")
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Pc_cpu getCpuById(@PathVariable("id") Integer id){
        return cpuDao.findOne(id);
    }
}
