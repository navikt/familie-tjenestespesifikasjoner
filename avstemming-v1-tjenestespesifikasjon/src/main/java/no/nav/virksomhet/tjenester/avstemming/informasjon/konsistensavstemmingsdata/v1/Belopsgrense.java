
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Belopsgrense complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Belopsgrense">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="grenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="belopsgrense" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="grensePeriode" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Periode" minOccurs="0"/>
 *         <element name="feilregistrering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Belopsgrense", propOrder = {
    "grenseType",
    "belopsgrense",
    "grensePeriode",
    "feilregistrering"
})
public class Belopsgrense {

    /**
     * Kan være f.eks. min- og max utbetalingsbeløp.
     * 
     */
    protected String grenseType;
    /**
     * Grensebeløpet til utbetaling
     * 
     */
    protected BigDecimal belopsgrense;
    /**
     * Når grensebeløpet gjelder fra-og-med / til-og-med
     * 
     */
    protected Periode grensePeriode;
    /**
     * Settes til J hvis beløpsgrensen var en feilregistrering
     * 
     */
    protected String feilregistrering;

    /**
     * Kan være f.eks. min- og max utbetalingsbeløp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrenseType() {
        return grenseType;
    }

    /**
     * Sets the value of the grenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGrenseType()
     */
    public void setGrenseType(String value) {
        this.grenseType = value;
    }

    /**
     * Grensebeløpet til utbetaling
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopsgrense() {
        return belopsgrense;
    }

    /**
     * Sets the value of the belopsgrense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getBelopsgrense()
     */
    public void setBelopsgrense(BigDecimal value) {
        this.belopsgrense = value;
    }

    /**
     * Når grensebeløpet gjelder fra-og-med / til-og-med
     * 
     * @return
     *     possible object is
     *     {@link Periode }
     *     
     */
    public Periode getGrensePeriode() {
        return grensePeriode;
    }

    /**
     * Sets the value of the grensePeriode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periode }
     *     
     * @see #getGrensePeriode()
     */
    public void setGrensePeriode(Periode value) {
        this.grensePeriode = value;
    }

    /**
     * Settes til J hvis beløpsgrensen var en feilregistrering
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilregistrering() {
        return feilregistrering;
    }

    /**
     * Sets the value of the feilregistrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFeilregistrering()
     */
    public void setFeilregistrering(String value) {
        this.feilregistrering = value;
    }

}
