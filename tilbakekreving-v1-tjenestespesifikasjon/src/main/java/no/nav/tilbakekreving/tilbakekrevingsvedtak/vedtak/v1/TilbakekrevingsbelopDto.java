
package no.nav.tilbakekreving.tilbakekrevingsvedtak.vedtak.v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  443 - Tilbakekrevingsbelop
 * 
 * <p>Java class for TilbakekrevingsbelopDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilbakekrevingsbelopDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeKlasse" type="{urn:no:nav:tilbakekreving:typer:v1}KodeKlasseDto"/>
 *         &lt;element name="belopOpprUtbet" type="{urn:no:nav:tilbakekreving:typer:v1}belop"/>
 *         &lt;element name="belopNy" type="{urn:no:nav:tilbakekreving:typer:v1}belop"/>
 *         &lt;element name="belopTilbakekreves" type="{urn:no:nav:tilbakekreving:typer:v1}belop"/>
 *         &lt;element name="belopUinnkrevd" type="{urn:no:nav:tilbakekreving:typer:v1}belop" minOccurs="0"/>
 *         &lt;element name="belopSkatt" type="{urn:no:nav:tilbakekreving:typer:v1}belop" minOccurs="0"/>
 *         &lt;element name="kodeResultat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kodeAarsak" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "TilbakekrevingsbelopDto", propOrder = {
    "kodeKlasse",
    "belopOpprUtbet",
    "belopNy",
    "belopTilbakekreves",
    "belopUinnkrevd",
    "belopSkatt",
    "kodeResultat",
    "kodeAarsak",
    "kodeSkyld"
})
public class TilbakekrevingsbelopDto {

    @XmlElement(required = true)
    protected String kodeKlasse;
    @XmlElement(required = true)
    protected BigDecimal belopOpprUtbet;
    @XmlElement(required = true)
    protected BigDecimal belopNy;
    @XmlElement(required = true)
    protected BigDecimal belopTilbakekreves;
    protected BigDecimal belopUinnkrevd;
    protected BigDecimal belopSkatt;
    @XmlElement(required = true)
    protected String kodeResultat;
    @XmlElement(required = true)
    protected String kodeAarsak;
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
     * Gets the value of the belopSkatt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopSkatt() {
        return belopSkatt;
    }

    /**
     * Sets the value of the belopSkatt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopSkatt(BigDecimal value) {
        this.belopSkatt = value;
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
     * Gets the value of the kodeAarsak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAarsak() {
        return kodeAarsak;
    }

    /**
     * Sets the value of the kodeAarsak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAarsak(String value) {
        this.kodeAarsak = value;
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
