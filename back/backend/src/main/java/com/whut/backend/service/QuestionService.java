package com.whut.backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.whut.backend.entity.Bank;
import com.whut.backend.entity.Question;
import com.whut.backend.entity.QuestionIndex;

import java.util.List;

public interface QuestionService extends IService<Question> {

    PageInfo<Question> getQuestionList(Integer index, Integer page, Integer pageSize);

    List<Bank> getBankList();

    Question getById(Integer id);

    List<QuestionIndex> getTitles(Integer questionid);

    PageInfo<Question> searchContents(String content,Integer questionid, Integer page, Integer pageSize);
}
