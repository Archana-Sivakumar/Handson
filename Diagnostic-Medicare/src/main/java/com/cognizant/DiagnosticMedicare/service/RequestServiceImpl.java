package com.cognizant.DiagnosticMedicare.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.DiagnosticMedicare.model.Doctor;
import com.cognizant.DiagnosticMedicare.model.Medicare;
import com.cognizant.DiagnosticMedicare.model.Patient;
import com.cognizant.DiagnosticMedicare.model.Request;
import com.cognizant.DiagnosticMedicare.repository.DoctorRepository;
import com.cognizant.DiagnosticMedicare.repository.MedicareRepository;
import com.cognizant.DiagnosticMedicare.repository.PatientRepository;
import com.cognizant.DiagnosticMedicare.repository.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService{

	
	@Autowired
	RequestRepository requestRepository;
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	MedicareRepository medicareRepository;
	
	@Autowired
	DoctorRepository doctorRepository;
	
	
	@Override
	public boolean acceptRequest(Request request) {
		requestRepository.save(request);
		return true;
	}
	
	
	@Override
	public boolean addRequest(Request request) {
		
		/*String username=request.getCustomerName();
		int medicareServiceId=request.getMediServiceId();
		
		Patient patient = patientRepository.findByUsername(username);
        Set<Medicare> medicareList = new HashSet<Medicare>();
        medicareList = patient.getMedicareList();
        Medicare oneMedicare = medicareRepository.findById(medicareServiceId).get();
        
        if(medicareList.size() == 0) {
               medicareList.add(oneMedicare);
               patient.setMedicareList(medicareList);
               patientRepository.save(patient);
               return true;
        }else {
               int flag = 0;
               for(Medicare itr : medicareList) {
                     if(itr.getId() == medicareServiceId) {
                            flag = 1;
                            break;
                     }
               }
               if(flag == 0) {
                     medicareList.add(oneMedicare);
                     patient.setMedicareList(medicareList);;
                     patientRepository.save(patient);
                     return true;
               }else {
                     return false;
               }
                     
        }*/
System.out.println(request+"REQUEST POJOOOOOOOO***");
		requestRepository.save(request);
		return true;
		
	}

	@Override
	public List<Request> adminRequest() {
		
		return requestRepository.adminRequest();
	}

	@Override
	public List<Request> doctorRequest() {
		
		return requestRepository.doctorRequest();
	}

	@Override
	public List<Request> customerRequest(int customerId) {
		
		return requestRepository.customerRequest(customerId);
	}

	public Request getOneRequest(int id) {
		 return requestRepository.findById(id).get();
	}
	@Override
	public Patient getOneCustomer(String customerName) {
		return patientRepository.findByUsername(customerName);
	}
	
	@Override
	public boolean bookAppointment(Request request) {
		requestRepository.save(request);
		return true;
	}


	@Override
	public Doctor getOneDoctor(int doctorId) {
		
		return doctorRepository.findById(doctorId).get();
	}
}
