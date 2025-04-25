
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendAsynkronKonsistensavstemmingsdataRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SendAsynkronKonsistensavstemmingsdataRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="konsistensavstemmingsdata" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Konsistensavstemmingsdata"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendAsynkronKonsistensavstemmingsdataRequest", propOrder = {
    "konsistensavstemmingsdata"
})
public class SendAsynkronKonsistensavstemmingsdataRequest {

    @XmlElement(required = true)
    protected Konsistensavstemmingsdata konsistensavstemmingsdata;

    /**
     * Gets the value of the konsistensavstemmingsdata property.
     * 
     * @return
     *     possible object is
     *     {@link Konsistensavstemmingsdata }
     *     
     */
    public Konsistensavstemmingsdata getKonsistensavstemmingsdata() {
        return konsistensavstemmingsdata;
    }

    /**
     * Sets the value of the konsistensavstemmingsdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Konsistensavstemmingsdata }
     *     
     */
    public void setKonsistensavstemmingsdata(Konsistensavstemmingsdata value) {
        this.konsistensavstemmingsdata = value;
    }

}
