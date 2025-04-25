
package no.nav.system.os.entiteter.oppdragskjema;

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
 *         <element name="kodeKomponent">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="avstemmingsNokkel">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <minLength value="1"/>
 *               <maxLength value="8"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="tidspktReg" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}tidspktReg"/>
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
