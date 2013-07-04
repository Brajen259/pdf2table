/*
    Copyright 2005, 2005 Burcu Yildiz
    Contact: burcu.yildiz@gmail.com
    
    This file is part of pdf2table.
*/

package pdf2xml;

import java.util.*;

public class Table {


 Vector columns;
 int page;
 int datarow_begin;
 String title = "";
 
 public Table() {
   this.columns = new Vector();
 } 	
 
 public Object clone() {
   Table t = new Table();
   t.columns = (Vector) this.columns.clone();
   t.page = this.page;
   t.datarow_begin = this.datarow_begin;	
   return t;
 }	
}