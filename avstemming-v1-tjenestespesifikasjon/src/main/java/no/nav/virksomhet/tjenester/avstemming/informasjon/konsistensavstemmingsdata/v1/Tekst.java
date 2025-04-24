
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tekst complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Tekst">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tekstlinjeNummer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="tekstKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tekstPeriode" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Periode" minOccurs="0"/>
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
@XmlType(name = "Tekst", propOrder = {
    "tekstlinjeNummer",
    "tekstKode",
    "tekst",
    "tekstPeriode",
    "feilregistrering"
})
public class Tekst {

    /**
     * Fortløpende nummerering av tekst knyttet til et oppdrag
     * 
     */
    protected Integer tekstlinjeNummer;
    /**
     * Tekstkoder (melding på utbetalingskort).
     * 
     */
    protected String tekstKode;
    /**
     * Utbetalingstekst (melding på utbetalingskort). ”Fjern” medfører at teksten markeres som utgått.
     * 
     */
    protected String tekst;
    /**
     * Når teksten gjelder fra-og-med / til-og-med. Format åååå-mm-dd .
     * 
     */
    protected Periode tekstPeriode;
    /**
     * Settes til J hvis teksten var en feilregistrering
     * 
     */
    protected String feilregistrering;

    /**
     * Fortløpende nummerering av tekst knyttet til et oppdrag
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTekstlinjeNummer() {
        return tekstlinjeNummer;
    }

    /**
     * Sets the value of the tekstlinjeNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getTekstlinjeNummer()
     */
    public void setTekstlinjeNummer(Integer value) {
        this.tekstlinjeNummer = value;
    }

    /**
     * Tekstkoder (melding på utbetalingskort).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekstKode() {
        return tekstKode;
    }

    /**
     * Sets the value of the tekstKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTekstKode()
     */
    public void setTekstKode(String value) {
        this.tekstKode = value;
    }

    /**
     * Utbetalingstekst (melding på utbetalingskort). ”Fjern” medfører at teksten markeres som utgått.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * Sets the value of the tekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTekst()
     */
    public void setTekst(String value) {
        this.tekst = value;
    }

    /**
     * Når teksten gjelder fra-og-med / til-og-med. Format åååå-mm-dd .
     * 
     * @return
     *     possible object is
     *     {@link Periode }
     *     
     */
    public Periode getTekstPeriode() {
        return tekstPeriode;
    }

    /**
     * Sets the value of the tekstPeriode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periode }
     *     
     * @see #getTekstPeriode()
     */
    public void setTekstPeriode(Periode value) {
        this.tekstPeriode = value;
    }

    /**
     * Settes til J hvis teksten var en feilregistrering
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
