//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 09:21:05 PM CET 
//


package no.rtv.namespacetss;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Inneholder elementene som skal være med i en 180-rekord ved oppdatering
 * 
 * <p>Java class for samhAjour180Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samhAjour180Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff"/&gt;
 *         &lt;element name="kodeIdType" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype"/&gt;
 *         &lt;element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kodeRelasjonRolle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datoRelFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoRelTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="gyldigRelasjon" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhAjour180Type", propOrder = {
    "idOff",
    "kodeIdType",
    "kodeSamhType",
    "kodeRelasjonRolle",
    "datoRelFom",
    "datoRelTom",
    "gyldigRelasjon"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class SamhAjour180Type {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String idOff;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeIdType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeSamhType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeRelasjonRolle;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoRelFom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoRelTom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String gyldigRelasjon;

    /**
     * Gets the value of the idOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getIdOff() {
        return idOff;
    }

    /**
     * Sets the value of the idOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setIdOff(String value) {
        this.idOff = value;
    }

    /**
     * Gets the value of the kodeIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeIdType() {
        return kodeIdType;
    }

    /**
     * Sets the value of the kodeIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeIdType(String value) {
        this.kodeIdType = value;
    }

    /**
     * Gets the value of the kodeSamhType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeSamhType() {
        return kodeSamhType;
    }

    /**
     * Sets the value of the kodeSamhType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeSamhType(String value) {
        this.kodeSamhType = value;
    }

    /**
     * Gets the value of the kodeRelasjonRolle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeRelasjonRolle() {
        return kodeRelasjonRolle;
    }

    /**
     * Sets the value of the kodeRelasjonRolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeRelasjonRolle(String value) {
        this.kodeRelasjonRolle = value;
    }

    /**
     * Gets the value of the datoRelFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoRelFom() {
        return datoRelFom;
    }

    /**
     * Sets the value of the datoRelFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoRelFom(String value) {
        this.datoRelFom = value;
    }

    /**
     * Gets the value of the datoRelTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoRelTom() {
        return datoRelTom;
    }

    /**
     * Sets the value of the datoRelTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoRelTom(String value) {
        this.datoRelTom = value;
    }

    /**
     * Gets the value of the gyldigRelasjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getGyldigRelasjon() {
        return gyldigRelasjon;
    }

    /**
     * Sets the value of the gyldigRelasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setGyldigRelasjon(String value) {
        this.gyldigRelasjon = value;
    }

}