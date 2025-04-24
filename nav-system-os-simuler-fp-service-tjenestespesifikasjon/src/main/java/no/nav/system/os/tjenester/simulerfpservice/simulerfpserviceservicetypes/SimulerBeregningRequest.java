
package no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for simulerBeregningRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="simulerBeregningRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="oppdrag" type="{http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceServiceTypes}oppdrag"/>
 *         <element name="simuleringsPeriode">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="datoSimulerFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
 *                   <element name="datoSimulerTom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simulerBeregningRequest", propOrder = {
    "oppdrag",
    "simuleringsPeriode"
})
public class SimulerBeregningRequest {

    /**
     * Oppdragetmed underelementer for simuleringsberegning.
     * 
     */
    @XmlElement(required = true)
    protected Oppdrag oppdrag;
    /**
     * Referanse ID 300
     * 
     */
    @XmlElement(required = true)
    protected SimulerBeregningRequest.SimuleringsPeriode simuleringsPeriode;

    /**
     * Oppdragetmed underelementer for simuleringsberegning.
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

    /**
     * Referanse ID 300
     * 
     * @return
     *     possible object is
     *     {@link SimulerBeregningRequest.SimuleringsPeriode }
     *     
     */
    public SimulerBeregningRequest.SimuleringsPeriode getSimuleringsPeriode() {
        return simuleringsPeriode;
    }

    /**
     * Sets the value of the simuleringsPeriode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimulerBeregningRequest.SimuleringsPeriode }
     *     
     * @see #getSimuleringsPeriode()
     */
    public void setSimuleringsPeriode(SimulerBeregningRequest.SimuleringsPeriode value) {
        this.simuleringsPeriode = value;
    }


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
     *         <element name="datoSimulerFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
     *         <element name="datoSimulerTom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
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
        "datoSimulerFom",
        "datoSimulerTom"
    })
    public static class SimuleringsPeriode {

        protected String datoSimulerFom;
        protected String datoSimulerTom;

        /**
         * Gets the value of the datoSimulerFom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatoSimulerFom() {
            return datoSimulerFom;
        }

        /**
         * Sets the value of the datoSimulerFom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatoSimulerFom(String value) {
            this.datoSimulerFom = value;
        }

        /**
         * Gets the value of the datoSimulerTom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatoSimulerTom() {
            return datoSimulerTom;
        }

        /**
         * Sets the value of the datoSimulerTom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatoSimulerTom(String value) {
            this.datoSimulerTom = value;
        }

    }

}
