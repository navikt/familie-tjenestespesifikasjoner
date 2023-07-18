
package no.nav.tilbakekreving.status.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="kravOgVedtakstatus" type="{urn:no:nav:tilbakekreving:status:v1}KravOgVedtakstatus"/&gt;
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
    "kravOgVedtakstatus"
})
@XmlRootElement(name = "endringKravOgVedtakstatus")
public class EndringKravOgVedtakstatus {

    @XmlElement(required = true)
    protected KravOgVedtakstatus kravOgVedtakstatus;

    /**
     * Gets the value of the kravOgVedtakstatus property.
     * 
     * @return
     *     possible object is
     *     {@link KravOgVedtakstatus }
     *     
     */
    public KravOgVedtakstatus getKravOgVedtakstatus() {
        return kravOgVedtakstatus;
    }

    /**
     * Sets the value of the kravOgVedtakstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KravOgVedtakstatus }
     *     
     */
    public void setKravOgVedtakstatus(KravOgVedtakstatus value) {
        this.kravOgVedtakstatus = value;
    }

}
