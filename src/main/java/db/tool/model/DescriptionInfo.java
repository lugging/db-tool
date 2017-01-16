package db.tool.model;

import javax.persistence.*;

@Table(name = "description_info")
public class DescriptionInfo {
    @Id
    @Column(name = "SPARAS")
    private String sparas;

    @Id
    @Column(name = "TABLE_NAME")
    private String tableName;

    @Id
    @Column(name = "FILED_NAME")
    private String filedName;

    @Id
    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * @return SPARAS
     */
    public String getSparas() {
        return sparas;
    }

    /**
     * @param sparas
     */
    public void setSparas(String sparas) {
        this.sparas = sparas == null ? null : sparas.trim();
    }

    /**
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * @return FILED_NAME
     */
    public String getFiledName() {
        return filedName;
    }

    /**
     * @param filedName
     */
    public void setFiledName(String filedName) {
        this.filedName = filedName == null ? null : filedName.trim();
    }

    /**
     * @return ID_NUMBER
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}