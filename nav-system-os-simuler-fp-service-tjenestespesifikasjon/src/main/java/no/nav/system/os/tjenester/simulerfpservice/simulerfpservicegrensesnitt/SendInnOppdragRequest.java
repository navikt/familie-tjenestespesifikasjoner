
package no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="request" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}sendInnOppdragRequest"/>
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
@XmlRootElement(name = "sendInnOppdragRequest")
public class SendInnOppdragRequest {

    @XmlElement(required = true)
    protected no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest }
     *     
     */
    public no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest }
     *     
     */
    public void setRequest(no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SendInnOppdragRequest value) {
        this.request = value;
    }

}
