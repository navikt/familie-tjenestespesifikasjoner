
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.detalj.v1.DetaljertKravgrunnlagDto;
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
 *         &lt;element name="detaljertkravgrunnlag" type="{urn:no:nav:tilbakekreving:kravgrunnlag:detalj:v1}DetaljertKravgrunnlagDto" minOccurs="0"/&gt;
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
    "detaljertkravgrunnlag"
})
@XmlRootElement(name = "kravgrunnlagHentDetaljResponse")
public class KravgrunnlagHentDetaljResponse {

    @XmlElement(required = true)
    protected MmelDto mmel;
    protected DetaljertKravgrunnlagDto detaljertkravgrunnlag;

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
     * Gets the value of the detaljertkravgrunnlag property.
     * 
     * @return
     *     possible object is
     *     {@link DetaljertKravgrunnlagDto }
     *     
     */
    public DetaljertKravgrunnlagDto getDetaljertkravgrunnlag() {
        return detaljertkravgrunnlag;
    }

    /**
     * Sets the value of the detaljertkravgrunnlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetaljertKravgrunnlagDto }
     *     
     */
    public void setDetaljertkravgrunnlag(DetaljertKravgrunnlagDto value) {
        this.detaljertkravgrunnlag = value;
    }

}
