
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grensesnittavstemmingen skal minimum bestå av en id-110 (aksjonskode ’DATA) og en totalrecord (id-120) i tillegg til START- og SLUTT-recorden.
 * 
 * <p>Java class for Totaldata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Totaldata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalAntall" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalBelop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="fortegn" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Fortegn" minOccurs="0"/&gt;
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

    protected int totalAntall;
    protected BigDecimal totalBelop;
    @XmlSchemaType(name = "string")
    protected Fortegn fortegn;

    /**
     * Gets the value of the totalAntall property.
     * 
     */
    public int getTotalAntall() {
        return totalAntall;
    }

    /**
     * Sets the value of the totalAntall property.
     * 
     */
    public void setTotalAntall(int value) {
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
     *     {@link Fortegn }
     *     
     */
    public Fortegn getFortegn() {
        return fortegn;
    }

    /**
     * Sets the value of the fortegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fortegn }
     *     
     */
    public void setFortegn(Fortegn value) {
        this.fortegn = value;
    }

}
