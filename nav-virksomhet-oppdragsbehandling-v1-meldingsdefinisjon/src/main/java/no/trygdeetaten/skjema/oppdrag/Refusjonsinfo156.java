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
 * Inneholder elementene som skal være med i en output 156-rekord, REFUSJONSINFO
 *             
 * 
 * <p>Java class for refusjonsinfo-156 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refusjonsinfo-156"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maksDato" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/&gt;
 *         &lt;element name="refunderesId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfnrOrgnr" minOccurs="0"/&gt;
 *         &lt;element name="datoFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refusjonsinfo-156", propOrder = {
    "maksDato",
    "refunderesId",
    "datoFom"
})
public class Refusjonsinfo156 {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar maksDato;
    protected String refunderesId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoFom;

    /**
     * Gets the value of the maksDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMaksDato() {
        return maksDato;
    }

    /**
     * Sets the value of the maksDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMaksDato(XMLGregorianCalendar value) {
        this.maksDato = value;
    }

    /**
     * Gets the value of the refunderesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefunderesId() {
        return refunderesId;
    }

    /**
     * Sets the value of the refunderesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefunderesId(String value) {
        this.refunderesId = value;
    }

    /**
     * Gets the value of the datoFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoFom() {
        return datoFom;
    }

    /**
     * Sets the value of the datoFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoFom(XMLGregorianCalendar value) {
        this.datoFom = value;
    }

    public Refusjonsinfo156 withMaksDato(XMLGregorianCalendar value) {
        setMaksDato(value);
        return this;
    }

    public Refusjonsinfo156 withRefunderesId(String value) {
        setRefunderesId(value);
        return this;
    }

    public Refusjonsinfo156 withDatoFom(XMLGregorianCalendar value) {
        setDatoFom(value);
        return this;
    }

}
