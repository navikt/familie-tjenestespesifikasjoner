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
 * Dette er en type som beskriver elementene til samhandler autorisasjonrettigheter
 * 
 * <p>Java class for autorRettighetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autorRettighetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodeAutorType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kodeAutRett" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beskrAutRett" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/&gt;
 *         &lt;element name="datoAutRettFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoAutRettTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoVedtakGitt" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoVedtakMistet" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="gyldigAutRett" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
 *         &lt;element name="kilde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brukerId" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/&gt;
 *         &lt;element name="tidReg" type="{http://www.rtv.no/NamespaceTSS}Ttidreg"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autorRettighetType", propOrder = {
    "kodeAutorType",
    "kodeAutRett",
    "beskrAutRett",
    "datoAutRettFom",
    "datoAutRettTom",
    "datoVedtakGitt",
    "datoVedtakMistet",
    "gyldigAutRett",
    "kilde",
    "brukerId",
    "tidReg"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class AutorRettighetType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeAutorType;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kodeAutRett;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String beskrAutRett;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoAutRettFom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoAutRettTom;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoVedtakGitt;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String datoVedtakMistet;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String gyldigAutRett;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String kilde;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String brukerId;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String tidReg;

    /**
     * Gets the value of the kodeAutorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeAutorType() {
        return kodeAutorType;
    }

    /**
     * Sets the value of the kodeAutorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeAutorType(String value) {
        this.kodeAutorType = value;
    }

    /**
     * Gets the value of the kodeAutRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKodeAutRett() {
        return kodeAutRett;
    }

    /**
     * Sets the value of the kodeAutRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKodeAutRett(String value) {
        this.kodeAutRett = value;
    }

    /**
     * Gets the value of the beskrAutRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getBeskrAutRett() {
        return beskrAutRett;
    }

    /**
     * Sets the value of the beskrAutRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setBeskrAutRett(String value) {
        this.beskrAutRett = value;
    }

    /**
     * Gets the value of the datoAutRettFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoAutRettFom() {
        return datoAutRettFom;
    }

    /**
     * Sets the value of the datoAutRettFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoAutRettFom(String value) {
        this.datoAutRettFom = value;
    }

    /**
     * Gets the value of the datoAutRettTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoAutRettTom() {
        return datoAutRettTom;
    }

    /**
     * Sets the value of the datoAutRettTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoAutRettTom(String value) {
        this.datoAutRettTom = value;
    }

    /**
     * Gets the value of the datoVedtakGitt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoVedtakGitt() {
        return datoVedtakGitt;
    }

    /**
     * Sets the value of the datoVedtakGitt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoVedtakGitt(String value) {
        this.datoVedtakGitt = value;
    }

    /**
     * Gets the value of the datoVedtakMistet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getDatoVedtakMistet() {
        return datoVedtakMistet;
    }

    /**
     * Sets the value of the datoVedtakMistet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setDatoVedtakMistet(String value) {
        this.datoVedtakMistet = value;
    }

    /**
     * Gets the value of the gyldigAutRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getGyldigAutRett() {
        return gyldigAutRett;
    }

    /**
     * Sets the value of the gyldigAutRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setGyldigAutRett(String value) {
        this.gyldigAutRett = value;
    }

    /**
     * Gets the value of the kilde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getKilde() {
        return kilde;
    }

    /**
     * Sets the value of the kilde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setKilde(String value) {
        this.kilde = value;
    }

    /**
     * Gets the value of the brukerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setBrukerId(String value) {
        this.brukerId = value;
    }

    /**
     * Gets the value of the tidReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getTidReg() {
        return tidReg;
    }

    /**
     * Sets the value of the tidReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setTidReg(String value) {
        this.tidReg = value;
    }

}
