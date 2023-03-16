
package no.nav.tilbakekreving.typer.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeKlasseDto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeKlasseDto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEIL"/>
 *     &lt;enumeration value="JUST"/>
 *     &lt;enumeration value="SKAT"/>
 *     &lt;enumeration value="TREK"/>
 *     &lt;enumeration value="YTEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeKlasseDto")
@XmlEnum
public enum TypeKlasseDto {

    FEIL,
    JUST,
    SKAT,
    TREK,
    YTEL;

    public String value() {
        return name();
    }

    public static TypeKlasseDto fromValue(String v) {
        return valueOf(v);
    }

}
