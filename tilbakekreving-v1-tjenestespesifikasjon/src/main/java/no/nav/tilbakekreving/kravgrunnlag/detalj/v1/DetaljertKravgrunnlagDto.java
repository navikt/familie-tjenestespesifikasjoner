
package no.nav.tilbakekreving.kravgrunnlag.detalj.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import no.nav.tilbakekreving.typer.v1.JaNeiDto;
import no.nav.tilbakekreving.typer.v1.TypeGjelderDto;


/**
 *  431 - Detaljert kravgrunnlag
 * 
 * <p>Java class for DetaljertKravgrunnlagDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetaljertKravgrunnlagDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kravgrunnlagId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="vedtakId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="kodeStatusKrav" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kodeFagomraade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fagsystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datoVedtakFagsystem" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="vedtakIdOmgjort" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="vedtakGjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto"/>
 *         &lt;element name="typeGjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto"/>
 *         &lt;element name="utbetalesTilId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto"/>
 *         &lt;element name="typeUtbetId" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto"/>
 *         &lt;element name="kodeHjemmel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renterBeregnes" type="{urn:no:nav:tilbakekreving:typer:v1}JaNeiDto" minOccurs="0"/>
 *         &lt;element name="enhetAnsvarlig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enhetBosted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enhetBehandl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kontrollfelt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saksbehId" type="{urn:no:nav:tilbakekreving:typer:v1}SaksbehandlerDto"/>
 *         &lt;element name="referanse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tilbakekrevingsPeriode" type="{urn:no:nav:tilbakekreving:kravgrunnlag:detalj:v1}DetaljertKravgrunnlagPeriodeDto" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetaljertKravgrunnlagDto", propOrder = {
    "kravgrunnlagId",
    "vedtakId",
    "kodeStatusKrav",
    "kodeFagomraade",
    "fagsystemId",
    "datoVedtakFagsystem",
    "vedtakIdOmgjort",
    "vedtakGjelderId",
    "typeGjelderId",
    "utbetalesTilId",
    "typeUtbetId",
    "kodeHjemmel",
    "renterBeregnes",
    "enhetAnsvarlig",
    "enhetBosted",
    "enhetBehandl",
    "kontrollfelt",
    "saksbehId",
    "referanse",
    "tilbakekrevingsPeriode"
})
public class DetaljertKravgrunnlagDto {

    @XmlElement(required = true)
    protected BigInteger kravgrunnlagId;
    @XmlElement(required = true)
    protected BigInteger vedtakId;
    @XmlElement(required = true)
    protected String kodeStatusKrav;
    @XmlElement(required = true)
    protected String kodeFagomraade;
    @XmlElement(required = true)
    protected String fagsystemId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoVedtakFagsystem;
    protected BigInteger vedtakIdOmgjort;
    @XmlElement(required = true)
    protected String vedtakGjelderId;
    @XmlElement(required = true)
    protected TypeGjelderDto typeGjelderId;
    @XmlElement(required = true)
    protected String utbetalesTilId;
    @XmlElement(required = true)
    protected TypeGjelderDto typeUtbetId;
    protected String kodeHjemmel;
    protected JaNeiDto renterBeregnes;
    @XmlElement(required = true)
    protected String enhetAnsvarlig;
    @XmlElement(required = true)
    protected String enhetBosted;
    @XmlElement(required = true)
    protected String enhetBehandl;
    @XmlElement(required = true)
    protected String kontrollfelt;
    @XmlElement(required = true)
    protected String saksbehId;
    protected String referanse;
    @XmlElement(required = true)
    protected List<DetaljertKravgrunnlagPeriodeDto> tilbakekrevingsPeriode;

    /**
     * Gets the value of the kravgrunnlagId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKravgrunnlagId() {
        return kravgrunnlagId;
    }

    /**
     * Sets the value of the kravgrunnlagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKravgrunnlagId(BigInteger value) {
        this.kravgrunnlagId = value;
    }

    /**
     * Gets the value of the vedtakId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVedtakId() {
        return vedtakId;
    }

    /**
     * Sets the value of the vedtakId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVedtakId(BigInteger value) {
        this.vedtakId = value;
    }

    /**
     * Gets the value of the kodeStatusKrav property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeStatusKrav() {
        return kodeStatusKrav;
    }

    /**
     * Sets the value of the kodeStatusKrav property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeStatusKrav(String value) {
        this.kodeStatusKrav = value;
    }

    /**
     * Gets the value of the kodeFagomraade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeFagomraade() {
        return kodeFagomraade;
    }

    /**
     * Sets the value of the kodeFagomraade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeFagomraade(String value) {
        this.kodeFagomraade = value;
    }

    /**
     * Gets the value of the fagsystemId property.
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
     */
    public void setFagsystemId(String value) {
        this.fagsystemId = value;
    }

    /**
     * Gets the value of the datoVedtakFagsystem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoVedtakFagsystem() {
        return datoVedtakFagsystem;
    }

    /**
     * Sets the value of the datoVedtakFagsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoVedtakFagsystem(XMLGregorianCalendar value) {
        this.datoVedtakFagsystem = value;
    }

    /**
     * Gets the value of the vedtakIdOmgjort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVedtakIdOmgjort() {
        return vedtakIdOmgjort;
    }

    /**
     * Sets the value of the vedtakIdOmgjort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVedtakIdOmgjort(BigInteger value) {
        this.vedtakIdOmgjort = value;
    }

    /**
     * Gets the value of the vedtakGjelderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVedtakGjelderId() {
        return vedtakGjelderId;
    }

    /**
     * Sets the value of the vedtakGjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVedtakGjelderId(String value) {
        this.vedtakGjelderId = value;
    }

    /**
     * Gets the value of the typeGjelderId property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGjelderDto }
     *     
     */
    public TypeGjelderDto getTypeGjelderId() {
        return typeGjelderId;
    }

    /**
     * Sets the value of the typeGjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGjelderDto }
     *     
     */
    public void setTypeGjelderId(TypeGjelderDto value) {
        this.typeGjelderId = value;
    }

    /**
     * Gets the value of the utbetalesTilId property.
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
     */
    public void setUtbetalesTilId(String value) {
        this.utbetalesTilId = value;
    }

    /**
     * Gets the value of the typeUtbetId property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGjelderDto }
     *     
     */
    public TypeGjelderDto getTypeUtbetId() {
        return typeUtbetId;
    }

    /**
     * Sets the value of the typeUtbetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGjelderDto }
     *     
     */
    public void setTypeUtbetId(TypeGjelderDto value) {
        this.typeUtbetId = value;
    }

    /**
     * Gets the value of the kodeHjemmel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeHjemmel() {
        return kodeHjemmel;
    }

    /**
     * Sets the value of the kodeHjemmel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeHjemmel(String value) {
        this.kodeHjemmel = value;
    }

    /**
     * Gets the value of the renterBeregnes property.
     * 
     * @return
     *     possible object is
     *     {@link JaNeiDto }
     *     
     */
    public JaNeiDto getRenterBeregnes() {
        return renterBeregnes;
    }

    /**
     * Sets the value of the renterBeregnes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaNeiDto }
     *     
     */
    public void setRenterBeregnes(JaNeiDto value) {
        this.renterBeregnes = value;
    }

    /**
     * Gets the value of the enhetAnsvarlig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetAnsvarlig() {
        return enhetAnsvarlig;
    }

    /**
     * Sets the value of the enhetAnsvarlig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhetAnsvarlig(String value) {
        this.enhetAnsvarlig = value;
    }

    /**
     * Gets the value of the enhetBosted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetBosted() {
        return enhetBosted;
    }

    /**
     * Sets the value of the enhetBosted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhetBosted(String value) {
        this.enhetBosted = value;
    }

    /**
     * Gets the value of the enhetBehandl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhetBehandl() {
        return enhetBehandl;
    }

    /**
     * Sets the value of the enhetBehandl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhetBehandl(String value) {
        this.enhetBehandl = value;
    }

    /**
     * Gets the value of the kontrollfelt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontrollfelt() {
        return kontrollfelt;
    }

    /**
     * Sets the value of the kontrollfelt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontrollfelt(String value) {
        this.kontrollfelt = value;
    }

    /**
     * Gets the value of the saksbehId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksbehId() {
        return saksbehId;
    }

    /**
     * Sets the value of the saksbehId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksbehId(String value) {
        this.saksbehId = value;
    }

    /**
     * Gets the value of the referanse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferanse() {
        return referanse;
    }

    /**
     * Sets the value of the referanse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferanse(String value) {
        this.referanse = value;
    }

    /**
     * Gets the value of the tilbakekrevingsPeriode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilbakekrevingsPeriode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilbakekrevingsPeriode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetaljertKravgrunnlagPeriodeDto }
     * 
     * 
     */
    public List<DetaljertKravgrunnlagPeriodeDto> getTilbakekrevingsPeriode() {
        if (tilbakekrevingsPeriode == null) {
            tilbakekrevingsPeriode = new ArrayList<DetaljertKravgrunnlagPeriodeDto>();
        }
        return this.tilbakekrevingsPeriode;
    }

}
