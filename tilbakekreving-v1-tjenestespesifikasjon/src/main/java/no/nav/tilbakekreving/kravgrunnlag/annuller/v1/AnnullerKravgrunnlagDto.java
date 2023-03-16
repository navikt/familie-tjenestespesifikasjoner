
package no.nav.tilbakekreving.kravgrunnlag.annuller.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  446 - Annuller kravgrunnlag
 * 
 * <p>Java class for AnnullerKravgrunnlagDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnullerKravgrunnlagDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeAksjon" type="{urn:no:nav:tilbakekreving:typer:v1}KodeAksjonDto"/>
 *         &lt;element name="vedtakId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="saksbehId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnullerKravgrunnlagDto", propOrder = {
    "kodeAksjon",
    "vedtakId",
    "saksbehId"
})
public class AnnullerKravgrunnlagDto {

    @XmlElement(required = true)
    protected String kodeAksjon;
    @XmlElement(required = true)
    protected BigInteger vedtakId;
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
