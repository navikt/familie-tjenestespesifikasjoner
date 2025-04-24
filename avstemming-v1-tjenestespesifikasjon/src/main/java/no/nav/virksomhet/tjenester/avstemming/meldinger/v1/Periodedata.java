
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Avleverende system må også sende med en perioderecord som definerer for hvilken periode avstemmingen gjelder.
 * 
 * <p>Java class for Periodedata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Periodedata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="datoAvstemtFom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="datoAvstemtTom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periodedata", propOrder = {
    "datoAvstemtFom",
    "datoAvstemtTom"
})
public class Periodedata {

    /**
     * Angir når avstemmingen gjelder fra, dato og time (ååååmmddhh)
     * 
     */
    @XmlElement(required = true)
    protected String datoAvstemtFom;
    /**
     * Angir når avstemmingen gjelder til, dato og time (ååååmmddhh)
     * 
     */
    @XmlElement(required = true)
    protected String datoAvstemtTom;

    /**
     * Angir når avstemmingen gjelder fra, dato og time (ååååmmddhh)
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
     * @see #getDatoAvstemtFom()
     */
    public void setDatoAvstemtFom(String value) {
        this.datoAvstemtFom = value;
    }

    /**
     * Angir når avstemmingen gjelder til, dato og time (ååååmmddhh)
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
     * @see #getDatoAvstemtTom()
     */
    public void setDatoAvstemtTom(String value) {
        this.datoAvstemtTom = value;
    }

}
