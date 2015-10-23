package org.openhis.controller.accueil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.openhis.entites.Patient;

public class EditAction extends Action{

	public EditAction() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		EditForm eform=(EditForm)form;
		Patient p=(Patient)request.getSession().getAttribute("patient");
		EntityManager em=Persistence.createEntityManagerFactory("openhisPU").createEntityManager();
		p=em.find(Patient.class, p.getId());
		em.getTransaction().begin();
		p.setAdresse(eform.getPatient().getAdresse());
		p.setAge(""+your_age(eform.getPatient().getDate_naissance()));
		p.setCode_postale(eform.getPatient().getCode_postale());
		p.setDate_naissance(eform.getPatient().getDate_naissance());
		p.setNom(eform.getPatient().getNom());
		p.setNum_telephone(eform.getPatient().getNum_telephone());
		p.setPays(eform.getPatient().getPays());
		p.setPrenom(eform.getPatient().getPrenom());
		p.setSexe(eform.getPatient().getSexe());
		p.setVille(eform.getPatient().getVille());
		em.getTransaction().commit();
		request.getSession().setAttribute("patient", p);
		return mapping.getInputForward();
	}
	public int your_age(String naissance){
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date naiss=null;
		try {
			naiss = format.parse(naissance);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar dob = Calendar.getInstance();  
		dob.setTime(naiss);  
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
