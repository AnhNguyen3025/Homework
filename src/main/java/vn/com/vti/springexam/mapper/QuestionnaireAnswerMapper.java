package vn.com.vti.springexam.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.com.vti.springexam.entity.QuestionnaireAnswer;
import vn.com.vti.springexam.entity.QuestionnaireAnswerExample;
import vn.com.vti.springexam.entity.QuestionnaireAnswerKey;

public interface QuestionnaireAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    long countByExample(QuestionnaireAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int deleteByExample(QuestionnaireAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int deleteByPrimaryKey(QuestionnaireAnswerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int insert(QuestionnaireAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int insertSelective(QuestionnaireAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    List<QuestionnaireAnswer> selectByExample(QuestionnaireAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    QuestionnaireAnswer selectByPrimaryKey(QuestionnaireAnswerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByExampleSelective(@Param("record") QuestionnaireAnswer record, @Param("example") QuestionnaireAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByExample(@Param("record") QuestionnaireAnswer record, @Param("example") QuestionnaireAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByPrimaryKeySelective(QuestionnaireAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table questionnaire_answer
     *
     * @mbg.generated Mon Sep 12 16:45:37 JST 2022
     */
    int updateByPrimaryKey(QuestionnaireAnswer record);
}