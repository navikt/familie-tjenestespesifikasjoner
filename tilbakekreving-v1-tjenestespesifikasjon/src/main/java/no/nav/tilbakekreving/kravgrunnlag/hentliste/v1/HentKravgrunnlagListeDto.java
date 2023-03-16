
package no.nav.tilbakekreving.kravgrunnlag.hentliste.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.typer.v1.TypeGjelderDto;


/**
 *  420 - Hent kravgrunnlag
 * 
 * <p>Java class for HentKravgrunnlagListeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HentKravgrunnlagListeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeAksjon" type="{urn:no:nav:tilbakekreving:typer:v1}KodeAksjonDto"/>
 *         &lt;element name="gjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto" minOccurs="0"/>
 *         &lt;element name="typeGjelder" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto" minOccurs="0"/>
 *         &lt;element name="utbetalesTilId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto" minOccurs="0"/>
 *         &lt;element name="typeUtbet" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto" minOccurs="0"/>
 *         &lt;element name="enhetAnsvarlig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kodeFaggruppe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeFagomraade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fagsystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kravgrunnlagId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="saksbehId" type="{urn:no:nav:tilbakekreving:typer:v1}SaksbehandlerDto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HentKravgrunnlagListeDto", propOrder = {
    "kodeAksjon",
    "gjelderId",
    "typeGjelder",
    "utbetalesTilId",
    "typeUtbet",
    "enhetAnsvarlig",
    "kodeFaggruppe",
    "kodeFagomraade",
    "fagsystemId",
    "kravgrunnlagId",
    "saksbehId"
})
public class HentKravgrunnlagListeDto {

    @XmlElement(required = true)
    protected String kodeAksjon;
    protected String gjelderId;
    protected TypeGjelderDto typeGjelder;
    protected String utbetalesTilId;
    protected TypeGjelderDto typeUtbet;
    @XmlElement(required = true)
    protected String enhetAnsvarlig;
    protected String kodeFaggruppe;
    protected String kodeFagomraade;
    protected String fagsystemId;
    protected BigInteger kravgrunnlagId;
    @XmlElement(required = true)
    protected String saksbehId;

    /**
     * Gets the value of the kodeAksjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAksjon() {
        return kodeAksjon;
    }

    /**
     * Sets the value of the kodeAksjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAksjon(String value) {
        this.kodeAksjon = value;
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
     * Gets the value of the typeGjelder property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGjelderDto }
     *     
     */
    public TypeGjelderDto getTypeGjelder() {
        return typeGjelder;
    }

    /**
     * Sets the value of the typeGjelder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGjelderDto }
     *     
     */
    public void setTypeGjelder(TypeGjelderDto value) {
        this.typeGjelder = value;
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
     * Gets the value of the typeUtbet property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGjelderDto }
     *     
     */
    public TypeGjelderDto getTypeUtbet() {
        return typeUtbet;
    }

    /**
     * Sets the value of the typeUtbet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGjelderDto }
     *     
     */
    public void setTypeUtbet(TypeGjelderDto value) {
        this.typeUtbet = value;
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
     * Gets the value of the kodeFaggruppe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeFaggruppe() {
        return kodeFaggruppe;
    }

    /**
     * Sets the value of the kodeFaggruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeFaggruppe(String value) {
        this.kodeFaggruppe = value;
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

}
