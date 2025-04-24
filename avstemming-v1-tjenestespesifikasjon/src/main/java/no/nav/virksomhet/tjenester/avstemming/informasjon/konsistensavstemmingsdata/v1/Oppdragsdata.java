
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Oppdragsdata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Oppdragsdata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fagomradeKode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="fagsystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="oppdragId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="utbetalingsfrekvens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="forfallsdato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="stonadId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oppdragGjelderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oppdragGjelderFom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="saksbehandlerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="oppdragsenhetListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Enhet" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="belopsgrenseListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Belopsgrense" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="tekstListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Tekst" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="oppdragslinjeListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Oppdragslinje" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="bilagstype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oppdragsdata", propOrder = {
    "fagomradeKode",
    "fagsystemId",
    "oppdragId",
    "utbetalingsfrekvens",
    "forfallsdato",
    "stonadId",
    "oppdragGjelderId",
    "oppdragGjelderFom",
    "saksbehandlerId",
    "oppdragsenhetListe",
    "belopsgrenseListe",
    "tekstListe",
    "oppdragslinjeListe",
    "bilagstype"
})
public class Oppdragsdata {

    /**
     * Fagområdekoden identifiserer fagområdet og eventuelle underområder innenfor dette. Fagområdets kode i Oppdragssystemet.
     * 
     */
    @XmlElement(required = true)
    protected String fagomradeKode;
    /**
     * Fagsystemets id av stønaden/oppdraget
     * 
     */
    @XmlElement(required = true)
    protected String fagsystemId;
    /**
     * Oppdragsbasens id av oppdraget
     * 
     */
    protected String oppdragId;
    /**
     * Utbetalingsfrekvens angir med hvilken frekvens oppdraget skal beregnes/utbetales
     * 
     */
    protected String utbetalingsfrekvens;
    /**
     * Forfallsdato, spesifikt for oppdraget . Format åååå-mm-dd
     * 
     */
    protected String forfallsdato;
    /**
     * Stønadens identifikator (eks. startdato)
     * 
     */
    protected String stonadId;
    /**
     * Vanligvis stønadsmottager
     * 
     */
    protected String oppdragGjelderId;
    /**
     * Dato fra når fnr/orgnr gjelder fra. Format åååå-mm-dd
     * 
     */
    protected String oppdragGjelderFom;
    /**
     * Saksbehandler
     * 
     */
    protected String saksbehandlerId;
    /**
     * Liste av kompleks type Oppdragsenhet
     * 
     */
    protected List<Enhet> oppdragsenhetListe;
    /**
     * Liste av kompleks type Belopsgrense
     * 
     */
    protected List<Belopsgrense> belopsgrenseListe;
    /**
     * Liste av kompleks type Tekst
     * 
     */
    protected List<Tekst> tekstListe;
    /**
     * Liste av kompleks type Oppdragslinje
     * 
     */
    protected List<Oppdragslinje> oppdragslinjeListe;
    /**
     *  113/O13
     * 
     */
    protected String bilagstype;

    /**
     * Fagområdekoden identifiserer fagområdet og eventuelle underområder innenfor dette. Fagområdets kode i Oppdragssystemet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagomradeKode() {
        return fagomradeKode;
    }

    /**
     * Sets the value of the fagomradeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFagomradeKode()
     */
    public void setFagomradeKode(String value) {
        this.fagomradeKode = value;
    }

    /**
     * Fagsystemets id av stønaden/oppdraget
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagsystemId() {
        return fagsystemId;
    }

    /**
     * Sets the value of the fagsystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getFagsystemId()
     */
    public void setFagsystemId(String value) {
        this.fagsystemId = value;
    }

    /**
     * Oppdragsbasens id av oppdraget
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdragId() {
        return oppdragId;
    }

    /**
     * Sets the value of the oppdragId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOppdragId()
     */
    public void setOppdragId(String value) {
        this.oppdragId = value;
    }

    /**
     * Utbetalingsfrekvens angir med hvilken frekvens oppdraget skal beregnes/utbetales
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetalingsfrekvens() {
        return utbetalingsfrekvens;
    }

    /**
     * Sets the value of the utbetalingsfrekvens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getUtbetalingsfrekvens()
     */
    public void setUtbetalingsfrekvens(String value) {
        this.utbetalingsfrekvens = value;
    }

    /**
     * Forfallsdato, spesifikt for oppdraget . Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfallsdato() {
        return forfallsdato;
    }

    /**
     * Sets the value of the forfallsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getForfallsdato()
     */
    public void setForfallsdato(String value) {
        this.forfallsdato = value;
    }

    /**
     * Stønadens identifikator (eks. startdato)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStonadId() {
        return stonadId;
    }

    /**
     * Sets the value of the stonadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getStonadId()
     */
    public void setStonadId(String value) {
        this.stonadId = value;
    }

    /**
     * Vanligvis stønadsmottager
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdragGjelderId() {
        return oppdragGjelderId;
    }

    /**
     * Sets the value of the oppdragGjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOppdragGjelderId()
     */
    public void setOppdragGjelderId(String value) {
        this.oppdragGjelderId = value;
    }

    /**
     * Dato fra når fnr/orgnr gjelder fra. Format åååå-mm-dd
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdragGjelderFom() {
        return oppdragGjelderFom;
    }

    /**
     * Sets the value of the oppdragGjelderFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getOppdragGjelderFom()
     */
    public void setOppdragGjelderFom(String value) {
        this.oppdragGjelderFom = value;
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
     * Liste av kompleks type Oppdragsenhet
     * 
     * Gets the value of the oppdragsenhetListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragsenhetListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOppdragsenhetListe().add(newItem);
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
     *     The value of the oppdragsenhetListe property.
     */
    public List<Enhet> getOppdragsenhetListe() {
        if (oppdragsenhetListe == null) {
            oppdragsenhetListe = new ArrayList<>();
        }
        return this.oppdragsenhetListe;
    }

    /**
     * Liste av kompleks type Belopsgrense
     * 
     * Gets the value of the belopsgrenseListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the belopsgrenseListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBelopsgrenseListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Belopsgrense }
     * </p>
     * 
     * 
     * @return
     *     The value of the belopsgrenseListe property.
     */
    public List<Belopsgrense> getBelopsgrenseListe() {
        if (belopsgrenseListe == null) {
            belopsgrenseListe = new ArrayList<>();
        }
        return this.belopsgrenseListe;
    }

    /**
     * Liste av kompleks type Tekst
     * 
     * Gets the value of the tekstListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tekstListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTekstListe().add(newItem);
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
     *     The value of the tekstListe property.
     */
    public List<Tekst> getTekstListe() {
        if (tekstListe == null) {
            tekstListe = new ArrayList<>();
        }
        return this.tekstListe;
    }

    /**
     * Liste av kompleks type Oppdragslinje
     * 
     * Gets the value of the oppdragslinjeListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragslinjeListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOppdragslinjeListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oppdragslinje }
     * </p>
     * 
     * 
     * @return
     *     The value of the oppdragslinjeListe property.
     */
    public List<Oppdragslinje> getOppdragslinjeListe() {
        if (oppdragslinjeListe == null) {
            oppdragslinjeListe = new ArrayList<>();
        }
        return this.oppdragslinjeListe;
    }

    /**
     *  113/O13
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilagstype() {
        return bilagstype;
    }

    /**
     * Sets the value of the bilagstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getBilagstype()
     */
    public void setBilagstype(String value) {
        this.bilagstype = value;
    }

}
