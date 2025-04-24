
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grensesnittavstemmingen skal minimum bestå av en id-110 (aksjonskode ’DATA) og en totalrecord (id-120) i tillegg til START- og SLUTT-recorden.
 * 
 * <p>Java class for Totaldata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Totaldata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="totalAntall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="totalBelop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="fortegn" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Fortegn" minOccurs="0"/>
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

    /**
     * Antall overførte meldinger
     * 
     */
    protected int totalAntall;
    /**
     * Sum beløp på øverførte meldinger
     * 
     */
    protected BigDecimal totalBelop;
    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     */
    @XmlSchemaType(name = "string")
    protected Fortegn fortegn;

    /**
     * Antall overførte meldinger
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
     * Sum beløp på øverførte meldinger
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
     * @see #getTotalBelop()
     */
    public void setTotalBelop(BigDecimal value) {
        this.totalBelop = value;
    }

    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
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
     * @see #getFortegn()
     */
    public void setFortegn(Fortegn value) {
        this.fortegn = value;
    }

}
