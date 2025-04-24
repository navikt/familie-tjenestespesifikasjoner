
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.annuller.v1.AnnullerKravgrunnlagDto;
import no.nav.tilbakekreving.typer.v1.MmelDto;


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
 *         <element name="mmel" type="{urn:no:nav:tilbakekreving:typer:v1}MmelDto"/>
 *         <element name="annullerkravgrunnlag" type="{urn:no:nav:tilbakekreving:kravgrunnlag:annuller:v1}AnnullerKravgrunnlagDto"/>
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
    "mmel",
    "annullerkravgrunnlag"
})
@XmlRootElement(name = "kravgrunnlagAnnulerResponse")
public class KravgrunnlagAnnulerResponse {

    @XmlElement(required = true)
    protected MmelDto mmel;
    @XmlElement(required = true)
    protected AnnullerKravgrunnlagDto annullerkravgrunnlag;

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
