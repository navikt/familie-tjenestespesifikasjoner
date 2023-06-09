//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:43 PM CET 
//


package no.nav.tilbakekreving.typer.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * MMEL - Inneholder elementene som skal være med i en status output
 * 
 * <p>Java class for MmelDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MmelDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kodeMelding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alvorlighetsgrad" type="{urn:no:nav:tilbakekreving:typer:v1}AlvorlighetsgradDto" minOccurs="0"/&gt;
 *         &lt;element name="beskrMelding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqlKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqlState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sqlMelding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mqCompletionKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mqReasonKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectionNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MmelDto", propOrder = {
    "systemId",
    "kodeMelding",
    "alvorlighetsgrad",
    "beskrMelding",
    "sqlKode",
    "sqlState",
    "sqlMelding",
    "mqCompletionKode",
    "mqReasonKode",
    "programId",
    "sectionNavn"
})
public class MmelDto {

    protected String systemId;
    protected String kodeMelding;
    protected String alvorlighetsgrad;
    protected String beskrMelding;
    protected String sqlKode;
    protected String sqlState;
    protected String sqlMelding;
    protected String mqCompletionKode;
    protected String mqReasonKode;
    protected String programId;
    protected String sectionNavn;

    /**
     * Gets the value of the systemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Sets the value of the systemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Gets the value of the kodeMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeMelding() {
        return kodeMelding;
    }

    /**
     * Sets the value of the kodeMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeMelding(String value) {
        this.kodeMelding = value;
    }

    /**
     * Gets the value of the alvorlighetsgrad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlvorlighetsgrad() {
        return alvorlighetsgrad;
    }

    /**
     * Sets the value of the alvorlighetsgrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlvorlighetsgrad(String value) {
        this.alvorlighetsgrad = value;
    }

    /**
     * Gets the value of the beskrMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrMelding() {
        return beskrMelding;
    }

    /**
     * Sets the value of the beskrMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrMelding(String value) {
        this.beskrMelding = value;
    }

    /**
     * Gets the value of the sqlKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlKode() {
        return sqlKode;
    }

    /**
     * Sets the value of the sqlKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlKode(String value) {
        this.sqlKode = value;
    }

    /**
     * Gets the value of the sqlState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlState() {
        return sqlState;
    }

    /**
     * Sets the value of the sqlState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlState(String value) {
        this.sqlState = value;
    }

    /**
     * Gets the value of the sqlMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSqlMelding() {
        return sqlMelding;
    }

    /**
     * Sets the value of the sqlMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSqlMelding(String value) {
        this.sqlMelding = value;
    }

    /**
     * Gets the value of the mqCompletionKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMqCompletionKode() {
        return mqCompletionKode;
    }

    /**
     * Sets the value of the mqCompletionKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMqCompletionKode(String value) {
        this.mqCompletionKode = value;
    }

    /**
     * Gets the value of the mqReasonKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMqReasonKode() {
        return mqReasonKode;
    }

    /**
     * Sets the value of the mqReasonKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMqReasonKode(String value) {
        this.mqReasonKode = value;
    }

    /**
     * Gets the value of the programId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramId() {
        return programId;
    }

    /**
     * Sets the value of the programId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramId(String value) {
        this.programId = value;
    }

    /**
     * Gets the value of the sectionNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionNavn() {
        return sectionNavn;
    }

    /**
     * Sets the value of the sectionNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionNavn(String value) {
        this.sectionNavn = value;
    }

}
