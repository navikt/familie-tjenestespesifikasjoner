//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.22 at 11:16:59 AM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Inneholder elementene som skal være med i en 130-rekord, Beløpsgrense
 * 
 * <p>Java class for belops-grense-130 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="belops-grense-130"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeGrense"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="belopGrense" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tbelop"/&gt;
 *         &lt;element name="datoGrenseFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *         &lt;element name="datoGrenseTom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/&gt;
 *         &lt;element name="feilreg" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tfeilreg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "belops-grense-130", propOrder = {
    "typeGrense",
    "belopGrense",
    "datoGrenseFom",
    "datoGrenseTom",
    "feilreg"
})
public class BelopsGrense130 {

    @XmlElement(required = true)
    protected String typeGrense;
    @XmlElement(required = true)
    protected BigDecimal belopGrense;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoGrenseFom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoGrenseTom;
    protected String feilreg;

    /**
     * Gets the value of the typeGrense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeGrense() {
        return typeGrense;
    }

    /**
     * Sets the value of the typeGrense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeGrense(String value) {
        this.typeGrense = value;
    }

    /**
     * Gets the value of the belopGrense property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopGrense() {
        return belopGrense;
    }

    /**
     * Sets the value of the belopGrense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopGrense(BigDecimal value) {
        this.belopGrense = value;
    }

    /**
     * Gets the value of the datoGrenseFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoGrenseFom() {
        return datoGrenseFom;
    }

    /**
     * Sets the value of the datoGrenseFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoGrenseFom(XMLGregorianCalendar value) {
        this.datoGrenseFom = value;
    }

    /**
     * Gets the value of the datoGrenseTom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoGrenseTom() {
        return datoGrenseTom;
    }

    /**
     * Sets the value of the datoGrenseTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoGrenseTom(XMLGregorianCalendar value) {
        this.datoGrenseTom = value;
    }

    /**
     * Gets the value of the feilreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilreg() {
        return feilreg;
    }

    /**
     * Sets the value of the feilreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilreg(String value) {
        this.feilreg = value;
    }

    public BelopsGrense130 withTypeGrense(String value) {
        setTypeGrense(value);
        return this;
    }

    public BelopsGrense130 withBelopGrense(BigDecimal value) {
        setBelopGrense(value);
        return this;
    }

    public BelopsGrense130 withDatoGrenseFom(XMLGregorianCalendar value) {
        setDatoGrenseFom(value);
        return this;
    }

    public BelopsGrense130 withDatoGrenseTom(XMLGregorianCalendar value) {
        setDatoGrenseTom(value);
        return this;
    }

    public BelopsGrense130 withFeilreg(String value) {
        setFeilreg(value);
        return this;
    }

}