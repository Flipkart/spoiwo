package com.norbitltd.spoiwo.ss

import org.apache.poi.xssf.usermodel.XSSFWorkbook

trait Factory {

  lazy val defaultPOIWorkbook = new XSSFWorkbook()
  lazy val defaultPOISheet = defaultPOIWorkbook.createSheet()
  lazy val defaultPOIRow = defaultPOISheet.createRow(0)
  lazy val defaultPOICell = defaultPOIRow.createCell(0)
  lazy val defaultPOICellStyle = defaultPOIWorkbook.createCellStyle()
  lazy val defaultPOIFont = defaultPOIWorkbook.createFont()
  lazy val defaultPOIPrintSetup = defaultPOISheet.getPrintSetup

  def wrap[T](value : T, defaultValue : T) : Option[T] = if( value != defaultValue) {
    Option(value)
  } else {
    None
  }

}
