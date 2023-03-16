
package no.nav.virksomhet.tjenester.avstemming.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plassholder" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plassholder"
})
@XmlRootElement(name = "sendAsynkronKonsistensavstemmingsdataResponse")
public class SendAsynkronKonsistensavstemmingsdataResponse {

    protected Object plassholder;

    /**
     * Gets the value of the plassholder property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPlassholder() {
        return plassholder;
    }

    /**
     * Sets the value of the plassholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPlassholder(Object value) {
        this.plassholder = value;
    }

}
