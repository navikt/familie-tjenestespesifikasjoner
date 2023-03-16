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
 * Inneholder elementene som skal være med i en 160-rekord ved oppdatering
 * 
 * <p>Java class for samhAjour160Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samhAjour160Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="avdNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kodeApnTidType" type="{http://www.rtv.no/NamespaceTSS}Tkodeapntidtype"/&gt;
 *         &lt;element name="kodeApnPeriode" type="{http://www.rtv.no/NamespaceTSS}Tkodeapnperiode"/&gt;
 *         &lt;element name="apningsTidFom" type="{http://www.rtv.no/NamespaceTSS}Thhmmss"/&gt;
 *         &lt;element name="apningsTidTom" type="{http://www.rtv.no/NamespaceTSS}Thhmmss"/&gt;
 *         &lt;element name="datoApningFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoApningTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="gyldigApning" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhAjour160Type", propOrder = {
    "avdNr",
    "kodeApnTidType",
    "kodeApnPeriode",
    "apningsTidFom",
    "apningsTidTom",
    "datoApningFom",
    "datoApningTom",
    "gyldigApning"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class SamhAjour160Type {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String avdNr;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeApnTidType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeApnPeriode;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String apningsTidFom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String apningsTidTom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoApningFom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoApningTom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String gyldigApning;

    /**
     * Gets the value of the avdNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getAvdNr() {
        return avdNr;
    }

    /**
     * Sets the value of the avdNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setAvdNr(String value) {
        this.avdNr = value;
    }

    /**
     * Gets the value of the kodeApnTidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeApnTidType() {
        return kodeApnTidType;
    }

    /**
     * Sets the value of the kodeApnTidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeApnTidType(String value) {
        this.kodeApnTidType = value;
    }

    /**
     * Gets the value of the kodeApnPeriode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeApnPeriode() {
        return kodeApnPeriode;
    }

    /**
     * Sets the value of the kodeApnPeriode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeApnPeriode(String value) {
        this.kodeApnPeriode = value;
    }

    /**
     * Gets the value of the apningsTidFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getApningsTidFom() {
        return apningsTidFom;
    }

    /**
     * Sets the value of the apningsTidFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setApningsTidFom(String value) {
        this.apningsTidFom = value;
    }

    /**
     * Gets the value of the apningsTidTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getApningsTidTom() {
        return apningsTidTom;
    }

    /**
     * Sets the value of the apningsTidTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setApningsTidTom(String value) {
        this.apningsTidTom = value;
    }

    /**
     * Gets the value of the datoApningFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoApningFom() {
        return datoApningFom;
    }

    /**
     * Sets the value of the datoApningFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoApningFom(String value) {
        this.datoApningFom = value;
    }

    /**
     * Gets the value of the datoApningTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoApningTom() {
        return datoApningTom;
    }

    /**
     * Sets the value of the datoApningTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoApningTom(String value) {
        this.datoApningTom = value;
    }

    /**
     * Gets the value of the gyldigApning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getGyldigApning() {
        return gyldigApning;
    }

    /**
     * Sets the value of the gyldigApning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setGyldigApning(String value) {
        this.gyldigApning = value;
    }

}