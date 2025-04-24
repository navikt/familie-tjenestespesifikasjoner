
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for KildeType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="KildeType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AVLEV"/>
 *     <enumeration value="MOTT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "KildeType")
@XmlEnum
public enum KildeType {


    /**
     * Avleverende komponent
     * 
     */
    AVLEV,

    /**
     * Mottakende komponent
     * 
     */
    MOTT;

    public String value() {
        return name();
    }

    public static KildeType fromValue(String v) {
        return valueOf(v);
    }

}
