//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.22 at 11:16:59 AM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Inneholder elementene som skal være med i en 120-rekord, Oppdragsenhet
 *             
 * 
 * <p>Java class for oppdrags-enhet-120 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppdrags-enhet-120"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeEnhet" type="{http://www.trygdeetaten.no/skjema/oppdrag}TtypeEnhet"/&gt;
 *         &lt;element name="enhet" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tenhet" minOccurs="0"/&gt;
 *         &lt;element name="datoEnhetFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrags-enhet-120", propOrder = {
    "typeEnhet",
    "enhet",
    "datoEnhetFom"
})
public class OppdragsEnhet120 {

    @XmlElement(required = true)
    protected String typeEnhet;
    protected String enhet;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoEnhetFom;

    /**
     * Gets the value of the typeEnhet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeEnhet() {
        return typeEnhet;
    }

    /**
     * Sets the value of the typeEnhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeEnhet(String value) {
        this.typeEnhet = value;
    }

    /**
     * Gets the value of the enhet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhet() {
        return enhet;
    }

    /**
     * Sets the value of the enhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhet(String value) {
        this.enhet = value;
    }

    /**
     * Gets the value of the datoEnhetFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoEnhetFom() {
        return datoEnhetFom;
    }

    /**
     * Sets the value of the datoEnhetFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoEnhetFom(XMLGregorianCalendar value) {
        this.datoEnhetFom = value;
    }

    public OppdragsEnhet120 withTypeEnhet(String value) {
        setTypeEnhet(value);
        return this;
    }

    public OppdragsEnhet120 withEnhet(String value) {
        setEnhet(value);
        return this;
    }

    public OppdragsEnhet120 withDatoEnhetFom(XMLGregorianCalendar value) {
        setDatoEnhetFom(value);
        return this;
    }

}
