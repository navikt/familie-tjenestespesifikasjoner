
package no.nav.tilbakekreving.kravgrunnlag.detalj.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.typer.v1.TypeKlasseDto;


/**
 *  433 - Detaljert kravgrunnlag belop
 * 
 * <p>Java class for DetaljertKravgrunnlagBelopDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetaljertKravgrunnlagBelopDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeKlasse" type="{urn:no:nav:tilbakekreving:typer:v1}KodeKlasseDto"/>
 *         &lt;element name="typeKlasse" type="{urn:no:nav:tilbakekreving:typer:v1}TypeKlasseDto"/>
 *         &lt;element name="belopOpprUtbet" type="{urn:no:nav:tilbakekreving:typer:v1}belop" minOccurs="0"/>
 *         &lt;element name="belopNy" type="{urn:no:nav:tilbakekreving:typer:v1}belop"/>
 *         &lt;element name="belopTilbakekreves" type="{urn:no:nav:tilbakekreving:typer:v1}belop" minOccurs="0"/>
 *         &lt;element name="belopUinnkrevd" type="{urn:no:nav:tilbakekreving:typer:v1}belop" minOccurs="0"/>
 *         &lt;element name="skattProsent" type="{urn:no:nav:tilbakekreving:typer:v1}skattProsent"/>
 *         &lt;element name="kodeResultat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeAArsak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodeSkyld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetaljertKravgrunnlagBelopDto", propOrder = {
    "kodeKlasse",
    "typeKlasse",
    "belopOpprUtbet",
    "belopNy",
    "belopTilbakekreves",
    "belopUinnkrevd",
    "skattProsent",
    "kodeResultat",
    "kodeAArsak",
    "kodeSkyld"
})
public class DetaljertKravgrunnlagBelopDto {

    @XmlElement(required = true)
    protected String kodeKlasse;
    @XmlElement(required = true)
    protected TypeKlasseDto typeKlasse;
    protected BigDecimal belopOpprUtbet;
    @XmlElement(required = true)
    protected BigDecimal belopNy;
    protected BigDecimal belopTilbakekreves;
    protected BigDecimal belopUinnkrevd;
    @XmlElement(required = true)
    protected BigDecimal skattProsent;
    protected String kodeResultat;
    protected String kodeAArsak;
    protected String kodeSkyld;

    /**
     * Gets the value of the kodeKlasse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeKlasse() {
        return kodeKlasse;
    }

    /**
     * Sets the value of the kodeKlasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeKlasse(String value) {
        this.kodeKlasse = value;
    }

    /**
     * Gets the value of the typeKlasse property.
     * 
     * @return
     *     possible object is
     *     {@link TypeKlasseDto }
     *     
     */
    public TypeKlasseDto getTypeKlasse() {
        return typeKlasse;
    }

    /**
     * Sets the value of the typeKlasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeKlasseDto }
     *     
     */
    public void setTypeKlasse(TypeKlasseDto value) {
        this.typeKlasse = value;
    }

    /**
     * Gets the value of the belopOpprUtbet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopOpprUtbet() {
        return belopOpprUtbet;
    }

    /**
     * Sets the value of the belopOpprUtbet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopOpprUtbet(BigDecimal value) {
        this.belopOpprUtbet = value;
    }

    /**
     * Gets the value of the belopNy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopNy() {
        return belopNy;
    }

    /**
     * Sets the value of the belopNy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopNy(BigDecimal value) {
        this.belopNy = value;
    }

    /**
     * Gets the value of the belopTilbakekreves property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopTilbakekreves() {
        return belopTilbakekreves;
    }

    /**
     * Sets the value of the belopTilbakekreves property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopTilbakekreves(BigDecimal value) {
        this.belopTilbakekreves = value;
    }

    /**
     * Gets the value of the belopUinnkrevd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopUinnkrevd() {
        return belopUinnkrevd;
    }

    /**
     * Sets the value of the belopUinnkrevd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopUinnkrevd(BigDecimal value) {
        this.belopUinnkrevd = value;
    }

    /**
     * Gets the value of the skattProsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSkattProsent() {
        return skattProsent;
    }

    /**
     * Sets the value of the skattProsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSkattProsent(BigDecimal value) {
        this.skattProsent = value;
    }

    /**
     * Gets the value of the kodeResultat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeResultat() {
        return kodeResultat;
    }

    /**
     * Sets the value of the kodeResultat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeResultat(String value) {
        this.kodeResultat = value;
    }

    /**
     * Gets the value of the kodeAArsak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAArsak() {
        return kodeAArsak;
    }

    /**
     * Sets the value of the kodeAArsak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAArsak(String value) {
        this.kodeAArsak = value;
    }

    /**
     * Gets the value of the kodeSkyld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeSkyld() {
        return kodeSkyld;
    }

    /**
     * Sets the value of the kodeSkyld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeSkyld(String value) {
        this.kodeSkyld = value;
    }

}
