
package no.nav.tilbakekreving.tilbakekrevingsvedtak.vedtak.v1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  441 - Tilbakekrevingsvedtak
 * 
 * <p>Java class for TilbakekrevingsvedtakDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilbakekrevingsvedtakDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kodeAksjon" type="{urn:no:nav:tilbakekreving:typer:v1}KodeAksjonDto"/>
 *         &lt;element name="vedtakId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="datoVedtakFagsystem" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="kodeHjemmel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="renterBeregnes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enhetAnsvarlig" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kontrollfelt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="saksbehId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tilbakekrevingsperiode" type="{urn:no:nav:tilbakekreving:tilbakekrevingsvedtak:vedtak:v1}TilbakekrevingsperiodeDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilbakekrevingsvedtakDto", propOrder = {
    "kodeAksjon",
    "vedtakId",
    "datoVedtakFagsystem",
    "kodeHjemmel",
    "renterBeregnes",
    "enhetAnsvarlig",
    "kontrollfelt",
    "saksbehId",
    "tilbakekrevingsperiode"
})
public class TilbakekrevingsvedtakDto {

    @XmlElement(required = true)
    protected String kodeAksjon;
    @XmlElement(required = true)
    protected BigInteger vedtakId;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoVedtakFagsystem;
    @XmlElement(required = true)
    protected String kodeHjemmel;
    protected String renterBeregnes;
    @XmlElement(required = true)
    protected String enhetAnsvarlig;
    @XmlElement(required = true)
    protected String kontrollfelt;
    @XmlElement(required = true)
    protected String saksbehId;
    protected List<TilbakekrevingsperiodeDto> tilbakekrevingsperiode;

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
     *     {@link String }
     *     
     */
    public String getRenterBeregnes() {
        return renterBeregnes;
    }

    /**
     * Sets the value of the renterBeregnes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenterBeregnes(String value) {
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
     * Gets the value of the tilbakekrevingsperiode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilbakekrevingsperiode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilbakekrevingsperiode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TilbakekrevingsperiodeDto }
     * 
     * 
     */
    public List<TilbakekrevingsperiodeDto> getTilbakekrevingsperiode() {
        if (tilbakekrevingsperiode == null) {
            tilbakekrevingsperiode = new ArrayList<TilbakekrevingsperiodeDto>();
        }
        return this.tilbakekrevingsperiode;
    }

}
