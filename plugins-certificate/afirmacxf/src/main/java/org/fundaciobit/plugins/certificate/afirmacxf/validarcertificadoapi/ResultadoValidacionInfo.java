
package org.fundaciobit.plugins.certificate.afirmacxf.validarcertificadoapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoValidacionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultadoValidacionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidacionSimple" type="{http://afirmaws/ws/validacion}ValidacionSimpleInfo"/>
 *         &lt;element name="ValidacionEstado" type="{http://afirmaws/ws/validacion}ValidacionEstadoInfo" minOccurs="0"/>
 *         &lt;element name="ValidacionCadena" type="{http://afirmaws/ws/validacion}ValidacionCadenaInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoValidacionInfo", propOrder = {
    "resultado",
    "descripcion",
    "validacionSimple",
    "validacionEstado",
    "validacionCadena"
})
public class ResultadoValidacionInfo {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(name = "ValidacionSimple", required = true)
    protected ValidacionSimpleInfo validacionSimple;
    @XmlElement(name = "ValidacionEstado")
    protected ValidacionEstadoInfo validacionEstado;
    @XmlElement(name = "ValidacionCadena")
    protected ValidacionCadenaInfo validacionCadena;

    /**
     * Gets the value of the resultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the validacionSimple property.
     * 
     * @return
     *     possible object is
     *     {@link ValidacionSimpleInfo }
     *     
     */
    public ValidacionSimpleInfo getValidacionSimple() {
        return validacionSimple;
    }

    /**
     * Sets the value of the validacionSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidacionSimpleInfo }
     *     
     */
    public void setValidacionSimple(ValidacionSimpleInfo value) {
        this.validacionSimple = value;
    }

    /**
     * Gets the value of the validacionEstado property.
     * 
     * @return
     *     possible object is
     *     {@link ValidacionEstadoInfo }
     *     
     */
    public ValidacionEstadoInfo getValidacionEstado() {
        return validacionEstado;
    }

    /**
     * Sets the value of the validacionEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidacionEstadoInfo }
     *     
     */
    public void setValidacionEstado(ValidacionEstadoInfo value) {
        this.validacionEstado = value;
    }

    /**
     * Gets the value of the validacionCadena property.
     * 
     * @return
     *     possible object is
     *     {@link ValidacionCadenaInfo }
     *     
     */
    public ValidacionCadenaInfo getValidacionCadena() {
        return validacionCadena;
    }

    /**
     * Sets the value of the validacionCadena property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidacionCadenaInfo }
     *     
     */
    public void setValidacionCadena(ValidacionCadenaInfo value) {
        this.validacionCadena = value;
    }

}
