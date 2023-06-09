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
 * Inneholder elementene som skal være med ved spørring mot 985
 * 
 * <p>Java class for samhandlerIDataB985Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samhandlerIDataB985Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="navnSamh" type="{http://www.rtv.no/NamespaceTSS}Tbeskr40v"/&gt;
 *         &lt;element name="kodeSamhType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="delNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="buffnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="brukerID" type="{http://www.rtv.no/NamespaceTSS}Tbrukerid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "samhandlerIDataB985Type", propOrder = {
    "navnSamh",
    "kodeSamhType",
    "delNavn",
    "buffnr",
    "brukerID"
})
public class SamhandlerIDataB985Type {

    @XmlElement(required = true)
    protected String navnSamh;
    @XmlElement(required = true)
    protected String kodeSamhType;
    @XmlElement(required = true)
    protected String delNavn;
    @XmlElement(required = true)
    protected String buffnr;
    @XmlElement(required = true)
    protected String brukerID;

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
     * Gets the value of the delNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelNavn() {
        return delNavn;
    }

    /**
     * Sets the value of the delNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelNavn(String value) {
        this.delNavn = value;
    }

    /**
     * Gets the value of the buffnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuffnr() {
        return buffnr;
    }

    /**
     * Sets the value of the buffnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuffnr(String value) {
        this.buffnr = value;
    }

    /**
     * Gets the value of the brukerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerID() {
        return brukerID;
    }

    /**
     * Sets the value of the brukerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrukerID(String value) {
        this.brukerID = value;
    }

}
