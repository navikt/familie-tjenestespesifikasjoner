
package no.nav.tilbakekreving.typer.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JaNeiDto.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="JaNeiDto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="J"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "JaNeiDto")
@XmlEnum
public enum JaNeiDto {

    J,
    N;

    public String value() {
        return name();
    }

    public static JaNeiDto fromValue(String v) {
        return valueOf(v);
    }

}
