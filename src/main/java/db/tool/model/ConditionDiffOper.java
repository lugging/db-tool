package db.tool.model;

import javax.persistence.*;

@Table(name = "condition_diff_oper")
public class ConditionDiffOper {
    @Id
    @Column(name = "CONDITION_TYPE")
    private String conditionType;

    @Id
    @Column(name = "SEQ_NUMBER")
    private Integer seqNumber;

    @Id
    @Column(name = "DIFFE_CATEGORY")
    private String diffeCategory;

    @Column(name = "COMPARE_CATG")
    private String compareCatg;

    /**
     * @return CONDITION_TYPE
     */
    public String getConditionType() {
        return conditionType;
    }

    /**
     * @param conditionType
     */
    public void setConditionType(String conditionType) {
        this.conditionType = conditionType == null ? null : conditionType.trim();
    }

    /**
     * @return SEQ_NUMBER
     */
    public Integer getSeqNumber() {
        return seqNumber;
    }

    /**
     * @param seqNumber
     */
    public void setSeqNumber(Integer seqNumber) {
        this.seqNumber = seqNumber;
    }

    /**
     * @return DIFFE_CATEGORY
     */
    public String getDiffeCategory() {
        return diffeCategory;
    }

    /**
     * @param diffeCategory
     */
    public void setDiffeCategory(String diffeCategory) {
        this.diffeCategory = diffeCategory == null ? null : diffeCategory.trim();
    }

    /**
     * @return COMPARE_CATG
     */
    public String getCompareCatg() {
        return compareCatg;
    }

    /**
     * @param compareCatg
     */
    public void setCompareCatg(String compareCatg) {
        this.compareCatg = compareCatg == null ? null : compareCatg.trim();
    }
}