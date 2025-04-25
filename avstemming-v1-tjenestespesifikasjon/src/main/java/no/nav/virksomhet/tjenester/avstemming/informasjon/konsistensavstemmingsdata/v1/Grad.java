
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Grad complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Grad">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gradKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="grad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grad", propOrder = {
    "gradKode",
    "grad"
})
public class Grad {

    /**
     * Hvilken grad som mottas (uføregrad/utbetalingsgrad, yrkesskadegrad, tidskontograd, dekningsgrad etc.)
     * 
     */
    protected String gradKode;
    /**
     * Tall i prosent
     * 
     */
    protected Integer grad;

    /**
     * Hvilken grad som mottas (uføregrad/utbetalingsgrad, yrkesskadegrad, tidskontograd, dekningsgrad etc.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradKode() {
        return gradKode;
    }

    /**
     * Sets the value of the gradKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getGradKode()
     */
    public void setGradKode(String value) {
        this.gradKode = value;
    }

    /**
     * Tall i prosent
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrad() {
        return grad;
    }

    /**
     * Sets the value of the grad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     * @see #getGrad()
     */
    public void setGrad(Integer value) {
        this.grad = value;
    }

}
