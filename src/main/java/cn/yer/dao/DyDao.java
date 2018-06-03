package cn.yer.dao;

import cn.yer.entity.Pc_dy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface DyDao extends JpaRepository<Pc_dy,Integer> {
    @Modifying
    @Query("update Pc_dy t set t.localPic=?1 where t.xxzjbh=?2")
    @Transactional
    int updateLocalPicById(String localPic,int xxzjbh);

    @Modifying
    @Query("delete from Pc_dy")
    @Transactional
    int deleteAllData();

}
