
package no.nav.tilbakekreving.kravgrunnlag.detalj.v1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.typer.v1.PeriodeDto;


/**
 *  432 - Detaljert kravgrunnlag periode
 * 
 * <p>Java class for DetaljertKravgrunnlagPeriodeDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetaljertKravgrunnlagPeriodeDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periode" type="{urn:no:nav:tilbakekreving:typer:v1}PeriodeDto"/>
 *         &lt;element name="belopSkattMnd" type="{urn:no:nav:tilbakekreving:typer:v1}belop"/>
 *         &lt;element name="tilbakekrevingsBelop" type="{urn:no:nav:tilbakekreving:kravgrunnlag:detalj:v1}DetaljertKravgrunnlagBelopDto" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetaljertKravgrunnlagPeriodeDto", propOrder = {
    "periode",
    "belopSkattMnd",
    "tilbakekrevingsBelop"
})
public class DetaljertKravgrunnlagPeriodeDto {

    @XmlElement(required = true)
    protected PeriodeDto periode;
    @XmlElement(required = true)
    protected BigDecimal belopSkattMnd;
    @XmlElement(required = true)
    protected List<DetaljertKravgrunnlagBelopDto> tilbakekrevingsBelop;

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
     * Gets the value of the belopSkattMnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelopSkattMnd() {
        return belopSkattMnd;
    }

    /**
     * Sets the value of the belopSkattMnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelopSkattMnd(BigDecimal value) {
        this.belopSkattMnd = value;
    }

    /**
     * Gets the value of the tilbakekrevingsBelop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilbakekrevingsBelop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilbakekrevingsBelop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetaljertKravgrunnlagBelopDto }
     * 
     * 
     */
    public List<DetaljertKravgrunnlagBelopDto> getTilbakekrevingsBelop() {
        if (tilbakekrevingsBelop == null) {
            tilbakekrevingsBelop = new ArrayList<DetaljertKravgrunnlagBelopDto>();
        }
        return this.tilbakekrevingsBelop;
    }

}
