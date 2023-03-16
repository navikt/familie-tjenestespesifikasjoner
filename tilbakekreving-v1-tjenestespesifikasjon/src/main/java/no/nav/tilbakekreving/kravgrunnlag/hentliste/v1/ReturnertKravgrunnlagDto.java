
package no.nav.tilbakekreving.kravgrunnlag.hentliste.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import no.nav.tilbakekreving.typer.v1.PeriodeDto;
import no.nav.tilbakekreving.typer.v1.TypeGjelderDto;


/**
 *  421 - Returnert kravgrunnlag
 * 
 * <p>Java class for ReturnertKravgrunnlagDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnertKravgrunnlagDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kravgrunnlagId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="kodeStatusKrav" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto"/>
 *         &lt;element name="typeGjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto"/>
 *         &lt;element name="utbetalesTilId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto"/>
 *         &lt;element name="typeUtbetId" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto"/>
 *         &lt;element name="kodeFagomraade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fagsystemId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datoVedtakFagsystem" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="enhetBosted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enhetAnsvarlig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datoKravDannet" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="periode" type="{urn:no:nav:tilbakekreving:typer:v1}PeriodeDto"/>
 *         &lt;element name="belopSumFeilutbetalt" type="{urn:no:nav:tilbakekreving:typer:v1}belop"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnertKravgrunnlagDto", propOrder = {
    "kravgrunnlagId",
    "kodeStatusKrav",
    "gjelderId",
    "typeGjelderId",
    "utbetalesTilId",
    "typeUtbetId",
    "kodeFagomraade",
    "fagsystemId",
    "datoVedtakFagsystem",
    "enhetBosted",
    "enhetAnsvarlig",
    "datoKravDannet",
    "periode",
    "belopSumFeilutbetalt"
})
public class ReturnertKravgrunnlagDto {

    @XmlElement(required = true)
    protected BigInteger kravgrunnlagId;
    @XmlElement(required = true)
    protected String kodeStatusKrav;
    @XmlElement(required = true)
    protected String gjelderId;
    @XmlElement(required = true)
    protected TypeGjelderDto typeGjelderId;
    @XmlElement(required = true)
    protected String utbetalesTilId;
    @XmlElement(required = true)
    protected TypeGjelderDto typeUtbetId;
    @XmlElement(required = true)
    protected String kodeFagomraade;
    @XmlElement(required = true)
    protected String fagsystemId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoVedtakFagsystem;
    @XmlElement(required = true)
    protected String enhetBosted;
    @XmlElement(required = true)
    protected String enhetAnsvarlig;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoKravDannet;
    @XmlElement(required = true)
    protected PeriodeDto periode;
    @XmlElement(required = true)
    protected BigDecimal belopSumFeilutbetalt;

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
     * Gets the value of the gjelderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjelderId() {
        return gjelderId;
    }

    /**
     * Sets the value of the gjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjelderId(String value) {
        this.gjelderId = value;
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
     * Gets the value of the datoKravDannet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoKravDannet() {
        return datoKravDannet;
    }

    /**
     * Sets the value of the datoKravDannet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoKravDannet(XMLGregorianCalendar value) {
        this.datoKravDannet = value;
    }

    /**
     * Gets the value of the periode property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodeDto }
     *     
     */
    public PeriodeDto getPeriode() {
        return periode;
    }

    /**
     * Sets the value of the periode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodeDto }
     *     
     */
    public void setPeriode(PeriodeDto value) {
        this.periode = value;
    }

    /**
     * Gets the value of the belopSumFeilutbetalt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopSumFeilutbetalt() {
        return belopSumFeilutbetalt;
    }

    /**
     * Sets the value of the belopSumFeilutbetalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopSumFeilutbetalt(BigDecimal value) {
        this.belopSumFeilutbetalt = value;
    }

}
