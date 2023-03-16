
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.tilbakekrevingsvedtak.vedtak.v1.TilbakekrevingsvedtakDto;
import no.nav.tilbakekreving.typer.v1.MmelDto;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mmel" type="{urn:no:nav:tilbakekreving:typer:v1}MmelDto"/&gt;
 *         &lt;element name="tilbakekrevingsvedtak" type="{urn:no:nav:tilbakekreving:tilbakekrevingsvedtak:vedtak:v1}TilbakekrevingsvedtakDto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mmel",
    "tilbakekrevingsvedtak"
})
@XmlRootElement(name = "tilbakekrevingsvedtakResponse")
public class TilbakekrevingsvedtakResponse {

    @XmlElement(required = true)
    protected MmelDto mmel;
    @XmlElement(required = true)
    protected TilbakekrevingsvedtakDto tilbakekrevingsvedtak;

    /**
     * Gets the value of the mmel property.
     * 
     * @return
     *     possible object is
     *     {@link MmelDto }
     *     
     */
    public MmelDto getMmel() {
        return mmel;
    }

    /**
     * Sets the value of the mmel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MmelDto }
     *     
     */
    public void setMmel(MmelDto value) {
        this.mmel = value;
    }

    /**
     * Gets the value of the tilbakekrevingsvedtak property.
     * 
     * @return
     *     possible object is
     *     {@link TilbakekrevingsvedtakDto }
     *     
     */
    public TilbakekrevingsvedtakDto getTilbakekrevingsvedtak() {
        return tilbakekrevingsvedtak;
    }

    /**
     * Sets the value of the tilbakekrevingsvedtak property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilbakekrevingsvedtakDto }
     *     
     */
    public void setTilbakekrevingsvedtak(TilbakekrevingsvedtakDto value) {
        this.tilbakekrevingsvedtak = value;
    }

}
