package cn.yer.dao;

import cn.yer.entity.Pc_sr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface SrDao extends JpaRepository<Pc_sr,Integer> {
    @Modifying
    @Query("update Pc_sr t set t.localPic=?1 where t.xxzjbh=?2")
    @Transactional
    int updateLocalPicById(String localPic,int xxzjbh);

    @Modifying
    @Query("delete from Pc_sr")
    @Transactional
    int deleteAllData();
}
