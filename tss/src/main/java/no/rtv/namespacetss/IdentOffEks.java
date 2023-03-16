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
 * Her beskrives returfeltene fra 980
 * 
 * <p>Java class for identOffEks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identOffEks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idOff" type="{http://www.rtv.no/NamespaceTSS}Tidoff"/&gt;
 *         &lt;element name="kodeIdentType" type="{http://www.rtv.no/NamespaceTSS}TkodeIdenttype"/&gt;
 *         &lt;element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="navnSamh" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/&gt;
 *         &lt;element name="avdelingsNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="offNrAvd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="avdelingsNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idOffTSS" type="{http://www.rtv.no/NamespaceTSS}TTSSidoff"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identOffEks", propOrder = {
    "idOff",
    "kodeIdentType",
    "kodeSamhType",
    "navnSamh",
    "avdelingsNr",
    "offNrAvd",
    "avdelingsNavn",
    "idOffTSS"
})
public class IdentOffEks {

    @XmlElement(required = true)
    protected String idOff;
    @XmlElement(required = true)
    protected String kodeIdentType;
    @XmlElement(required = true)
    protected String kodeSamhType;
    @XmlElement(required = true)
    protected String navnSamh;
    @XmlElement(required = true)
    protected String avdelingsNr;
    @XmlElement(required = true)
    protected String offNrAvd;
    @XmlElement(required = true)
    protected String avdelingsNavn;
    @XmlElement(required = true)
    protected String idOffTSS;

    /**
     * Gets the value of the idOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setIdOff(String value) {
        this.idOff = value;
    }

    /**
     * Gets the value of the kodeIdentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeIdentType() {
        return kodeIdentType;
    }

    /**
     * Sets the value of the kodeIdentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeIdentType(String value) {
        this.kodeIdentType = value;
    }

    /**
     * Gets the value of the kodeSamhType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setKodeSamhType(String value) {
        this.kodeSamhType = value;
    }

    /**
     * Gets the value of the navnSamh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavnSamh() {
        return navnSamh;
    }

    /**
     * Sets the value of the navnSamh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavnSamh(String value) {
        this.navnSamh = value;
    }

    /**
     * Gets the value of the avdelingsNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvdelingsNr() {
        return avdelingsNr;
    }

    /**
     * Sets the value of the avdelingsNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvdelingsNr(String value) {
        this.avdelingsNr = value;
    }

    /**
     * Gets the value of the offNrAvd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffNrAvd() {
        return offNrAvd;
    }

    /**
     * Sets the value of the offNrAvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffNrAvd(String value) {
        this.offNrAvd = value;
    }

    /**
     * Gets the value of the avdelingsNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvdelingsNavn() {
        return avdelingsNavn;
    }

    /**
     * Sets the value of the avdelingsNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvdelingsNavn(String value) {
        this.avdelingsNavn = value;
    }

    /**
     * Gets the value of the idOffTSS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOffTSS() {
        return idOffTSS;
    }

    /**
     * Sets the value of the idOffTSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOffTSS(String value) {
        this.idOffTSS = value;
    }

}
