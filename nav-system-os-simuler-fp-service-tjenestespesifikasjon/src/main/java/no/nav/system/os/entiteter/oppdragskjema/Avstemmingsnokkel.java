
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
 *         &lt;element name="kodeKomponent"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="avstemmingsNokkel"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tidspktReg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}tidspktReg"/&gt;
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
    "kodeKomponent",
    "avstemmingsNokkel",
    "tidspktReg"
})
@XmlRootElement(name = "avstemmingsnokkel")
public class Avstemmingsnokkel {

    @XmlElement(required = true)
    protected String kodeKomponent;
    @XmlElement(required = true)
    protected String avstemmingsNokkel;
    @XmlElement(required = true)
    protected String tidspktReg;

    /**
     * Gets the value of the kodeKomponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeKomponent() {
        return kodeKomponent;
    }

    /**
     * Sets the value of the kodeKomponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeKomponent(String value) {
        this.kodeKomponent = value;
    }

    /**
     * Gets the value of the avstemmingsNokkel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvstemmingsNokkel() {
        return avstemmingsNokkel;
    }

    /**
     * Sets the value of the avstemmingsNokkel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvstemmingsNokkel(String value) {
        this.avstemmingsNokkel = value;
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

}
