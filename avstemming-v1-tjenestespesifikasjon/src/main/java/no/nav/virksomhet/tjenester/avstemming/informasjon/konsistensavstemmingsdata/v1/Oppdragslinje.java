
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Oppdragslinje complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Oppdragslinje">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="vedtakId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="delytelseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="linjeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="klassifikasjonKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="klassifkasjonFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vedtakPeriode" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Periode" minOccurs="0"/>
 *         <element name="sats" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="satstypeKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fradragTillegg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="skyldnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="skyldnerFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kravhaverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kravhaverFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kundeidentifikasjon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="kundeidentifikasjonFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="brukKjoreplan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="saksbehandlerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="utbetalesTilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="utbetalesFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="arbeidsgiverKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="henvisning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="soknadsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refFagsystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refOppdragId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refDelytelseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refLinjeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="linjetekstListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Tekst" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="linjeenhetListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Enhet" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="gradListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Grad" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="attestantListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Attestant" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="valutaListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Valuta" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oppdragslinje", propOrder = {
    "vedtakId",
    "delytelseId",
    "linjeId",
    "klassifikasjonKode",
    "klassifkasjonFom",
    "vedtakPeriode",
    "sats",
    "satstypeKode",
    "fradragTillegg",
    "skyldnerId",
    "skyldnerFom",
    "kravhaverId",
    "kravhaverFom",
    "kundeidentifikasjon",
    "kundeidentifikasjonFom",
    "brukKjoreplan",
    "saksbehandlerId",
    "utbetalesTilId",
    "utbetalesFom",
    "arbeidsgiverKode",
    "henvisning",
    "soknadsType",
    "refFagsystemId",
    "refOppdragId",
    "refDelytelseId",
    "refLinjeId",
    "linjetekstListe",
    "linjeenhetListe",
    "gradListe",
    "attestantListe",
    "valutaListe"
})
public class Oppdragslinje {

    /**
     * Fagsystemets id av vedtaket
     * 
     */
    protected String vedtakId;
    /**
     * Fagsystemets id av delytelsen
     * 
     */
    protected String delytelseId;
    /**
     * Oppdragsbasens id av oppdragslinjen
     * 
     */
    protected String linjeId;
    /**
     * Klassifisering (stønadsklasse, inkl ferie)
     * 
     */
    protected String klassifikasjonKode;
    /**
     * Fra-og-med dato på klassifiseringen. Format åååå-mm-dd
     * 
     */
    protected String klassifkasjonFom;
    /**
     * Fra-og-med dato / til-og-med dato på vedtaket/utbetalingen
     * 
     */
    protected Periode vedtakPeriode;
    /**
     * Satsen
     * 
     */
    protected BigDecimal sats;
    /**
     * Satstype (engangs, dag, uke, 14-dag, mnd, år)
     * 
     */
    protected String satstypeKode;
    /**
     * Betinget påkrevd:  F eller T. Må kun fylles ut hvis sats finnes
     * 
     */
    protected String fradragTillegg;
    /**
     * Skyldner (fnr/orgnr), default er behandlende enhets orgnr
     * 
     */
    protected String skyldnerId;
    /**
     * Fra-og-med dato på skyldner. Format åååå-mm-dd
     * 
     */
    protected String skyldnerFom;
    /**
     * Hvem kravet gjelder
     * 
     */
    protected String kravhaverId;
    /**
     * Fra-og-med dato på kravhaver.  Format åååå-mm-dd
     * 
     */
    protected String kravhaverFom;
    /**
     * kid
     * 
     */
    protected String kundeidentifikasjon;
    /**
     * fra om med når KID. Format åååå-mm-dd
     * 
     */
    protected String kundeidentifikasjonFom;
    /**
     * Anngir om utbetalingen skal skje i dag eller i henhold til kjøreplan
     * 
     */
    protected String brukKjoreplan;
    /**
     * Saksbehandler
     * 
     */
    protected String saksbehandlerId;
    /**
     * Utbetalingsmottaker (fnr/orgnr)
     * 
     */
    protected String utbetalesTilId;
    /**
     * Fra-og-med dato på utbetalingen.  Format åååå-mm-dd
     * 
     */
    protected String utbetalesFom;
    /**
     * (Kodeverk som er benyttet av Sykepenger rutina)
     * 
     */
    protected String arbeidsgiverKode;
    /**
     * Henvisning til grunndokumentasjon (legitimering av kostnad)
     * 
     */
    protected String henvisning;
    /**
     * Årsaken til at vedtaket ble fattet.
     * 
     */
    protected String soknadsType;
    /**
     * Fagsystemets id av vedtaket som endres
     * 
     */
    protected String refFagsystemId;
    /**
     * Oppdragsbasens id av vedtaket som endres
     * 
     */
    protected String refOppdragId;
    /**
     * Id av delytelsen som endres (fagsystemets)
     * 
     */
    protected String refDelytelseId;
    /**
     * Oppdragsbasens id av delytelsen som endres.
     * 
     */
    protected String refLinjeId;
    /**
     * Liste av kompleks type Linjetekst
     * 
     */
    protected List<Tekst> linjetekstListe;
    /**
     * Liste av kompleks type Linjeenhet
     * 
     */
    protected List<Enhet> linjeenhetListe;
    /**
     * Liste av kompleks type Grad
     * 
     */
    protected List<Grad> gradListe;
    /**
     * Liste av kompleks type Attestant
     * 
     */
    protected List<Attestant> attestantListe;
    /**
     * Liste av kompleks type Valuta
     * 
     */
    protected List<Valuta> valutaListe;

    /**
     * Fagsystemets id av vedtaket
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVedtakId() {
        return vedtakId;
    }

    /**
     * Sets the value of the vedtakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getVedtakId()
     */
    public void setVedtakId(String value) {
        this.vedtakId = value;
    }

    /**
     * Fagsystemets id av delytelsen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelytelseId() {
        return delytelseId;
    }

    /**
     * Sets the value of the delytelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDelytelseId()
     */
    public void setDelytelseId(String value) {
        this.delytelseId = value;
    }

    /**
     * Oppdragsbasens id av oppdragslinjen
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinjeId() {
        return linjeId;
    }

    /**
     * Sets the value of the linjeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getLinjeId()
     */
    public void setLinjeId(String value) {
        this.linjeId = value;
    }

    /**
     * Klassifisering (stønadsklasse, inkl ferie)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlassifikasjonKode() {
        return klassifikasjonKode;
    }

    /**
     * Sets the value of the klassifikasjonKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKlassifikasjonKode()
     */
    public void setKlassifikasjonKode(String value) {
        this.klassifikasjonKode = value;
    }

    /**
     * Fra-og-med dato på klassifiseringen. Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlassifkasjonFom() {
        return klassifkasjonFom;
    }

    /**
     * Sets the value of the klassifkasjonFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKlassifkasjonFom()
     */
    public void setKlassifkasjonFom(String value) {
        this.klassifkasjonFom = value;
    }

    /**
     * Fra-og-med dato / til-og-med dato på vedtaket/utbetalingen
     * 
     * @return
     *     possible object is
     *     {@link Periode }
     *     
     */
    public Periode getVedtakPeriode() {
        return vedtakPeriode;
    }

    /**
     * Sets the value of the vedtakPeriode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periode }
     *     
     * @see #getVedtakPeriode()
     */
    public void setVedtakPeriode(Periode value) {
        this.vedtakPeriode = value;
    }

    /**
     * Satsen
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSats() {
        return sats;
    }

    /**
     * Sets the value of the sats property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getSats()
     */
    public void setSats(BigDecimal value) {
        this.sats = value;
    }

    /**
     * Satstype (engangs, dag, uke, 14-dag, mnd, år)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSatstypeKode() {
        return satstypeKode;
    }

    /**
     * Sets the value of the satstypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSatstypeKode()
     */
    public void setSatstypeKode(String value) {
        this.satstypeKode = value;
    }

    /**
     * Betinget påkrevd:  F eller T. Må kun fylles ut hvis sats finnes
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFradragTillegg() {
        return fradragTillegg;
    }

    /**
     * Sets the value of the fradragTillegg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFradragTillegg()
     */
    public void setFradragTillegg(String value) {
        this.fradragTillegg = value;
    }

    /**
     * Skyldner (fnr/orgnr), default er behandlende enhets orgnr
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkyldnerId() {
        return skyldnerId;
    }

    /**
     * Sets the value of the skyldnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSkyldnerId()
     */
    public void setSkyldnerId(String value) {
        this.skyldnerId = value;
    }

    /**
     * Fra-og-med dato på skyldner. Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkyldnerFom() {
        return skyldnerFom;
    }

    /**
     * Sets the value of the skyldnerFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSkyldnerFom()
     */
    public void setSkyldnerFom(String value) {
        this.skyldnerFom = value;
    }

    /**
     * Hvem kravet gjelder
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKravhaverId() {
        return kravhaverId;
    }

    /**
     * Sets the value of the kravhaverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKravhaverId()
     */
    public void setKravhaverId(String value) {
        this.kravhaverId = value;
    }

    /**
     * Fra-og-med dato på kravhaver.  Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKravhaverFom() {
        return kravhaverFom;
    }

    /**
     * Sets the value of the kravhaverFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKravhaverFom()
     */
    public void setKravhaverFom(String value) {
        this.kravhaverFom = value;
    }

    /**
     * kid
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKundeidentifikasjon() {
        return kundeidentifikasjon;
    }

    /**
     * Sets the value of the kundeidentifikasjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKundeidentifikasjon()
     */
    public void setKundeidentifikasjon(String value) {
        this.kundeidentifikasjon = value;
    }

    /**
     * fra om med når KID. Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKundeidentifikasjonFom() {
        return kundeidentifikasjonFom;
    }

    /**
     * Sets the value of the kundeidentifikasjonFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getKundeidentifikasjonFom()
     */
    public void setKundeidentifikasjonFom(String value) {
        this.kundeidentifikasjonFom = value;
    }

    /**
     * Anngir om utbetalingen skal skje i dag eller i henhold til kjøreplan
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrukKjoreplan() {
        return brukKjoreplan;
    }

    /**
     * Sets the value of the brukKjoreplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBrukKjoreplan()
     */
    public void setBrukKjoreplan(String value) {
        this.brukKjoreplan = value;
    }

    /**
     * Saksbehandler
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksbehandlerId() {
        return saksbehandlerId;
    }

    /**
     * Sets the value of the saksbehandlerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSaksbehandlerId()
     */
    public void setSaksbehandlerId(String value) {
        this.saksbehandlerId = value;
    }

    /**
     * Utbetalingsmottaker (fnr/orgnr)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetalesTilId() {
        return utbetalesTilId;
    }

    /**
     * Sets the value of the utbetalesTilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUtbetalesTilId()
     */
    public void setUtbetalesTilId(String value) {
        this.utbetalesTilId = value;
    }

    /**
     * Fra-og-med dato på utbetalingen.  Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetalesFom() {
        return utbetalesFom;
    }

    /**
     * Sets the value of the utbetalesFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUtbetalesFom()
     */
    public void setUtbetalesFom(String value) {
        this.utbetalesFom = value;
    }

    /**
     * (Kodeverk som er benyttet av Sykepenger rutina)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeidsgiverKode() {
        return arbeidsgiverKode;
    }

    /**
     * Sets the value of the arbeidsgiverKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getArbeidsgiverKode()
     */
    public void setArbeidsgiverKode(String value) {
        this.arbeidsgiverKode = value;
    }

    /**
     * Henvisning til grunndokumentasjon (legitimering av kostnad)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHenvisning() {
        return henvisning;
    }

    /**
     * Sets the value of the henvisning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getHenvisning()
     */
    public void setHenvisning(String value) {
        this.henvisning = value;
    }

    /**
     * Årsaken til at vedtaket ble fattet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoknadsType() {
        return soknadsType;
    }

    /**
     * Sets the value of the soknadsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getSoknadsType()
     */
    public void setSoknadsType(String value) {
        this.soknadsType = value;
    }

    /**
     * Fagsystemets id av vedtaket som endres
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefFagsystemId() {
        return refFagsystemId;
    }

    /**
     * Sets the value of the refFagsystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefFagsystemId()
     */
    public void setRefFagsystemId(String value) {
        this.refFagsystemId = value;
    }

    /**
     * Oppdragsbasens id av vedtaket som endres
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOppdragId() {
        return refOppdragId;
    }

    /**
     * Sets the value of the refOppdragId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefOppdragId()
     */
    public void setRefOppdragId(String value) {
        this.refOppdragId = value;
    }

    /**
     * Id av delytelsen som endres (fagsystemets)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefDelytelseId() {
        return refDelytelseId;
    }

    /**
     * Sets the value of the refDelytelseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefDelytelseId()
     */
    public void setRefDelytelseId(String value) {
        this.refDelytelseId = value;
    }

    /**
     * Oppdragsbasens id av delytelsen som endres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefLinjeId() {
        return refLinjeId;
    }

    /**
     * Sets the value of the refLinjeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getRefLinjeId()
     */
    public void setRefLinjeId(String value) {
        this.refLinjeId = value;
    }

    /**
     * Liste av kompleks type Linjetekst
     * 
     * Gets the value of the linjetekstListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linjetekstListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinjetekstListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tekst }
     * </p>
     * 
     * 
     * @return
     *     The value of the linjetekstListe property.
     */
    public List<Tekst> getLinjetekstListe() {
        if (linjetekstListe == null) {
            linjetekstListe = new ArrayList<>();
        }
        return this.linjetekstListe;
    }

    /**
     * Liste av kompleks type Linjeenhet
     * 
     * Gets the value of the linjeenhetListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linjeenhetListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLinjeenhetListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enhet }
     * </p>
     * 
     * 
     * @return
     *     The value of the linjeenhetListe property.
     */
    public List<Enhet> getLinjeenhetListe() {
        if (linjeenhetListe == null) {
            linjeenhetListe = new ArrayList<>();
        }
        return this.linjeenhetListe;
    }

    /**
     * Liste av kompleks type Grad
     * 
     * Gets the value of the gradListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gradListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGradListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grad }
     * </p>
     * 
     * 
     * @return
     *     The value of the gradListe property.
     */
    public List<Grad> getGradListe() {
        if (gradListe == null) {
            gradListe = new ArrayList<>();
        }
        return this.gradListe;
    }

    /**
     * Liste av kompleks type Attestant
     * 
     * Gets the value of the attestantListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attestantListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAttestantListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attestant }
     * </p>
     * 
     * 
     * @return
     *     The value of the attestantListe property.
     */
    public List<Attestant> getAttestantListe() {
        if (attestantListe == null) {
            attestantListe = new ArrayList<>();
        }
        return this.attestantListe;
    }

    /**
     * Liste av kompleks type Valuta
     * 
     * Gets the value of the valutaListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valutaListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValutaListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Valuta }
     * </p>
     * 
     * 
     * @return
     *     The value of the valutaListe property.
     */
    public List<Valuta> getValutaListe() {
        if (valutaListe == null) {
            valutaListe = new ArrayList<>();
        }
        return this.valutaListe;
    }

}
