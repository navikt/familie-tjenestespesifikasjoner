
package no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.system.os.entiteter.beregningskjema.Beregning;
import no.nav.system.os.entiteter.infomelding.Infomelding;


/**
 * <p>Java class for simulerBeregningResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="simulerBeregningResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="simulering" type="{http://nav.no/system/os/entiteter/beregningSkjema}beregning" minOccurs="0"/>
 *         <element name="infomelding" type="{http://nav.no/system/os/entiteter/infomelding}infomelding" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulerBeregningResponse", propOrder = {
    "simulering",
    "infomelding"
})
public class SimulerBeregningResponse {

    /**
     * Simulert beregningsresultat for gitt periode
     * 
     */
    protected Beregning simulering;
    /**
     * Informasjonsmelding
     * 
     */
    protected Infomelding infomelding;

    /**
     * Simulert beregningsresultat for gitt periode
     * 
     * @return
     *     possible object is
     *     {@link Beregning }
     *     
     */
    public Beregning getSimulering() {
        return simulering;
    }

    /**
     * Sets the value of the simulering property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beregning }
     *     
     * @see #getSimulering()
     */
    public void setSimulering(Beregning value) {
        this.simulering = value;
    }

    /**
     * Informasjonsmelding
     * 
     * @return
     *     possible object is
     *     {@link Infomelding }
     *     
     */
    public Infomelding getInfomelding() {
        return infomelding;
    }

    /**
     * Sets the value of the infomelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Infomelding }
     *     
     * @see #getInfomelding()
     */
    public void setInfomelding(Infomelding value) {
        this.infomelding = value;
    }

}
