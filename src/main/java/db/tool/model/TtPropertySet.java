package db.tool.model;

import javax.persistence.*;

@Table(name = "tt_property_set")
public class TtPropertySet {
    @Id
    @Column(name = "TRANS_TYPE")
    private String transType;

    @Column(name = "ITEMTYPE")
    private String itemtype;

    @Column(name = "XINPMNT")
    private String xinpmnt;

    @Column(name = "XCHK_ACCNT")
    private String xchkAccnt;

    @Column(name = "XCHK_ACCN2")
    private String xchkAccn2;

    @Column(name = "XCHK_LIMIT")
    private String xchkLimit;

    @Column(name = "XCHK_CUSTO")
    private String xchkCusto;

    @Column(name = "XCHK_PRENO")
    private String xchkPreno;

    @Column(name = "XCHK_NOW")
    private String xchkNow;

    @Column(name = "XCHK_PCL")
    private String xchkPcl;

    @Column(name = "XCHK_PYM")
    private String xchkPym;

    @Column(name = "VALUE_REQ")
    private String valueReq;

    @Column(name = "XMORE_RCV")
    private String xmoreRcv;

    @Column(name = "XDIALOG_PO")
    private String xdialogPo;

    @Column(name = "XDIALOG_PI")
    private String xdialogPi;

    @Column(name = "XDIA_SO")
    private String xdiaSo;

    @Column(name = "XDIALOG_FO")
    private String xdialogFo;

    @Column(name = "XCIMT")
    private String xcimt;

    @Column(name = "XTAX")
    private String xtax;

    @Column(name = "GVCODE")
    private String gvcode;

    @Column(name = "STATE")
    private String state;

    @Column(name = "TT_GROUP")
    private String ttGroup;

    @Column(name = "XCHK_VALUE")
    private String xchkValue;

    @Column(name = "XREVERSAL")
    private String xreversal;

    @Column(name = "XCHK_POST")
    private String xchkPost;

    /**
     * @return TRANS_TYPE
     */
    public String getTransType() {
        return transType;
    }

    /**
     * @param transType
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    /**
     * @return ITEMTYPE
     */
    public String getItemtype() {
        return itemtype;
    }

    /**
     * @param itemtype
     */
    public void setItemtype(String itemtype) {
        this.itemtype = itemtype == null ? null : itemtype.trim();
    }

    /**
     * @return XINPMNT
     */
    public String getXinpmnt() {
        return xinpmnt;
    }

    /**
     * @param xinpmnt
     */
    public void setXinpmnt(String xinpmnt) {
        this.xinpmnt = xinpmnt == null ? null : xinpmnt.trim();
    }

    /**
     * @return XCHK_ACCNT
     */
    public String getXchkAccnt() {
        return xchkAccnt;
    }

    /**
     * @param xchkAccnt
     */
    public void setXchkAccnt(String xchkAccnt) {
        this.xchkAccnt = xchkAccnt == null ? null : xchkAccnt.trim();
    }

    /**
     * @return XCHK_ACCN2
     */
    public String getXchkAccn2() {
        return xchkAccn2;
    }

    /**
     * @param xchkAccn2
     */
    public void setXchkAccn2(String xchkAccn2) {
        this.xchkAccn2 = xchkAccn2 == null ? null : xchkAccn2.trim();
    }

    /**
     * @return XCHK_LIMIT
     */
    public String getXchkLimit() {
        return xchkLimit;
    }

    /**
     * @param xchkLimit
     */
    public void setXchkLimit(String xchkLimit) {
        this.xchkLimit = xchkLimit == null ? null : xchkLimit.trim();
    }

    /**
     * @return XCHK_CUSTO
     */
    public String getXchkCusto() {
        return xchkCusto;
    }

    /**
     * @param xchkCusto
     */
    public void setXchkCusto(String xchkCusto) {
        this.xchkCusto = xchkCusto == null ? null : xchkCusto.trim();
    }

    /**
     * @return XCHK_PRENO
     */
    public String getXchkPreno() {
        return xchkPreno;
    }

    /**
     * @param xchkPreno
     */
    public void setXchkPreno(String xchkPreno) {
        this.xchkPreno = xchkPreno == null ? null : xchkPreno.trim();
    }

    /**
     * @return XCHK_NOW
     */
    public String getXchkNow() {
        return xchkNow;
    }

    /**
     * @param xchkNow
     */
    public void setXchkNow(String xchkNow) {
        this.xchkNow = xchkNow == null ? null : xchkNow.trim();
    }

    /**
     * @return XCHK_PCL
     */
    public String getXchkPcl() {
        return xchkPcl;
    }

    /**
     * @param xchkPcl
     */
    public void setXchkPcl(String xchkPcl) {
        this.xchkPcl = xchkPcl == null ? null : xchkPcl.trim();
    }

    /**
     * @return XCHK_PYM
     */
    public String getXchkPym() {
        return xchkPym;
    }

    /**
     * @param xchkPym
     */
    public void setXchkPym(String xchkPym) {
        this.xchkPym = xchkPym == null ? null : xchkPym.trim();
    }

    /**
     * @return VALUE_REQ
     */
    public String getValueReq() {
        return valueReq;
    }

    /**
     * @param valueReq
     */
    public void setValueReq(String valueReq) {
        this.valueReq = valueReq == null ? null : valueReq.trim();
    }

    /**
     * @return XMORE_RCV
     */
    public String getXmoreRcv() {
        return xmoreRcv;
    }

    /**
     * @param xmoreRcv
     */
    public void setXmoreRcv(String xmoreRcv) {
        this.xmoreRcv = xmoreRcv == null ? null : xmoreRcv.trim();
    }

    /**
     * @return XDIALOG_PO
     */
    public String getXdialogPo() {
        return xdialogPo;
    }

    /**
     * @param xdialogPo
     */
    public void setXdialogPo(String xdialogPo) {
        this.xdialogPo = xdialogPo == null ? null : xdialogPo.trim();
    }

    /**
     * @return XDIALOG_PI
     */
    public String getXdialogPi() {
        return xdialogPi;
    }

    /**
     * @param xdialogPi
     */
    public void setXdialogPi(String xdialogPi) {
        this.xdialogPi = xdialogPi == null ? null : xdialogPi.trim();
    }

    /**
     * @return XDIA_SO
     */
    public String getXdiaSo() {
        return xdiaSo;
    }

    /**
     * @param xdiaSo
     */
    public void setXdiaSo(String xdiaSo) {
        this.xdiaSo = xdiaSo == null ? null : xdiaSo.trim();
    }

    /**
     * @return XDIALOG_FO
     */
    public String getXdialogFo() {
        return xdialogFo;
    }

    /**
     * @param xdialogFo
     */
    public void setXdialogFo(String xdialogFo) {
        this.xdialogFo = xdialogFo == null ? null : xdialogFo.trim();
    }

    /**
     * @return XCIMT
     */
    public String getXcimt() {
        return xcimt;
    }

    /**
     * @param xcimt
     */
    public void setXcimt(String xcimt) {
        this.xcimt = xcimt == null ? null : xcimt.trim();
    }

    /**
     * @return XTAX
     */
    public String getXtax() {
        return xtax;
    }

    /**
     * @param xtax
     */
    public void setXtax(String xtax) {
        this.xtax = xtax == null ? null : xtax.trim();
    }

    /**
     * @return GVCODE
     */
    public String getGvcode() {
        return gvcode;
    }

    /**
     * @param gvcode
     */
    public void setGvcode(String gvcode) {
        this.gvcode = gvcode == null ? null : gvcode.trim();
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * @return TT_GROUP
     */
    public String getTtGroup() {
        return ttGroup;
    }

    /**
     * @param ttGroup
     */
    public void setTtGroup(String ttGroup) {
        this.ttGroup = ttGroup == null ? null : ttGroup.trim();
    }

    /**
     * @return XCHK_VALUE
     */
    public String getXchkValue() {
        return xchkValue;
    }

    /**
     * @param xchkValue
     */
    public void setXchkValue(String xchkValue) {
        this.xchkValue = xchkValue == null ? null : xchkValue.trim();
    }

    /**
     * @return XREVERSAL
     */
    public String getXreversal() {
        return xreversal;
    }

    /**
     * @param xreversal
     */
    public void setXreversal(String xreversal) {
        this.xreversal = xreversal == null ? null : xreversal.trim();
    }

    /**
     * @return XCHK_POST
     */
    public String getXchkPost() {
        return xchkPost;
    }

    /**
     * @param xchkPost
     */
    public void setXchkPost(String xchkPost) {
        this.xchkPost = xchkPost == null ? null : xchkPost.trim();
    }
}