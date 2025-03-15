package com.yupi.mianshigo.mapper;

import com.yupi.mianshigo.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author sws
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2025-02-13 18:27:41
* @Entity com.yupi.mianshigo.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {
    /**
     * 查询题目列表(包括已被删除的题目)
     */
    @Select("select * from question where updateTime>=#{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);

}




