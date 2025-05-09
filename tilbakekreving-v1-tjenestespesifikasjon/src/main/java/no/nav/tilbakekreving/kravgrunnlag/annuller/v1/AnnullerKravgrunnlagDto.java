
package no.nav.tilbakekreving.kravgrunnlag.annuller.v1;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  446 - Annuller kravgrunnlag
 * 
 * <p>Java class for AnnullerKravgrunnlagDto complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AnnullerKravgrunnlagDto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kodeAksjon" type="{urn:no:nav:tilbakekreving:typer:v1}KodeAksjonDto"/>
 *         <element name="vedtakId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="saksbehId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
