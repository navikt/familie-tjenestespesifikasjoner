//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.16 at 09:21:05 PM CET 
//


package no.rtv.namespacetss;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dette er en type som beskriver elementene til samhandler adresse data
 * 
 * <p>Java class for relasjonSamhType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relasjonSamhType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.rtv.no/NamespaceTSS}samhRelasjonType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="antRelSamh" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/&gt;
 *         &lt;element name="relSamhandler" type="{http://www.rtv.no/NamespaceTSS}relSamhType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relasjonSamhType", propOrder = {
    "antRelSamh",
    "relSamhandler"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
public class RelasjonSamhType
    extends SamhRelasjonType
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected String antRelSamh;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    protected List<RelSamhType> relSamhandler;

    /**
     * Gets the value of the antRelSamh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public String getAntRelSamh() {
        return antRelSamh;
    }

    /**
     * Sets the value of the antRelSamh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public void setAntRelSamh(String value) {
        this.antRelSamh = value;
    }

    /**
     * Gets the value of the relSamhandler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relSamhandler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelSamhandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelSamhType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-03-16T09:21:05+01:00", comments = "JAXB RI v2.3.0")
    public List<RelSamhType> getRelSamhandler() {
        if (relSamhandler == null) {
            relSamhandler = new ArrayList<RelSamhType>();
        }
        return this.relSamhandler;
    }

}
