
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.tilbakekrevingsvedtak.vedtak.v1.TilbakekrevingsvedtakDto;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="tilbakekrevingsvedtak" type="{urn:no:nav:tilbakekreving:tilbakekrevingsvedtak:vedtak:v1}TilbakekrevingsvedtakDto"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tilbakekrevingsvedtak"
})
@XmlRootElement(name = "tilbakekrevingsvedtakRequest")
public class TilbakekrevingsvedtakRequest {

    @XmlElement(required = true)
    protected TilbakekrevingsvedtakDto tilbakekrevingsvedtak;

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
