package com.boci.PrintPDF;

import org.apache.pdfbox.PrintPDF;

/**
 * 
 * @author Clare
 * @company Formssi
 *
 *use PDFBOX jar to print PDF
 *https://pdfbox.apache.org/index.html
 */
public class PrintPdfPlugin {
	
	
	    public static void main(String[] args) throws Exception {
	        //pdf�ļ�ȫ·��
	        String pdfPath = "D:\\1.4.pdf";
	        
	        String printer = "HP LaserJet P2050 Series PCL6";

	        //--silentPrint����Ĭ��ӡ
	        PrintPDF.main(new String[]{"-silentPrint","-printerName",printer,"-orientation","auto",pdfPath});
	    }
	
}
