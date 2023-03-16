
package no.nav.tilbakekreving.kravgrunnlag.detalj.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  420 - Hent kravgrunnlag
 * 
 * <p>Java class for HentKravgrunnlagDetaljDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HentKravgrunnlagDetaljDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeAksjon" type="{urn:no:nav:tilbakekreving:typer:v1}KodeAksjonDto"/>
 *         &lt;element name="kravgrunnlagId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="saksbehId" type="{urn:no:nav:tilbakekreving:typer:v1}SaksbehandlerDto"/>
 *         &lt;element name="enhetAnsvarlig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HentKravgrunnlagDetaljDto", propOrder = {
    "kodeAksjon",
    "kravgrunnlagId",
    "saksbehId",
    "enhetAnsvarlig"
})
public class HentKravgrunnlagDetaljDto {

    @XmlElement(required = true)
    protected String kodeAksjon;
    @XmlElement(required = true)
    protected BigInteger kravgrunnlagId;
    @XmlElement(required = true)
    protected String saksbehId;
    @XmlElement(required = true)
    protected String enhetAnsvarlig;

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

}
