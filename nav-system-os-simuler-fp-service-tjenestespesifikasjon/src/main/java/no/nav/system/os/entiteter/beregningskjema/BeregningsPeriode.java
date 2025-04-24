
package no.nav.system.os.entiteter.beregningskjema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="periodeFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *         <element name="periodeTom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *         <element ref="{http://nav.no/system/os/entiteter/beregningSkjema}beregningStoppnivaa" maxOccurs="999"/>
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
    "periodeFom",
    "periodeTom",
    "beregningStoppnivaa"
})
@XmlRootElement(name = "beregningsPeriode")
public class BeregningsPeriode {

    @XmlElement(required = true)
    protected String periodeFom;
    @XmlElement(required = true)
    protected String periodeTom;
    /**
     * Referanse ID 313
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/beregningSkjema", required = true)
    protected List<BeregningStoppnivaa> beregningStoppnivaa;

    /**
     * Gets the value of the periodeFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodeFom() {
        return periodeFom;
    }

    /**
     * Sets the value of the periodeFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodeFom(String value) {
        this.periodeFom = value;
    }

    /**
     * Gets the value of the periodeTom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodeTom() {
        return periodeTom;
    }

    /**
     * Sets the value of the periodeTom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodeTom(String value) {
        this.periodeTom = value;
    }

    /**
     * Referanse ID 313
     * 
     * Gets the value of the beregningStoppnivaa property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beregningStoppnivaa property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBeregningStoppnivaa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeregningStoppnivaa }
     * </p>
     * 
     * 
     * @return
     *     The value of the beregningStoppnivaa property.
     */
    public List<BeregningStoppnivaa> getBeregningStoppnivaa() {
        if (beregningStoppnivaa == null) {
            beregningStoppnivaa = new ArrayList<>();
        }
        return this.beregningStoppnivaa;
    }

}
