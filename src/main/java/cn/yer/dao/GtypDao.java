package cn.yer.dao;

import cn.yer.entity.Pc_gtyp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface GtypDao extends JpaRepository<Pc_gtyp,Integer> {
    @Modifying
    @Query("update Pc_gtyp t set t.localPic=?1 where t.xxzjbh=?2")
    @Transactional
    int updateLocalPicById(String localPic,int xxzjbh);

    @Modifying
    @Query("delete from Pc_gtyp")
    @Transactional
    int deleteAllData();

}
