
package no.nav.okonomi.tilbakekrevingservice;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.tilbakekreving.kravgrunnlag.hentliste.v1.ReturnertKravgrunnlagDto;
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
 *         &lt;element name="kravgrunnlagListe" type="{urn:no:nav:tilbakekreving:kravgrunnlag:hentliste:v1}ReturnertKravgrunnlagDto" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "kravgrunnlagListe"
})
@XmlRootElement(name = "kravgrunnlagHentListeResponse")
public class KravgrunnlagHentListeResponse {

    @XmlElement(required = true)
    protected MmelDto mmel;
    protected List<ReturnertKravgrunnlagDto> kravgrunnlagListe;

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
     * Gets the value of the kravgrunnlagListe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the kravgrunnlagListe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKravgrunnlagListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnertKravgrunnlagDto }
     * 
     * 
     */
    public List<ReturnertKravgrunnlagDto> getKravgrunnlagListe() {
        if (kravgrunnlagListe == null) {
            kravgrunnlagListe = new ArrayList<ReturnertKravgrunnlagDto>();
        }
        return this.kravgrunnlagListe;
    }

}
