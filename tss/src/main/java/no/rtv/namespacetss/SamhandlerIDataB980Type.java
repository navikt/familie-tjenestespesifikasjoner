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
 * Inneholder elementene som skal være med ved spørring mot 980
 * 
 * <p>Java class for samhandlerIDataB980Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="samhandlerIDataB980Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="idOffTSS" type="{http://www.rtv.no/NamespaceTSS}TTSSidoff"/&gt;
 *           &lt;element name="OFFid" type="{http://www.rtv.no/NamespaceTSS}TidOFF1"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="hentNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "samhandlerIDataB980Type", propOrder = {
    "idOffTSS",
    "ofFid",
    "hentNavn",
    "brukerID"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class SamhandlerIDataB980Type {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String idOffTSS;
    @XmlElement(name = "OFFid")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected TidOFF1 ofFid;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String hentNavn;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String brukerID;

    /**
     * Gets the value of the idOffTSS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setIdOffTSS(String value) {
        this.idOffTSS = value;
    }

    /**
     * Gets the value of the ofFid property.
     * 
     * @return
     *     possible object is
     *     {@link TidOFF1 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public TidOFF1 getOFFid() {
        return ofFid;
    }

    /**
     * Sets the value of the ofFid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidOFF1 }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setOFFid(TidOFF1 value) {
        this.ofFid = value;
    }

    /**
     * Gets the value of the hentNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getHentNavn() {
        return hentNavn;
    }

    /**
     * Sets the value of the hentNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setHentNavn(String value) {
        this.hentNavn = value;
    }

    /**
     * Gets the value of the brukerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setBrukerID(String value) {
        this.brukerID = value;
    }

}
