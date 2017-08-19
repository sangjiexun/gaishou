package vn.bananavietnam.ict.common.db.model;

import java.util.Date;

public class IvbTBlockHarvestKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IVB_T_BLOCK_HARVEST.FARM_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    private String farmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IVB_T_BLOCK_HARVEST.AREA_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    private String areaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IVB_T_BLOCK_HARVEST.BLOCK_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    private String blockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IVB_T_BLOCK_HARVEST.PREVIOUS_ROUND
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    private Boolean previousRound;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column IVB_T_BLOCK_HARVEST.BLOCK_HARVEST_DATE
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    private Date blockHarvestDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IVB_T_BLOCK_HARVEST.FARM_ID
     *
     * @return the value of IVB_T_BLOCK_HARVEST.FARM_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public String getFarmId() {
        return farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IVB_T_BLOCK_HARVEST.FARM_ID
     *
     * @param farmId the value for IVB_T_BLOCK_HARVEST.FARM_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IVB_T_BLOCK_HARVEST.AREA_ID
     *
     * @return the value of IVB_T_BLOCK_HARVEST.AREA_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IVB_T_BLOCK_HARVEST.AREA_ID
     *
     * @param areaId the value for IVB_T_BLOCK_HARVEST.AREA_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IVB_T_BLOCK_HARVEST.BLOCK_ID
     *
     * @return the value of IVB_T_BLOCK_HARVEST.BLOCK_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public String getBlockId() {
        return blockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IVB_T_BLOCK_HARVEST.BLOCK_ID
     *
     * @param blockId the value for IVB_T_BLOCK_HARVEST.BLOCK_ID
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IVB_T_BLOCK_HARVEST.PREVIOUS_ROUND
     *
     * @return the value of IVB_T_BLOCK_HARVEST.PREVIOUS_ROUND
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public Boolean getPreviousRound() {
        return previousRound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IVB_T_BLOCK_HARVEST.PREVIOUS_ROUND
     *
     * @param previousRound the value for IVB_T_BLOCK_HARVEST.PREVIOUS_ROUND
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setPreviousRound(Boolean previousRound) {
        this.previousRound = previousRound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column IVB_T_BLOCK_HARVEST.BLOCK_HARVEST_DATE
     *
     * @return the value of IVB_T_BLOCK_HARVEST.BLOCK_HARVEST_DATE
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public Date getBlockHarvestDate() {
        return blockHarvestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column IVB_T_BLOCK_HARVEST.BLOCK_HARVEST_DATE
     *
     * @param blockHarvestDate the value for IVB_T_BLOCK_HARVEST.BLOCK_HARVEST_DATE
     *
     * @mbggenerated Fri Apr 07 14:55:57 ICT 2017
     */
    public void setBlockHarvestDate(Date blockHarvestDate) {
        this.blockHarvestDate = blockHarvestDate;
    }
}