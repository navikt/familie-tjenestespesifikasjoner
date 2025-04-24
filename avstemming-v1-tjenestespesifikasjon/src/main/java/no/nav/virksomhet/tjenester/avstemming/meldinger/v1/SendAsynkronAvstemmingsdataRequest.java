
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendAsynkronAvstemmingsdataRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SendAsynkronAvstemmingsdataRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="avstemmingsdata" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Avstemmingsdata"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendAsynkronAvstemmingsdataRequest", propOrder = {
    "avstemmingsdata"
})
public class SendAsynkronAvstemmingsdataRequest {

    @XmlElement(required = true)
    protected Avstemmingsdata avstemmingsdata;

    /**
     * Gets the value of the avstemmingsdata property.
     * 
     * @return
     *     possible object is
     *     {@link Avstemmingsdata }
     *     
     */
    public Avstemmingsdata getAvstemmingsdata() {
        return avstemmingsdata;
    }

    /**
     * Sets the value of the avstemmingsdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Avstemmingsdata }
     *     
     */
    public void setAvstemmingsdata(Avstemmingsdata value) {
        this.avstemmingsdata = value;
    }

}
