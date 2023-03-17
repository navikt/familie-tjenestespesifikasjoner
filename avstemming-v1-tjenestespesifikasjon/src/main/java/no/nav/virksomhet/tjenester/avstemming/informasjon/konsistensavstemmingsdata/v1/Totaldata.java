
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Totaldata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Totaldata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAntall" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="totalBelop" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="fortegn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Totaldata", propOrder = {
    "totalAntall",
    "totalBelop",
    "fortegn"
})
public class Totaldata {

    @XmlElement(required = true)
    protected BigInteger totalAntall;
    @XmlElement(required = true)
    protected BigDecimal totalBelop;
    @XmlElement(required = true)
    protected String fortegn;

    /**
     * Gets the value of the totalAntall property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAntall() {
        return totalAntall;
    }

    /**
     * Sets the value of the totalAntall property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAntall(BigInteger value) {
        this.totalAntall = value;
    }

    /**
     * Gets the value of the totalBelop property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalBelop() {
        return totalBelop;
    }

    /**
     * Sets the value of the totalBelop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalBelop(BigDecimal value) {
        this.totalBelop = value;
    }

    /**
     * Gets the value of the fortegn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFortegn() {
        return fortegn;
    }

    /**
     * Sets the value of the fortegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFortegn(String value) {
        this.fortegn = value;
    }

}
