//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.12.12 at 12:18:20 AM UTC 
//


package com.pp.model.iso.pain014;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchAndFinancialInstitutionIdentification6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}FinancialInstitutionIdentification18"/&gt;
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pain.014.001.09}BranchData3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification6", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification6 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification18 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData3 brnchId;

    /**
     * Gets the value of the finInstnId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification18 }
     *     
     */
    public FinancialInstitutionIdentification18 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Sets the value of the finInstnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification18 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification18 value) {
        this.finInstnId = value;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData3 }
     *     
     */
    public BranchData3 getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData3 }
     *     
     */
    public void setBrnchId(BranchData3 value) {
        this.brnchId = value;
    }

}
