//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.25 at 12:37:19 PM EET 
//


package com.acc.soa.movies.app.SOAPEntities;

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
 *         &lt;element ref="{http://movies-soa.com/app}movies"/>
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
    "movies"
})
@XmlRootElement(name = "getPopularMovieResponse")
public class GetPopularMovieResponse {

    @XmlElement(required = true)
    protected Movies movies;

    /**
     * Gets the value of the movies property.
     * 
     * @return
     *     possible object is
     *     {@link Movies }
     *     
     */
    public Movies getMovies() {
        return movies;
    }

    /**
     * Sets the value of the movies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Movies }
     *     
     */
    public void setMovies(Movies value) {
        this.movies = value;
    }

}
