package db.tool.model;

import javax.persistence.*;

@Table(name = "attri_valuerange_express")
public class AttriValuerangeExpress {
    @Id
    @Column(name = "ATTRI_ID")
    private String attriId;

    @Id
    @Column(name = "SEQ_NO")
    private Integer seqNo;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "KEY1")
    private String key1;

    @Column(name = "TEXT1")
    private String text1;

    @Column(name = "KEY2")
    private String key2;

    @Column(name = "TEXT2")
    private String text2;

    /**
     * @return ATTRI_ID
     */
    public String getAttriId() {
        return attriId;
    }

    /**
     * @param attriId
     */
    public void setAttriId(String attriId) {
        this.attriId = attriId == null ? null : attriId.trim();
    }

    /**
     * @return SEQ_NO
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo
     */
    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * @return KEY1
     */
    public String getKey1() {
        return key1;
    }

    /**
     * @param key1
     */
    public void setKey1(String key1) {
        this.key1 = key1 == null ? null : key1.trim();
    }

    /**
     * @return TEXT1
     */
    public String getText1() {
        return text1;
    }

    /**
     * @param text1
     */
    public void setText1(String text1) {
        this.text1 = text1 == null ? null : text1.trim();
    }

    /**
     * @return KEY2
     */
    public String getKey2() {
        return key2;
    }

    /**
     * @param key2
     */
    public void setKey2(String key2) {
        this.key2 = key2 == null ? null : key2.trim();
    }

    /**
     * @return TEXT2
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     */
    public void setText2(String text2) {
        this.text2 = text2 == null ? null : text2.trim();
    }
}