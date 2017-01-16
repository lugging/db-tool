package db.tool.model;

import javax.persistence.*;

@Table(name = "rate_formula_set")
public class RateFormulaSet {
    @Id
    @Column(name = "INTEREST_RATE_FORMULA")
    private String interestRateFormula;

    @Column(name = "VARIABLE1")
    private String variable1;

    @Column(name = "COMPARE_CATG1")
    private Integer compareCatg1;

    @Column(name = "VARIABLE2")
    private String variable2;

    @Column(name = "COMPARE_CATG2")
    private Integer compareCatg2;

    @Column(name = "VARIABLE3")
    private String variable3;

    @Column(name = "COMPARE_CATG3")
    private Integer compareCatg3;

    @Column(name = "VARIABLE4")
    private String variable4;

    @Column(name = "COMPARE_CATG4")
    private Integer compareCatg4;

    /**
     * @return INTEREST_RATE_FORMULA
     */
    public String getInterestRateFormula() {
        return interestRateFormula;
    }

    /**
     * @param interestRateFormula
     */
    public void setInterestRateFormula(String interestRateFormula) {
        this.interestRateFormula = interestRateFormula == null ? null : interestRateFormula.trim();
    }

    /**
     * @return VARIABLE1
     */
    public String getVariable1() {
        return variable1;
    }

    /**
     * @param variable1
     */
    public void setVariable1(String variable1) {
        this.variable1 = variable1 == null ? null : variable1.trim();
    }

    /**
     * @return COMPARE_CATG1
     */
    public Integer getCompareCatg1() {
        return compareCatg1;
    }

    /**
     * @param compareCatg1
     */
    public void setCompareCatg1(Integer compareCatg1) {
        this.compareCatg1 = compareCatg1;
    }

    /**
     * @return VARIABLE2
     */
    public String getVariable2() {
        return variable2;
    }

    /**
     * @param variable2
     */
    public void setVariable2(String variable2) {
        this.variable2 = variable2 == null ? null : variable2.trim();
    }

    /**
     * @return COMPARE_CATG2
     */
    public Integer getCompareCatg2() {
        return compareCatg2;
    }

    /**
     * @param compareCatg2
     */
    public void setCompareCatg2(Integer compareCatg2) {
        this.compareCatg2 = compareCatg2;
    }

    /**
     * @return VARIABLE3
     */
    public String getVariable3() {
        return variable3;
    }

    /**
     * @param variable3
     */
    public void setVariable3(String variable3) {
        this.variable3 = variable3 == null ? null : variable3.trim();
    }

    /**
     * @return COMPARE_CATG3
     */
    public Integer getCompareCatg3() {
        return compareCatg3;
    }

    /**
     * @param compareCatg3
     */
    public void setCompareCatg3(Integer compareCatg3) {
        this.compareCatg3 = compareCatg3;
    }

    /**
     * @return VARIABLE4
     */
    public String getVariable4() {
        return variable4;
    }

    /**
     * @param variable4
     */
    public void setVariable4(String variable4) {
        this.variable4 = variable4 == null ? null : variable4.trim();
    }

    /**
     * @return COMPARE_CATG4
     */
    public Integer getCompareCatg4() {
        return compareCatg4;
    }

    /**
     * @param compareCatg4
     */
    public void setCompareCatg4(Integer compareCatg4) {
        this.compareCatg4 = compareCatg4;
    }
}