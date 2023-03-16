
package no.nav.virksomhet.tjenester.avstemming.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1.SendAsynkronKonsistensavstemmingsdataRequest;


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
 *         &lt;element name="request" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}SendAsynkronKonsistensavstemmingsdataRequest"/>
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
    "request"
})
@XmlRootElement(name = "sendAsynkronKonsistensavstemmingsdata")
public class SendAsynkronKonsistensavstemmingsdata {

    @XmlElement(required = true)
    protected SendAsynkronKonsistensavstemmingsdataRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link SendAsynkronKonsistensavstemmingsdataRequest }
     *     
     */
    public SendAsynkronKonsistensavstemmingsdataRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendAsynkronKonsistensavstemmingsdataRequest }
     *     
     */
    public void setRequest(SendAsynkronKonsistensavstemmingsdataRequest value) {
        this.request = value;
    }

}
