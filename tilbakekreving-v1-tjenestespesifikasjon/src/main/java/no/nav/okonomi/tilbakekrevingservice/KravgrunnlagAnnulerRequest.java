
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.annuller.v1.AnnullerKravgrunnlagDto;


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
 *         &lt;element name="annullerkravgrunnlag" type="{urn:no:nav:tilbakekreving:kravgrunnlag:annuller:v1}AnnullerKravgrunnlagDto"/&gt;
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
    "annullerkravgrunnlag"
})
@XmlRootElement(name = "kravgrunnlagAnnulerRequest")
public class KravgrunnlagAnnulerRequest {

    @XmlElement(required = true)
    protected AnnullerKravgrunnlagDto annullerkravgrunnlag;

    /**
     * Gets the value of the annullerkravgrunnlag property.
     * 
     * @return
     *     possible object is
     *     {@link AnnullerKravgrunnlagDto }
     *     
     */
    public AnnullerKravgrunnlagDto getAnnullerkravgrunnlag() {
        return annullerkravgrunnlag;
    }

    /**
     * Sets the value of the annullerkravgrunnlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnullerKravgrunnlagDto }
     *     
     */
    public void setAnnullerkravgrunnlag(AnnullerKravgrunnlagDto value) {
        this.annullerkravgrunnlag = value;
    }

}
