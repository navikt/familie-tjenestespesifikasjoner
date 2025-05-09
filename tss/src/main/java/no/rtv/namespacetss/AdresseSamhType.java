//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Dette er en type som beskriver elementene til samhandler adresse data
 * 
 * <p>Java class for adresseSamhType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="adresseSamhType">
 *   <complexContent>
 *     <extension base="{http://www.rtv.no/NamespaceTSS}adresseGrpType">
 *       <sequence minOccurs="0">
 *         <element name="antAdrRegion" type="{http://www.rtv.no/NamespaceTSS}Tantallforekomster"/>
 *         <element name="adrRegionInfo" type="{http://www.rtv.no/NamespaceTSS}adrRegionInfoType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresseSamhType", propOrder = {
    "antAdrRegion",
    "adrRegionInfo"
})
public class AdresseSamhType
    extends AdresseGrpType
{

    protected String antAdrRegion;
    protected AdrRegionInfoType adrRegionInfo;

    /**
     * Gets the value of the antAdrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntAdrRegion() {
        return antAdrRegion;
    }

    /**
     * Sets the value of the antAdrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntAdrRegion(String value) {
        this.antAdrRegion = value;
    }

    /**
     * Gets the value of the adrRegionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdrRegionInfoType }
     *     
     */
    public AdrRegionInfoType getAdrRegionInfo() {
        return adrRegionInfo;
    }

    /**
     * Sets the value of the adrRegionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdrRegionInfoType }
     *     
     */
    public void setAdrRegionInfo(AdrRegionInfoType value) {
        this.adrRegionInfo = value;
    }

}
