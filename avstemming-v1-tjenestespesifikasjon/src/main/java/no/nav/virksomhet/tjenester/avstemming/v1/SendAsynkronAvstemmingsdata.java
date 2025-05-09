
package no.nav.virksomhet.tjenester.avstemming.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.virksomhet.tjenester.avstemming.meldinger.v1.SendAsynkronAvstemmingsdataRequest;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="request" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}SendAsynkronAvstemmingsdataRequest"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "sendAsynkronAvstemmingsdata")
public class SendAsynkronAvstemmingsdata {

    @XmlElement(required = true)
    protected SendAsynkronAvstemmingsdataRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link SendAsynkronAvstemmingsdataRequest }
     *     
     */
    public SendAsynkronAvstemmingsdataRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendAsynkronAvstemmingsdataRequest }
     *     
     */
    public void setRequest(SendAsynkronAvstemmingsdataRequest value) {
        this.request = value;
    }

}
