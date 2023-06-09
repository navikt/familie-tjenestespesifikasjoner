
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enhet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enhet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enhetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enhet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enhetFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enhet", propOrder = {
    "enhetType",
    "enhet",
    "enhetFom"
})
public class Enhet {

    protected String enhetType;
    protected String enhet;
    protected String enhetFom;

    /**
     * Gets the value of the enhetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetType() {
        return enhetType;
    }

    /**
     * Sets the value of the enhetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhetType(String value) {
        this.enhetType = value;
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
     * Gets the value of the enhetFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetFom() {
        return enhetFom;
    }

    /**
     * Sets the value of the enhetFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhetFom(String value) {
        this.enhetFom = value;
    }

}
