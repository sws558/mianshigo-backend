package com.yupi.mianshigo.esdao;

import com.yupi.mianshigo.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目 ES 操作
 */


public interface QuestionEsDao
        extends ElasticsearchRepository<QuestionEsDTO, Long> {
    /**
     * 根据用户 id 查询
     *
     * @param userId
     * @return
     */
    List<QuestionEsDTO> findByUserId(Long userId);


}
