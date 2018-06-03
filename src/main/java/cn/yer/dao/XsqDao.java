package cn.yer.dao;

import cn.yer.entity.Pc_xsq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface XsqDao extends JpaRepository<Pc_xsq,Integer> {
    @Modifying
    @Query("update Pc_xsq t set t.localPic=?1 where t.xxzjbh=?2")
    @Transactional
    int updateLocalPicById(String localPic,int xxzjbh);

    @Modifying
    @Query("delete from Pc_xsq")
    @Transactional
    int deleteAllData();
}
