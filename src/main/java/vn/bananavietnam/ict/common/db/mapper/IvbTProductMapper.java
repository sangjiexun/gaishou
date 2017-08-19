package vn.bananavietnam.ict.common.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import vn.bananavietnam.ict.common.db.model.IvbTProduct;
import vn.bananavietnam.ict.common.db.model.IvbTProductExample;
import vn.bananavietnam.ict.common.db.model.IvbTProductKey;

public interface IvbTProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int countByExample(IvbTProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int deleteByExample(IvbTProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int deleteByPrimaryKey(IvbTProductKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int insert(IvbTProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int insertSelective(IvbTProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    List<IvbTProduct> selectByExample(IvbTProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    IvbTProduct selectByPrimaryKey(IvbTProductKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int updateByExampleSelective(@Param("record") IvbTProduct record, @Param("example") IvbTProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int updateByExample(@Param("record") IvbTProduct record, @Param("example") IvbTProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int updateByPrimaryKeySelective(IvbTProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    int updateByPrimaryKey(IvbTProduct record);

    /**
     * This method corresponds to the database table IVB_T_PRODUCT
     *
     * @mbggenerated We Thu 11 17:00:00 ICT 2017
     */
    String updatePreviousRoundByFarmAndArea(IvbTProduct record);
}