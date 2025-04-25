
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         <element name="aksjonsType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="kildeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="avstemmingType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="avleverendeKomponentKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mottakendeKomponentKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="underkomponentKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nokkelFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nokkelTom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="tidspunktAvstemmingTom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="avleverendeAvstemmingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "aksjonsType",
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
    protected String aksjonsType;
    /**
     * Skal ha verdien ’AVLEV’ når en no.nav.virksomhet.tjenester.avstemming initieres fra avleverende komponent og ’MOTT’ når det er mottakende komponent som skal overføre sine data.
     * 
     */
    @XmlElement(required = true)
    protected String kildeType;
    /**
     * identifiserer hvilken type no.nav.virksomhet.tjenester.avstemming det gjelder
     * 
     */
    @XmlElement(required = true)
    protected String avstemmingType;
    /**
     * Identifiserer avleverende komponent av dataene som skal avstemmes, dvs ‘PESYS’ når dataene kommer fra PESYS.
     * 
     */
    @XmlElement(required = true)
    protected String avleverendeKomponentKode;
    /**
     * Identifiserer mottakende komponent av dataene som skal avstemmes, skal verdien være ‘OS’.
     * 
     */
    @XmlElement(required = true)
    protected String mottakendeKomponentKode;
    /**
     * Videre må det sendes med hvilken underkomponent (fagområde) avstemmingen gjelder, f.eks ‘PENAP’. Betinget:  Må fylles ut hvis underkomponenten finnes som egen avstemmingsenhet.
     * 
     */
    protected String underkomponentKode;
    /**
     * Identifikasjon av data som skal grensesnittavstemmes.
     * 
     */
    protected String nokkelFom;
    /**
     * Identifikasjon av data som skal grensesnittavstemmes
     * 
     */
    protected String nokkelTom;
    /**
     * Angir høyeste tidspunkt for transaksjoner som skal inngå i konsistensavstemming (format: åååå-mm-dd-hh.mm.ss.nnnnnn) Betinget: Må sendes i enten START eller AVSL, men ikke for hver Aksjonsdata.
     * 
     */
    protected String tidspunktAvstemmingTom;
    /**
     * Avleverende systems unike avstemmings-id
     * 
     */
    @XmlElement(required = true)
    protected String avleverendeAvstemmingId;
    /**
     * Brukerid må ha en verdi, men dette kan gjerne være noe som identifiserer programmet som genererer dataene (dvs en fast verdi)
     * 
     */
    @XmlElement(required = true)
    protected String brukerId;

    /**
     * Aksjonskoden settes til ’START’ når avstemmingen starter og ’AVSL’ når alle avstemmingsdata er overført. Aksjonskode ’DATA’ benyttes når selve avstemmingsdatene skal overføres. Aksjonskode ’HENT’ benyttes dersom mottakende komponent har behov for å finne avstemminger som er påbegynt fra avleverende komponent, men mangler data fra mottakende komponent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAksjonsType() {
        return aksjonsType;
    }

    /**
     * Sets the value of the aksjonsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAksjonsType()
     */
    public void setAksjonsType(String value) {
        this.aksjonsType = value;
    }

    /**
     * Skal ha verdien ’AVLEV’ når en no.nav.virksomhet.tjenester.avstemming initieres fra avleverende komponent og ’MOTT’ når det er mottakende komponent som skal overføre sine data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKildeType() {
        return kildeType;
    }

    /**
     * Sets the value of the kildeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKildeType()
     */
    public void setKildeType(String value) {
        this.kildeType = value;
    }

    /**
     * identifiserer hvilken type no.nav.virksomhet.tjenester.avstemming det gjelder
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvstemmingType() {
        return avstemmingType;
    }

    /**
     * Sets the value of the avstemmingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getAvstemmingType()
     */
    public void setAvstemmingType(String value) {
        this.avstemmingType = value;
    }

    /**
     * Identifiserer avleverende komponent av dataene som skal avstemmes, dvs ‘PESYS’ når dataene kommer fra PESYS.
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
     * Identifiserer mottakende komponent av dataene som skal avstemmes, skal verdien være ‘OS’.
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
     * Videre må det sendes med hvilken underkomponent (fagområde) avstemmingen gjelder, f.eks ‘PENAP’. Betinget:  Må fylles ut hvis underkomponenten finnes som egen avstemmingsenhet.
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
     * Identifikasjon av data som skal grensesnittavstemmes.
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
     * Angir høyeste tidspunkt for transaksjoner som skal inngå i konsistensavstemming (format: åååå-mm-dd-hh.mm.ss.nnnnnn) Betinget: Må sendes i enten START eller AVSL, men ikke for hver Aksjonsdata.
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
     * Brukerid må ha en verdi, men dette kan gjerne være noe som identifiserer programmet som genererer dataene (dvs en fast verdi)
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
