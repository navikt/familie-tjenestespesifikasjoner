
package no.nav.okonomi.tilbakekrevingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.detalj.v1.HentKravgrunnlagDetaljDto;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hentkravgrunnlag" type="{urn:no:nav:tilbakekreving:kravgrunnlag:detalj:v1}HentKravgrunnlagDetaljDto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hentkravgrunnlag"
})
@XmlRootElement(name = "kravgrunnlagHentDetaljRequest")
public class KravgrunnlagHentDetaljRequest {

    @XmlElement(required = true)
    protected HentKravgrunnlagDetaljDto hentkravgrunnlag;

    /**
     * Gets the value of the hentkravgrunnlag property.
     * 
     * @return
     *     possible object is
     *     {@link HentKravgrunnlagDetaljDto }
     *     
     */
    public HentKravgrunnlagDetaljDto getHentkravgrunnlag() {
        return hentkravgrunnlag;
    }

    /**
     * Sets the value of the hentkravgrunnlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link HentKravgrunnlagDetaljDto }
     *     
     */
    public void setHentkravgrunnlag(HentKravgrunnlagDetaljDto value) {
        this.hentkravgrunnlag = value;
    }

}
