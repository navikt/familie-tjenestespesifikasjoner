
package no.nav.system.os.entiteter.infomelding;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Informasjonsmelding hentes fra ID 469MMEL
 * 
 * <p>Java class for infomelding complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infomelding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beskrMelding"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="75"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infomelding", propOrder = {
    "beskrMelding"
})
public class Infomelding {

    @XmlElement(required = true)
    protected String beskrMelding;

    /**
     * Gets the value of the beskrMelding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrMelding() {
        return beskrMelding;
    }

    /**
     * Sets the value of the beskrMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrMelding(String value) {
        this.beskrMelding = value;
    }

}
