
package no.nav.virksomhet.tjenester.avstemming.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plassholder" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plassholder"
})
@XmlRootElement(name = "sendAsynkronAvstemmingsdataResponse")
public class SendAsynkronAvstemmingsdataResponse {

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
