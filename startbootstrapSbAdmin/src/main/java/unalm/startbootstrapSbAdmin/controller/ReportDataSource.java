package unalm.startbootstrapSbAdmin.controller;


import java.util.Collection;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class ReportDataSource implements JRDataSource {

  private Object[] data;    

 private int index = -1;
 
 public ReportDataSource(Collection data) {
  super();
  this.data = data.toArray();
 }
 
 public ReportDataSource(Object[] data) {
  super();
  this.data = data;
 }

  public Object[] getData() {
  return data;
 }

  public void setData(Object[] data) {
  this.data = data;
 }

  public Object getFieldValue(JRField field) throws JRException {
  return (((Map)data[index]).get(field.getName()));
 }

  public boolean next() throws JRException {
  index++;
  return (index < data.length);
 }
 
 public void reset() throws JRException {
         data = null;
   }
}