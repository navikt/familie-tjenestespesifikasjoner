//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.17 at 03:51:43 PM CET 
//


package no.nav.tilbakekreving.tilbakekrevingsvedtak.vedtak.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.typer.v1.PeriodeDto;


/**
 *  442 - Tilbakekrevingsperiode
 * 
 * <p>Java class for TilbakekrevingsperiodeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilbakekrevingsperiodeDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="periode" type="{urn:no:nav:tilbakekreving:typer:v1}PeriodeDto"/&gt;
 *         &lt;element name="renterBeregnes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="belopRenter" type="{urn:no:nav:tilbakekreving:typer:v1}belop" minOccurs="0"/&gt;
 *         &lt;element name="tilbakekrevingsbelop" type="{urn:no:nav:tilbakekreving:tilbakekrevingsvedtak:vedtak:v1}TilbakekrevingsbelopDto" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TilbakekrevingsperiodeDto", propOrder = {
    "periode",
    "renterBeregnes",
    "belopRenter",
    "tilbakekrevingsbelop"
})
public class TilbakekrevingsperiodeDto {

    @XmlElement(required = true)
    protected PeriodeDto periode;
    protected String renterBeregnes;
    protected BigDecimal belopRenter;
    @XmlElement(required = true)
    protected List<TilbakekrevingsbelopDto> tilbakekrevingsbelop;

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
     * Gets the value of the belopRenter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopRenter() {
        return belopRenter;
    }

    /**
     * Sets the value of the belopRenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopRenter(BigDecimal value) {
        this.belopRenter = value;
    }

    /**
     * Gets the value of the tilbakekrevingsbelop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tilbakekrevingsbelop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilbakekrevingsbelop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TilbakekrevingsbelopDto }
     * 
     * 
     */
    public List<TilbakekrevingsbelopDto> getTilbakekrevingsbelop() {
        if (tilbakekrevingsbelop == null) {
            tilbakekrevingsbelop = new ArrayList<TilbakekrevingsbelopDto>();
        }
        return this.tilbakekrevingsbelop;
    }

}
