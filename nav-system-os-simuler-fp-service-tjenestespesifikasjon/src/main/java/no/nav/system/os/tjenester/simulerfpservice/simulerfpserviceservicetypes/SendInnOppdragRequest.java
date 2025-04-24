
package no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendInnOppdragRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="sendInnOppdragRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oppdrag" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}oppdrag"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendInnOppdragRequest", propOrder = {
    "oppdrag"
})
public class SendInnOppdragRequest {

    /**
     * Oppdraget for innsending.
     * 
     */
    @XmlElement(required = true)
    protected Oppdrag oppdrag;

    /**
     * Oppdraget for innsending.
     * 
     * @return
     *     possible object is
     *     {@link Oppdrag }
     *     
     */
    public Oppdrag getOppdrag() {
        return oppdrag;
    }

    /**
     * Sets the value of the oppdrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oppdrag }
     *     
     * @see #getOppdrag()
     */
    public void setOppdrag(Oppdrag value) {
        this.oppdrag = value;
    }

}
