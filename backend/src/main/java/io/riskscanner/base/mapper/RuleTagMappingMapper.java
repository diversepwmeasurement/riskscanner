package io.riskscanner.base.mapper;

import io.riskscanner.base.domain.RuleTagMapping;
import io.riskscanner.base.domain.RuleTagMappingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RuleTagMappingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    long countByExample(RuleTagMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByExample(RuleTagMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insert(RuleTagMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int insertSelective(RuleTagMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    List<RuleTagMapping> selectByExample(RuleTagMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    RuleTagMapping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExampleSelective(@Param("record") RuleTagMapping record, @Param("example") RuleTagMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByExample(@Param("record") RuleTagMapping record, @Param("example") RuleTagMappingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKeySelective(RuleTagMapping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rule_tag_mapping
     *
     * @mbg.generated Tue Jan 19 17:40:09 CST 2021
     */
    int updateByPrimaryKey(RuleTagMapping record);
}