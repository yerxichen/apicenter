package cn.yer.dao;

import cn.yer.entity.Pc_cpu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CpuDao extends JpaRepository<Pc_cpu,Integer> {
}
