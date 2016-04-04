/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vogtJavaEE;

/**
 *
 * @author AQLMAOBCQ
 */

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Customer
{
  @XmlElement(name="firstname")
  private String name;
  private String last;
  
  public Customer() {}
  
  public Customer(String name, String last)
  {
    this.name = name;
    this.last = last;
  }
}