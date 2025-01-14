package com.koiwaLearning.api.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.koiwaLearning.api.domain.TeachersInfo;

@Repository
public interface TeachersMapper {

    // 查询
    List<TeachersInfo> getTeachersInfo();

    // 追加
    int insertTeachers(TeachersInfo teachers);

    // 更新
    int updateTeachers(TeachersInfo teachers);

    // 削除
    int deleteTeachers(String tid);

}
