//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.19 at 03:36:18 PM CEST 
//


package es.caib.signatura.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoExternoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Result" minOccurs="0"/>
 *         &lt;element ref="{http://www.caib.es.signatura.custodia}ResultadoFirmas" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accion",
    "fecha",
    "usuario",
    "nombreDocumento",
    "codigoExternoDocumento",
    "result",
    "resultadoFirmas"
})
@XmlRootElement(name = "ResultadoInformeAccion", namespace = "http://www.caib.es.signatura.custodia")
public class ResultadoInformeAccion {

    @XmlElement(name = "Accion", namespace = "http://www.caib.es.signatura.custodia", required = true)
    protected String accion;
    @XmlElement(name = "Fecha", namespace = "http://www.caib.es.signatura.custodia", required = true)
    protected String fecha;
    @XmlElement(name = "Usuario", namespace = "http://www.caib.es.signatura.custodia", required = true)
    protected String usuario;
    @XmlElement(name = "NombreDocumento", namespace = "http://www.caib.es.signatura.custodia", required = true)
    protected String nombreDocumento;
    @XmlElement(name = "CodigoExternoDocumento", namespace = "http://www.caib.es.signatura.custodia", required = true)
    protected String codigoExternoDocumento;
    @XmlElement(name = "Result")
    protected Result result;
    @XmlElement(name = "ResultadoFirmas", namespace = "http://www.caib.es.signatura.custodia")
    protected ResultadoFirmas resultadoFirmas;

    /**
     * Gets the value of the accion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccion() {
        return accion;
    }

    /**
     * Sets the value of the accion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccion(String value) {
        this.accion = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the nombreDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    /**
     * Sets the value of the nombreDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDocumento(String value) {
        this.nombreDocumento = value;
    }

    /**
     * Gets the value of the codigoExternoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExternoDocumento() {
        return codigoExternoDocumento;
    }

    /**
     * Sets the value of the codigoExternoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExternoDocumento(String value) {
        this.codigoExternoDocumento = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultadoFirmas property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoFirmas }
     *     
     */
    public ResultadoFirmas getResultadoFirmas() {
        return resultadoFirmas;
    }

    /**
     * Sets the value of the resultadoFirmas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoFirmas }
     *     
     */
    public void setResultadoFirmas(ResultadoFirmas value) {
        this.resultadoFirmas = value;
    }

}
