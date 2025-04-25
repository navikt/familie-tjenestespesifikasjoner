
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.detalj.v1.HentKravgrunnlagDetaljDto;


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
 *         <element name="hentkravgrunnlag" type="{urn:no:nav:tilbakekreving:kravgrunnlag:detalj:v1}HentKravgrunnlagDetaljDto"/>
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
