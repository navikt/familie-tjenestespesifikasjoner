
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Totaldata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Totaldata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="totalAntall" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         <element name="totalBelop" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="fortegn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    /**
     * Angir om beløp er tillegg (T) eller fradrag (F).
     * 
     */
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
     * Angir om beløp er tillegg (T) eller fradrag (F).
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
     * @see #getFortegn()
     */
    public void setFortegn(String value) {
        this.fortegn = value;
    }

}
