//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.12 at 12:18:20 AM UTC 
//


package com.pp.model.iso.pain014;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalPaymentInstruction42 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalPaymentInstruction42"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}Max35Text"/&gt;
 *         &lt;element name="OrgnlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlCtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="PmtInfSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}ExternalPaymentGroupStatus1Code" minOccurs="0"/&gt;
 *         &lt;element name="StsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}StatusReasonInformation12" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NbOfTxsPerSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}NumberOfTransactionsPerStatus5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxInfAndSts" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}PaymentTransaction136" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInstruction42", propOrder = {
    "orgnlPmtInfId",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "pmtInfSts",
    "stsRsnInf",
    "nbOfTxsPerSts",
    "txInfAndSts"
})
public class OriginalPaymentInstruction42 {

    @XmlElement(name = "OrgnlPmtInfId", required = true)
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlNbOfTxs")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "PmtInfSts")
    protected String pmtInfSts;
    @XmlElement(name = "StsRsnInf")
    protected List<StatusReasonInformation12> stsRsnInf;
    @XmlElement(name = "NbOfTxsPerSts")
    protected List<NumberOfTransactionsPerStatus5> nbOfTxsPerSts;
    @XmlElement(name = "TxInfAndSts")
    protected List<PaymentTransaction136> txInfAndSts;

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNbOfTxs() {
        return orgnlNbOfTxs;
    }

    /**
     * Sets the value of the orgnlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlNbOfTxs(String value) {
        this.orgnlNbOfTxs = value;
    }

    /**
     * Gets the value of the orgnlCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlCtrlSum() {
        return orgnlCtrlSum;
    }

    /**
     * Sets the value of the orgnlCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgnlCtrlSum(BigDecimal value) {
        this.orgnlCtrlSum = value;
    }

    /**
     * Gets the value of the pmtInfSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfSts() {
        return pmtInfSts;
    }

    /**
     * Sets the value of the pmtInfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfSts(String value) {
        this.pmtInfSts = value;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation12 }
     * 
     * 
     */
    public List<StatusReasonInformation12> getStsRsnInf() {
        if (stsRsnInf == null) {
            stsRsnInf = new ArrayList<StatusReasonInformation12>();
        }
        return this.stsRsnInf;
    }

    /**
     * Gets the value of the nbOfTxsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfTxsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfTxsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerStatus5 }
     * 
     * 
     */
    public List<NumberOfTransactionsPerStatus5> getNbOfTxsPerSts() {
        if (nbOfTxsPerSts == null) {
            nbOfTxsPerSts = new ArrayList<NumberOfTransactionsPerStatus5>();
        }
        return this.nbOfTxsPerSts;
    }

    /**
     * Gets the value of the txInfAndSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txInfAndSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInfAndSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction136 }
     * 
     * 
     */
    public List<PaymentTransaction136> getTxInfAndSts() {
        if (txInfAndSts == null) {
            txInfAndSts = new ArrayList<PaymentTransaction136>();
        }
        return this.txInfAndSts;
    }

}