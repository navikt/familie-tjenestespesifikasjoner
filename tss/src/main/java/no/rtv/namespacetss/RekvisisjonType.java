//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:48 PM CET 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dette er en type som beskriver elementene til samhandler rekvisisjonsrettighet
 * 
 * <p>Java class for rekvisisjonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rekvisisjonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodeRekvisisjonRett" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beskrRekvisisjonRett" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/&gt;
 *         &lt;element name="datoRekRettFom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoRekRettTom" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoVedtakGitt" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="datoVedtakMistet" type="{http://www.rtv.no/NamespaceTSS}Tdato"/&gt;
 *         &lt;element name="gyldigRekRett" type="{http://www.rtv.no/NamespaceTSS}Tgyldig"/&gt;
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
@XmlType(name = "rekvisisjonType", propOrder = {
    "kodeRekvisisjonRett",
    "beskrRekvisisjonRett",
    "datoRekRettFom",
    "datoRekRettTom",
    "datoVedtakGitt",
    "datoVedtakMistet",
    "gyldigRekRett",
    "kilde",
    "brukerId",
    "tidReg"
})
public class RekvisisjonType {

    @XmlElement(required = true)
    protected String kodeRekvisisjonRett;
    @XmlElement(required = true)
    protected String beskrRekvisisjonRett;
    @XmlElement(required = true)
    protected String datoRekRettFom;
    @XmlElement(required = true)
    protected String datoRekRettTom;
    @XmlElement(required = true)
    protected String datoVedtakGitt;
    @XmlElement(required = true)
    protected String datoVedtakMistet;
    @XmlElement(required = true)
    protected String gyldigRekRett;
    @XmlElement(required = true)
    protected String kilde;
    @XmlElement(required = true)
    protected String brukerId;
    @XmlElement(required = true)
    protected String tidReg;

    /**
     * Gets the value of the kodeRekvisisjonRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeRekvisisjonRett() {
        return kodeRekvisisjonRett;
    }

    /**
     * Sets the value of the kodeRekvisisjonRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeRekvisisjonRett(String value) {
        this.kodeRekvisisjonRett = value;
    }

    /**
     * Gets the value of the beskrRekvisisjonRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrRekvisisjonRett() {
        return beskrRekvisisjonRett;
    }

    /**
     * Sets the value of the beskrRekvisisjonRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrRekvisisjonRett(String value) {
        this.beskrRekvisisjonRett = value;
    }

    /**
     * Gets the value of the datoRekRettFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoRekRettFom() {
        return datoRekRettFom;
    }

    /**
     * Sets the value of the datoRekRettFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoRekRettFom(String value) {
        this.datoRekRettFom = value;
    }

    /**
     * Gets the value of the datoRekRettTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoRekRettTom() {
        return datoRekRettTom;
    }

    /**
     * Sets the value of the datoRekRettTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoRekRettTom(String value) {
        this.datoRekRettTom = value;
    }

    /**
     * Gets the value of the datoVedtakGitt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setDatoVedtakMistet(String value) {
        this.datoVedtakMistet = value;
    }

    /**
     * Gets the value of the gyldigRekRett property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGyldigRekRett() {
        return gyldigRekRett;
    }

    /**
     * Sets the value of the gyldigRekRett property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGyldigRekRett(String value) {
        this.gyldigRekRett = value;
    }

    /**
     * Gets the value of the kilde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setTidReg(String value) {
        this.tidReg = value;
    }

}
