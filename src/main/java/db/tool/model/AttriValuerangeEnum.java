package db.tool.model;

import javax.persistence.*;

@Table(name = "attri_valuerange_enum")
public class AttriValuerangeEnum {
    @Id
    @Column(name = "ATTRI_ID")
    private String attriId;

    @Id
    @Column(name = "SEQ_NO")
    private Integer seqNo;

    @Column(name = "KEY")
    private String key;

    @Column(name = "TEXT")
    private String text;

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
     * @return KEY
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * @return TEXT
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}