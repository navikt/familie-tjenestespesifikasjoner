
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Enhver no.nav.virksomhet.tjenester.avstemming må initieres og avsluttes med en 110-record, på det formatet som er beskrevet her
 * 
 * <p>Java class for Aksjonsdata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Aksjonsdata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="aksjonType" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}AksjonType"/>
 *         <element name="kildeType" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}KildeType"/>
 *         <element name="avstemmingType" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}AvstemmingType"/>
 *         <element name="avleverendeKomponentKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mottakendeKomponentKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="underkomponentKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nokkelFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nokkelTom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tidspunktAvstemmingTom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="avleverendeAvstemmingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="brukerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Aksjonsdata", propOrder = {
    "aksjonType",
    "kildeType",
    "avstemmingType",
    "avleverendeKomponentKode",
    "mottakendeKomponentKode",
    "underkomponentKode",
    "nokkelFom",
    "nokkelTom",
    "tidspunktAvstemmingTom",
    "avleverendeAvstemmingId",
    "brukerId"
})
public class Aksjonsdata {

    /**
     * Aksjonskoden settes til ’START’ når avstemmingen starter og ’AVSL’ når alle avstemmingsdata er overført. Aksjonskode ’DATA’ benyttes når selve avstemmingsdatene skal overføres. Aksjonskode ’HENT’ benyttes dersom mottakende komponent har behov for å finne avstemminger som er påbegynt fra avleverende komponent, men mangler data fra mottakende komponent.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AksjonType aksjonType;
    /**
     * Skal ha verdien ’AVLEV’ når en no.nav.virksomhet.tjenester.avstemming initieres fra avleverende komponent og ’MOTT’ når det er mottakende komponent som skal overføre sine data.
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected KildeType kildeType;
    /**
     * identifiserer hvilken type no.nav.virksomhet.tjenester.avstemming det gjelder
     * 
     */
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AvstemmingType avstemmingType;
    /**
     * Identifiserer avleverende komponent av dataene som skal avstemmes
     * 
     */
    protected String avleverendeKomponentKode;
    /**
     * Identifiserer mottakende komponent av dataene som skal avstemmes
     * 
     */
    @XmlElement(required = true)
    protected String mottakendeKomponentKode;
    /**
     * f.eks. hvilket fagområde som skal avstemmes
     * 
     */
    protected String underkomponentKode;
    /**
     * Identifikasjon av data som skal grensesnittavstemmes
     * 
     */
    protected String nokkelFom;
    /**
     * Identifikasjon av data som skal grensesnittavstemmes
     * 
     */
    protected String nokkelTom;
    /**
     * Angir høyeste tidspunkt for transaksjoner som skal inngå i konsistensavstemming (format: åååå-mm-dd-hh.mm.ss.nnnnnn)
     * 
     */
    protected String tidspunktAvstemmingTom;
    /**
     * Avleverende systems unike avstemmings-id
     * 
     */
    protected String avleverendeAvstemmingId;
    /**
     * saksbehandler
     * 
     */
    @XmlElement(required = true)
    protected String brukerId;

    /**
     * Aksjonskoden settes til ’START’ når avstemmingen starter og ’AVSL’ når alle avstemmingsdata er overført. Aksjonskode ’DATA’ benyttes når selve avstemmingsdatene skal overføres. Aksjonskode ’HENT’ benyttes dersom mottakende komponent har behov for å finne avstemminger som er påbegynt fra avleverende komponent, men mangler data fra mottakende komponent.
     * 
     * @return
     *     possible object is
     *     {@link AksjonType }
     *     
     */
    public AksjonType getAksjonType() {
        return aksjonType;
    }

    /**
     * Sets the value of the aksjonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AksjonType }
     *     
     * @see #getAksjonType()
     */
    public void setAksjonType(AksjonType value) {
        this.aksjonType = value;
    }

    /**
     * Skal ha verdien ’AVLEV’ når en no.nav.virksomhet.tjenester.avstemming initieres fra avleverende komponent og ’MOTT’ når det er mottakende komponent som skal overføre sine data.
     * 
     * @return
     *     possible object is
     *     {@link KildeType }
     *     
     */
    public KildeType getKildeType() {
        return kildeType;
    }

    /**
     * Sets the value of the kildeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link KildeType }
     *     
     * @see #getKildeType()
     */
    public void setKildeType(KildeType value) {
        this.kildeType = value;
    }

    /**
     * identifiserer hvilken type no.nav.virksomhet.tjenester.avstemming det gjelder
     * 
     * @return
     *     possible object is
     *     {@link AvstemmingType }
     *     
     */
    public AvstemmingType getAvstemmingType() {
        return avstemmingType;
    }

    /**
     * Sets the value of the avstemmingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvstemmingType }
     *     
     * @see #getAvstemmingType()
     */
    public void setAvstemmingType(AvstemmingType value) {
        this.avstemmingType = value;
    }

    /**
     * Identifiserer avleverende komponent av dataene som skal avstemmes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvleverendeKomponentKode() {
        return avleverendeKomponentKode;
    }

    /**
     * Sets the value of the avleverendeKomponentKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvleverendeKomponentKode()
     */
    public void setAvleverendeKomponentKode(String value) {
        this.avleverendeKomponentKode = value;
    }

    /**
     * Identifiserer mottakende komponent av dataene som skal avstemmes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMottakendeKomponentKode() {
        return mottakendeKomponentKode;
    }

    /**
     * Sets the value of the mottakendeKomponentKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getMottakendeKomponentKode()
     */
    public void setMottakendeKomponentKode(String value) {
        this.mottakendeKomponentKode = value;
    }

    /**
     * f.eks. hvilket fagområde som skal avstemmes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderkomponentKode() {
        return underkomponentKode;
    }

    /**
     * Sets the value of the underkomponentKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUnderkomponentKode()
     */
    public void setUnderkomponentKode(String value) {
        this.underkomponentKode = value;
    }

    /**
     * Identifikasjon av data som skal grensesnittavstemmes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokkelFom() {
        return nokkelFom;
    }

    /**
     * Sets the value of the nokkelFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNokkelFom()
     */
    public void setNokkelFom(String value) {
        this.nokkelFom = value;
    }

    /**
     * Identifikasjon av data som skal grensesnittavstemmes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNokkelTom() {
        return nokkelTom;
    }

    /**
     * Sets the value of the nokkelTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getNokkelTom()
     */
    public void setNokkelTom(String value) {
        this.nokkelTom = value;
    }

    /**
     * Angir høyeste tidspunkt for transaksjoner som skal inngå i konsistensavstemming (format: åååå-mm-dd-hh.mm.ss.nnnnnn)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspunktAvstemmingTom() {
        return tidspunktAvstemmingTom;
    }

    /**
     * Sets the value of the tidspunktAvstemmingTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getTidspunktAvstemmingTom()
     */
    public void setTidspunktAvstemmingTom(String value) {
        this.tidspunktAvstemmingTom = value;
    }

    /**
     * Avleverende systems unike avstemmings-id
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvleverendeAvstemmingId() {
        return avleverendeAvstemmingId;
    }

    /**
     * Sets the value of the avleverendeAvstemmingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvleverendeAvstemmingId()
     */
    public void setAvleverendeAvstemmingId(String value) {
        this.avleverendeAvstemmingId = value;
    }

    /**
     * saksbehandler
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukerId() {
        return brukerId;
    }

    /**
     * Sets the value of the brukerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrukerId()
     */
    public void setBrukerId(String value) {
        this.brukerId = value;
    }

}
