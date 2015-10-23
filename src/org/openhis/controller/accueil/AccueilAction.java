package org.openhis.controller.accueil;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AccueilAction extends Action{

	public AccueilAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		AccueilForm aform=(AccueilForm)form;
		if(aform.getPatient().getAge().equals("")){
			aform.getPatient().setAge(your_age(aform.getBirthday_day(),aform.getBirthday_Month(),aform.getBirthday_Year())+"");
			aform.getPatient().setDate_naissance(aform.getBirthday_day()+"/"+aform.getBirthday_Month()+"/"+aform.getBirthday_Year());
			System.out.println(aform.getPatient().getDate_naissance());
		}
		else{
			aform.getPatient().setDate_naissance("01/01/"+(new Date().getYear()+1900-Integer.parseInt(aform.getPatient().getAge())));
		}
		request.setAttribute("patient", aform.getPatient());
		return mapping.findForward("success");
	}
	public int your_age(String date,String month,String year){
		/*SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date naiss=null;
		try {
			naiss = format.parse(naissance);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Calendar dob = Calendar.getInstance();  
		dob.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(date));
		//dob.setTime(naiss);  
		Calendar today = Calendar.getInstance();  
		int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);  
		if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
		  age--;  
		} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
		    && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
		  age--;  
		}
		return age;
	}
 
}
