//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.trygdeetaten.skjema.oppdrag;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Inneholder elementene som skal være med i en input 160-rekord, Linjeenhet
 * 
 * <p>Java class for linje-enhet-160 complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="linje-enhet-160">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="typeEnhet" type="{http://www.trygdeetaten.no/skjema/oppdrag}TtypeEnhet"/>
 *         <element name="enhet" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tenhet" minOccurs="0"/>
 *         <element name="datoEnhetFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linje-enhet-160", propOrder = {
    "typeEnhet",
    "enhet",
    "datoEnhetFom"
})
public class LinjeEnhet160 {

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

}
