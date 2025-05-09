//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package no.rtv.namespacetss;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *       <choice>
 *         <sequence>
 *           <element name="tssInputData">
 *             <complexType>
 *               <complexContent>
 *                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   <choice>
 *                     <element name="tssServiceRutine" type="{http://www.rtv.no/NamespaceTSS}TServicerutiner"/>
 *                     <element name="tssAjourhold" type="{http://www.rtv.no/NamespaceTSS}Tajourforing"/>
 *                   </choice>
 *                 </restriction>
 *               </complexContent>
 *             </complexType>
 *           </element>
 *           <element name="tssOutputData" type="{http://www.rtv.no/NamespaceTSS}TOutputElementer" minOccurs="0"/>
 *         </sequence>
 *         <element name="tssInputDataAsyn">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="samhandlerIDataB970" type="{http://www.rtv.no/NamespaceTSS}samhandlerIDataB970Type"/>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="tssOutputDataAsyn">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <choice>
 *                   <element name="samhandlerODataB970">
 *                     <complexType>
 *                       <complexContent>
 *                         <extension base="{http://www.rtv.no/NamespaceTSS}typeOD970">
 *                         </extension>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </choice>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tssInputData",
    "tssOutputData",
    "tssInputDataAsyn",
    "tssOutputDataAsyn"
})
@XmlRootElement(name = "tssSamhandlerData")
public class TssSamhandlerData {

    protected TssSamhandlerData.TssInputData tssInputData;
    protected TOutputElementer tssOutputData;
    protected TssSamhandlerData.TssInputDataAsyn tssInputDataAsyn;
    protected TssSamhandlerData.TssOutputDataAsyn tssOutputDataAsyn;

    /**
     * Gets the value of the tssInputData property.
     * 
     * @return
     *     possible object is
     *     {@link TssSamhandlerData.TssInputData }
     *     
     */
    public TssSamhandlerData.TssInputData getTssInputData() {
        return tssInputData;
    }

    /**
     * Sets the value of the tssInputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TssSamhandlerData.TssInputData }
     *     
     */
    public void setTssInputData(TssSamhandlerData.TssInputData value) {
        this.tssInputData = value;
    }

    /**
     * Gets the value of the tssOutputData property.
     * 
     * @return
     *     possible object is
     *     {@link TOutputElementer }
     *     
     */
    public TOutputElementer getTssOutputData() {
        return tssOutputData;
    }

    /**
     * Sets the value of the tssOutputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TOutputElementer }
     *     
     */
    public void setTssOutputData(TOutputElementer value) {
        this.tssOutputData = value;
    }

    /**
     * Gets the value of the tssInputDataAsyn property.
     * 
     * @return
     *     possible object is
     *     {@link TssSamhandlerData.TssInputDataAsyn }
     *     
     */
    public TssSamhandlerData.TssInputDataAsyn getTssInputDataAsyn() {
        return tssInputDataAsyn;
    }

    /**
     * Sets the value of the tssInputDataAsyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TssSamhandlerData.TssInputDataAsyn }
     *     
     */
    public void setTssInputDataAsyn(TssSamhandlerData.TssInputDataAsyn value) {
        this.tssInputDataAsyn = value;
    }

    /**
     * Gets the value of the tssOutputDataAsyn property.
     * 
     * @return
     *     possible object is
     *     {@link TssSamhandlerData.TssOutputDataAsyn }
     *     
     */
    public TssSamhandlerData.TssOutputDataAsyn getTssOutputDataAsyn() {
        return tssOutputDataAsyn;
    }

    /**
     * Sets the value of the tssOutputDataAsyn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TssSamhandlerData.TssOutputDataAsyn }
     *     
     */
    public void setTssOutputDataAsyn(TssSamhandlerData.TssOutputDataAsyn value) {
        this.tssOutputDataAsyn = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="tssServiceRutine" type="{http://www.rtv.no/NamespaceTSS}TServicerutiner"/>
     *         <element name="tssAjourhold" type="{http://www.rtv.no/NamespaceTSS}Tajourforing"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tssServiceRutine",
        "tssAjourhold"
    })
    public static class TssInputData {

        protected TServicerutiner tssServiceRutine;
        protected Tajourforing tssAjourhold;

        /**
         * Gets the value of the tssServiceRutine property.
         * 
         * @return
         *     possible object is
         *     {@link TServicerutiner }
         *     
         */
        public TServicerutiner getTssServiceRutine() {
            return tssServiceRutine;
        }

        /**
         * Sets the value of the tssServiceRutine property.
         * 
         * @param value
         *     allowed object is
         *     {@link TServicerutiner }
         *     
         */
        public void setTssServiceRutine(TServicerutiner value) {
            this.tssServiceRutine = value;
        }

        /**
         * Gets the value of the tssAjourhold property.
         * 
         * @return
         *     possible object is
         *     {@link Tajourforing }
         *     
         */
        public Tajourforing getTssAjourhold() {
            return tssAjourhold;
        }

        /**
         * Sets the value of the tssAjourhold property.
         * 
         * @param value
         *     allowed object is
         *     {@link Tajourforing }
         *     
         */
        public void setTssAjourhold(Tajourforing value) {
            this.tssAjourhold = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="samhandlerIDataB970" type="{http://www.rtv.no/NamespaceTSS}samhandlerIDataB970Type"/>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "samhandlerIDataB970"
    })
    public static class TssInputDataAsyn {

        protected SamhandlerIDataB970Type samhandlerIDataB970;

        /**
         * Gets the value of the samhandlerIDataB970 property.
         * 
         * @return
         *     possible object is
         *     {@link SamhandlerIDataB970Type }
         *     
         */
        public SamhandlerIDataB970Type getSamhandlerIDataB970() {
            return samhandlerIDataB970;
        }

        /**
         * Sets the value of the samhandlerIDataB970 property.
         * 
         * @param value
         *     allowed object is
         *     {@link SamhandlerIDataB970Type }
         *     
         */
        public void setSamhandlerIDataB970(SamhandlerIDataB970Type value) {
            this.samhandlerIDataB970 = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <choice>
     *         <element name="samhandlerODataB970">
     *           <complexType>
     *             <complexContent>
     *               <extension base="{http://www.rtv.no/NamespaceTSS}typeOD970">
     *               </extension>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </choice>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "samhandlerODataB970"
    })
    public static class TssOutputDataAsyn {

        protected TssSamhandlerData.TssOutputDataAsyn.SamhandlerODataB970 samhandlerODataB970;

        /**
         * Gets the value of the samhandlerODataB970 property.
         * 
         * @return
         *     possible object is
         *     {@link TssSamhandlerData.TssOutputDataAsyn.SamhandlerODataB970 }
         *     
         */
        public TssSamhandlerData.TssOutputDataAsyn.SamhandlerODataB970 getSamhandlerODataB970() {
            return samhandlerODataB970;
        }

        /**
         * Sets the value of the samhandlerODataB970 property.
         * 
         * @param value
         *     allowed object is
         *     {@link TssSamhandlerData.TssOutputDataAsyn.SamhandlerODataB970 }
         *     
         */
        public void setSamhandlerODataB970(TssSamhandlerData.TssOutputDataAsyn.SamhandlerODataB970 value) {
            this.samhandlerODataB970 = value;
        }


        /**
         * <p>Java class for anonymous complex type</p>.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <extension base="{http://www.rtv.no/NamespaceTSS}typeOD970">
         *     </extension>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SamhandlerODataB970
            extends TypeOD970
        {


        }

    }

}
