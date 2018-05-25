package cn.yer.controller;

import cn.yer.entity.Pc_cpu;
import cn.yer.service.CpuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/cpu")
public class CpuController {

    @Autowired
    public CpuService cpuService;

    @ApiOperation(value = "分页查询cpu", notes = "分页查询")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<Pc_cpu> queryCpus(@RequestParam Integer page, @RequestParam Integer size ){
        return cpuService.queryCpus(page,size);
    }

    @ApiOperation(value = "单条CPU记录",notes = "根据id查询")
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Pc_cpu queryCpuById(@PathVariable("id") Integer id){
        return cpuService.queryCpuById(id);
    }
}
