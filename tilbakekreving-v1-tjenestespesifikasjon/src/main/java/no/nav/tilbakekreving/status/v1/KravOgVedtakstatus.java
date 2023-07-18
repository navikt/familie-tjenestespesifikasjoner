
package no.nav.tilbakekreving.status.v1;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.typer.v1.TypeGjelderDto;


/**
 *  437 - Endring krav og vedtakstatus
 * 
 * <p>Java class for KravOgVedtakstatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KravOgVedtakstatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vedtakId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="kodeStatusKrav" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kodeFagomraade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fagsystemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vedtakGjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}FnrOrgnrDto"/&gt;
 *         &lt;element name="typeGjelderId" type="{urn:no:nav:tilbakekreving:typer:v1}TypeGjelderDto"/&gt;
 *         &lt;element name="referanse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KravOgVedtakstatus", propOrder = {
    "vedtakId",
    "kodeStatusKrav",
    "kodeFagomraade",
    "fagsystemId",
    "vedtakGjelderId",
    "typeGjelderId",
    "referanse"
})
public class KravOgVedtakstatus {

    @XmlElement(required = true)
    protected BigInteger vedtakId;
    @XmlElement(required = true)
    protected String kodeStatusKrav;
    @XmlElement(required = true)
    protected String kodeFagomraade;
    @XmlElement(required = true)
    protected String fagsystemId;
    @XmlElement(required = true)
    protected String vedtakGjelderId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeGjelderDto typeGjelderId;
    protected String referanse;

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

}
