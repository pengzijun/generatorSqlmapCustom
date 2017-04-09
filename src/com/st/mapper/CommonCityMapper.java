package com.st.mapper;

import com.st.pojo.CommonCity;
import com.st.pojo.CommonCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommonCityMapper {
    int countByExample(CommonCityExample example);

    int deleteByExample(CommonCityExample example);

    int deleteByPrimaryKey(Integer cityid);

    int insert(CommonCity record);

    int insertSelective(CommonCity record);

    List<CommonCity> selectByExample(CommonCityExample example);

    CommonCity selectByPrimaryKey(Integer cityid);

    int updateByExampleSelective(@Param("record") CommonCity record, @Param("example") CommonCityExample example);

    int updateByExample(@Param("record") CommonCity record, @Param("example") CommonCityExample example);

    int updateByPrimaryKeySelective(CommonCity record);

    int updateByPrimaryKey(CommonCity record);
}