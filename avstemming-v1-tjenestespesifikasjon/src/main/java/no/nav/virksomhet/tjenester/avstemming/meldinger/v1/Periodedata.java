
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Avleverende system må også sende med en perioderecord som definerer for hvilken periode avstemmingen gjelder.
 * 
 * <p>Java class for Periodedata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Periodedata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datoAvstemtFom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="datoAvstemtTom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periodedata", propOrder = {
    "datoAvstemtFom",
    "datoAvstemtTom"
})
public class Periodedata {

    @XmlElement(required = true)
    protected String datoAvstemtFom;
    @XmlElement(required = true)
    protected String datoAvstemtTom;

    /**
     * Gets the value of the datoAvstemtFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAvstemtFom() {
        return datoAvstemtFom;
    }

    /**
     * Sets the value of the datoAvstemtFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAvstemtFom(String value) {
        this.datoAvstemtFom = value;
    }

    /**
     * Gets the value of the datoAvstemtTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoAvstemtTom() {
        return datoAvstemtTom;
    }

    /**
     * Sets the value of the datoAvstemtTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoAvstemtTom(String value) {
        this.datoAvstemtTom = value;
    }

}
