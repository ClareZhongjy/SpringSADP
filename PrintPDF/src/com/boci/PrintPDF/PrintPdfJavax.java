package com.boci.PrintPDF; 

import java.io.File;

import java.io.FileInputStream;

import javax.print.Doc;

import javax.print.DocFlavor;

import javax.print.DocPrintJob;

import javax.print.PrintService;

import javax.print.PrintServiceLookup;

import javax.print.ServiceUI;

import javax.print.SimpleDoc;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.DocAttributeSet;

import javax.print.attribute.HashDocAttributeSet;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.Chromaticity;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.Finishings;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.NumberUp;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.SheetCollate;
import javax.print.attribute.standard.Sides;


/**
 * 
 *@author Clare
 *@Company 
 *
 *Print file by javax
 * 
 */

public class PrintPdfJavax {

	public static void main(String[] args) {

			File file = new File("D:/Archive/a.pdf"); // ��ȡѡ����ļ�

			// ������ӡ�������Լ�

			HashPrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();

			// ���ô�ӡ��ʽ����Ϊδȷ�����ͣ�����ѡ��autosense

			DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

			// �������еĿ��õĴ�ӡ����

			PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);
			System.out.println("-------------------All services-------------------");
			for(int i=0;i<printService.length;i++){
				System.out.println(printService[i]);
			}
			
			// ��λĬ�ϵĴ�ӡ����

			//PrintService service1 = PrintServiceLookup.lookupDefaultPrintService();
			if(printService.length>0){
				
				System.out.println("-------------------Choose Printer-------------------");
				System.out.println(printService[0]);
				//ָ��ʹ�� Microsoft XPS Document Writer
				PrintService service = printService[1];
				
				//��ȡ��ӡ������
				 AttributeSet attributes = service.getAttributes();
				 for (Attribute a : attributes.toArray()) {
		                String name = a.getName();
		                String value = attributes.get(a.getClass()).toString();
		                System.out.println(name + " : " + value);
		            }	 
			// ��ʾ��ӡ�Ի���

			//PrintService service = ServiceUI.printDialog(null, 200, 200, printService,

			//	service1, flavor, pras);

			if (service != null) {

				try {
					System.out.println("Begin Print PDF: "+file.getName());
					DocPrintJob job = service.createPrintJob(); // ������ӡ��ҵ
					
					FileInputStream fis = new FileInputStream(file); // �������ӡ���ļ���

					DocAttributeSet das = new HashDocAttributeSet();
					//����һ����ɫ��ӡ��
					//pras.add(Chromaticity.COLOR);
					
					//�������ģʽ
			        pras.add(OrientationRequested.LANDSCAPE);
			        
			        //����Letter��С��ֽ������
			        //pras.add(MediaSizeName.NA_LETTER);
			        
			        // European A4 paper
			        //pras.add(MediaSizeName.ISO_A4);
			        
			        //����װ��
			        //pras.add(Finishings.STAPLE);
			         
			        //����������
			        //pras.add(SheetCollate.COLLATED);
			         
			        //����˫��
			        //pras.add(Sides.DUPLEX);
			         
			        // 2ҳ��һ��������
			        //pras.add(new NumberUp(2));
			         
			        //���ٸ�����
			        //pras.add(new Copies(2));
							
					Doc doc = new SimpleDoc(fis, flavor, null);

					job.print(doc, pras);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}		
		}		
	}
}