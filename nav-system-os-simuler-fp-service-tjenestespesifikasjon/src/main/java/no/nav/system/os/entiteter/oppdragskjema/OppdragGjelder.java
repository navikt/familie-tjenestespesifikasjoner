
package no.nav.system.os.entiteter.oppdragskjema;

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
 *         &lt;element name="oppdragGjelderId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fnrOrgnr"/&gt;
 *         &lt;element name="datoOppdragGjelderFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/&gt;
 *         &lt;element name="tidspktReg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}tidspktReg"/&gt;
 *         &lt;element name="saksbehId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}saksbehId"/&gt;
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
    "oppdragGjelderId",
    "datoOppdragGjelderFom",
    "tidspktReg",
    "saksbehId"
})
@XmlRootElement(name = "oppdragGjelder")
public class OppdragGjelder {

    @XmlElement(required = true)
    protected String oppdragGjelderId;
    @XmlElement(required = true)
    protected String datoOppdragGjelderFom;
    @XmlElement(required = true)
    protected String tidspktReg;
    @XmlElement(required = true)
    protected String saksbehId;

    /**
     * Gets the value of the oppdragGjelderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdragGjelderId() {
        return oppdragGjelderId;
    }

    /**
     * Sets the value of the oppdragGjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppdragGjelderId(String value) {
        this.oppdragGjelderId = value;
    }

    /**
     * Gets the value of the datoOppdragGjelderFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoOppdragGjelderFom() {
        return datoOppdragGjelderFom;
    }

    /**
     * Sets the value of the datoOppdragGjelderFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoOppdragGjelderFom(String value) {
        this.datoOppdragGjelderFom = value;
    }

    /**
     * Gets the value of the tidspktReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspktReg() {
        return tidspktReg;
    }

    /**
     * Sets the value of the tidspktReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidspktReg(String value) {
        this.tidspktReg = value;
    }

    /**
     * Gets the value of the saksbehId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksbehId() {
        return saksbehId;
    }

    /**
     * Sets the value of the saksbehId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksbehId(String value) {
        this.saksbehId = value;
    }

}
