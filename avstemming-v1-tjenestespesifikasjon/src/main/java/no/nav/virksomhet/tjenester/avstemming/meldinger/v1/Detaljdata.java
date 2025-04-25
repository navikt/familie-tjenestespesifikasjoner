
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grensesnittavstemmingen kan inneholde detaljer på avviste meldinger, godkjente meldinger med varsel og meldinger hvor avleverende system ikke har mottatt kvitteringsmelding. Det kan ikke overføres 140-data uten at det også er overført en id-130. Det må overføres ID140 dersom det finnes avviste meldinger eller meldinger hvor det mangler kvittering.
 * 
 * <p>Java class for Detaljdata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Detaljdata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="detaljType" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}DetaljType"/>
 *         <element name="offnr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="avleverendeTransaksjonNokkel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="meldingKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alvorlighetsgrad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tekstMelding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tidspunkt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detaljdata", propOrder = {
    "detaljType",
    "offnr",
    "avleverendeTransaksjonNokkel",
    "meldingKode",
    "alvorlighetsgrad",
    "tekstMelding",
    "tidspunkt"
})
public class Detaljdata {

    /**
     * Angir hvilken type detaljen gjelder
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DetaljType detaljType;
    /**
     * Hvem detaljen hjelder, kan inneholde dnr/fnr, TSS-nr eller Orgnr.
     * 
     */
    @XmlElement(required = true)
    protected String offnr;
    /**
     * Avleverende systems identifikasjon av vedtaket
     * 
     */
    @XmlElement(required = true)
    protected String avleverendeTransaksjonNokkel;
    /**
     * Meldingkode på varsel/feil
     * 
     */
    protected String meldingKode;
    /**
     * Angir alvorlighetsgraden på varsel/feil
     * 
     */
    protected String alvorlighetsgrad;
    /**
     * Meldingstekst på varsel/feil
     * 
     */
    protected String tekstMelding;
    /**
     * Når meldingen ble sendt/mottatt
     * 
     */
    @XmlElement(required = true)
    protected String tidspunkt;

    /**
     * Angir hvilken type detaljen gjelder
     * 
     * @return
     *     possible object is
     *     {@link DetaljType }
     *     
     */
    public DetaljType getDetaljType() {
        return detaljType;
    }

    /**
     * Sets the value of the detaljType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetaljType }
     *     
     * @see #getDetaljType()
     */
    public void setDetaljType(DetaljType value) {
        this.detaljType = value;
    }

    /**
     * Hvem detaljen hjelder, kan inneholde dnr/fnr, TSS-nr eller Orgnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffnr() {
        return offnr;
    }

    /**
     * Sets the value of the offnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOffnr()
     */
    public void setOffnr(String value) {
        this.offnr = value;
    }

    /**
     * Avleverende systems identifikasjon av vedtaket
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvleverendeTransaksjonNokkel() {
        return avleverendeTransaksjonNokkel;
    }

    /**
     * Sets the value of the avleverendeTransaksjonNokkel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvleverendeTransaksjonNokkel()
     */
    public void setAvleverendeTransaksjonNokkel(String value) {
        this.avleverendeTransaksjonNokkel = value;
    }

    /**
     * Meldingkode på varsel/feil
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeldingKode() {
        return meldingKode;
    }

    /**
     * Sets the value of the meldingKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMeldingKode()
     */
    public void setMeldingKode(String value) {
        this.meldingKode = value;
    }

    /**
     * Angir alvorlighetsgraden på varsel/feil
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlvorlighetsgrad() {
        return alvorlighetsgrad;
    }

    /**
     * Sets the value of the alvorlighetsgrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAlvorlighetsgrad()
     */
    public void setAlvorlighetsgrad(String value) {
        this.alvorlighetsgrad = value;
    }

    /**
     * Meldingstekst på varsel/feil
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekstMelding() {
        return tekstMelding;
    }

    /**
     * Sets the value of the tekstMelding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTekstMelding()
     */
    public void setTekstMelding(String value) {
        this.tekstMelding = value;
    }

    /**
     * Når meldingen ble sendt/mottatt
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspunkt() {
        return tidspunkt;
    }

    /**
     * Sets the value of the tidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTidspunkt()
     */
    public void setTidspunkt(String value) {
        this.tidspunkt = value;
    }

}
