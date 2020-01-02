package com.cognizant.DiagnosticMedicare;

import static org.junit.jupiter.api.Assertions.*;


import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cognizant.DiagnosticMedicare.exception.UserAlreadyExistsException;
import com.cognizant.DiagnosticMedicare.model.Admin;
import com.cognizant.DiagnosticMedicare.model.Agent;
import com.cognizant.DiagnosticMedicare.model.Doctor;
import com.cognizant.DiagnosticMedicare.model.Patient;
import com.cognizant.DiagnosticMedicare.model.Role;
import com.cognizant.DiagnosticMedicare.model.Users;
import com.cognizant.DiagnosticMedicare.repository.AdminRepository;
import com.cognizant.DiagnosticMedicare.repository.AgentRepository;
import com.cognizant.DiagnosticMedicare.repository.DoctorRepository;
import com.cognizant.DiagnosticMedicare.repository.PatientRepository;
import com.cognizant.DiagnosticMedicare.repository.UserRepository;
import com.cognizant.DiagnosticMedicare.security.AppUserDetailsService;
import com.cognizant.DiagnosticMedicare.service.SignUpService;

@SpringBootTest
class DiagnosticMedicareApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	AppUserDetailsService appUserDetailsService;
	
	@MockBean
	AdminRepository adminRepository;
	
	@MockBean
	DoctorRepository doctorRepository;
	
	@MockBean
	PatientRepository patientRepository;
	
	@MockBean
	AgentRepository agentRepository;
	
	
	@MockBean
	UserRepository repository;

	@Autowired
    SignUpService signUpService;
	
	@Autowired
	PasswordEncoder bCryptPasswordEncoder;
	
	
	@Test
	public void testLoginUserByUsername() {

		Mockito.when(repository.findByUsername("admin")).thenReturn(createUser());
		UserDetails user = appUserDetailsService.loadUserByUsername("admin");
        assertDoesNotThrow(() -> user);
		String expected = "admin";
		assertEquals(expected, user.getUsername());
	}

	

	@Test
	public void testLoadByUserNameNotFoundException() throws UsernameNotFoundException {
		
		Mockito.when(repository.findByUsername("abc")).thenReturn(null);
        assertThrows(UsernameNotFoundException.class,()->appUserDetailsService.loadUserByUsername("abc"));
	
	}
	
	@Test
	public void testvoidSignupDoctor() {

		
		Doctor doctor = createDoctor();
		Mockito.when(doctorRepository.findByUserName(doctor.getUserName())).thenReturn(null);
		System.out.println(doctor+"***");
		assertDoesNotThrow(() -> signUpService.doctorSignup(doctor));
		
	}

	
	@Test
	public void testvoidSignupPatient() {

		
		Patient patient = createPatient();
		Mockito.when(patientRepository.findByUsername(patient.getUsername())).thenReturn(null);
		System.out.println(patient+"***");
		assertDoesNotThrow(() -> signUpService.patientSignup(patient));
		
	}

	
	@Test
	public void testvoidSignupAdmin() {

		
		Admin admin = createAdmin();
		Mockito.when(adminRepository.findByUsername(admin.getUsername())).thenReturn(null);
		System.out.println(admin+"***");
		assertDoesNotThrow(() -> signUpService.adminSignup(admin));
		
	}
	
	@Test
	public void testvoidSignupAgent() {

		
		Agent agent = createAgent();
		Mockito.when(agentRepository.findByUsername(agent.getUsername())).thenReturn(null);
		System.out.println(agent+"***");
		assertDoesNotThrow(() -> signUpService.agentSignup(agent));
		
	}

	
	@Test
	public void adminUserAlreadyExistsException() throws UserAlreadyExistsException {
		
		Admin admin = createAdmin();
		Mockito.when(adminRepository.findByUsername(admin.getUsername())).thenReturn(admin);
		assertThrows(UserAlreadyExistsException.class,()->signUpService.adminSignup(admin));
			
	}
	
	@Test
	public void doctorUserAlreadyExistsException() throws UserAlreadyExistsException {
		
		Doctor doctor = createDoctor();
		Mockito.when(doctorRepository.findByUserName(doctor.getUserName())).thenReturn(doctor);
		assertThrows(UserAlreadyExistsException.class,()->signUpService.doctorSignup(doctor));
	}
	
	@Test
	public void patientUserAlreadyExistsException() throws UserAlreadyExistsException {
		
		Patient patient = createPatient();
		Mockito.when(patientRepository.findByUsername(patient.getUsername())).thenReturn(patient);
		assertThrows(UserAlreadyExistsException.class,()->signUpService.patientSignup(patient));
			
	}
	
	@Test
	public void agentUserAlreadyExistsException() throws UserAlreadyExistsException {
		
		Agent agent = createAgent();
		Mockito.when(agentRepository.findByUsername(agent.getUsername())).thenReturn(agent);
		assertThrows(UserAlreadyExistsException.class,()->signUpService.agentSignup(agent));
			
	}
	
	
	public Users createUser() {

		Role role = new Role(0,"ADMIN");
		Users newUser = new Users();
		newUser.setId(1);
		newUser.setUsername("admin");
		newUser.setPassword(bCryptPasswordEncoder.encode("admin"));
		newUser.setRole(role);
		return newUser;
	}
	
	public Admin createAdmin() {
		Admin newAdmin = new Admin();
		newAdmin.setAge(23);
		newAdmin.setAltContactNumber(3421546578L);
		newAdmin.setContactNumber(3421546578L);
		newAdmin.setDateOfBirth("08/05/1992");
		newAdmin.setEmailId("abc@gmail.com");
		newAdmin.setFirstName("admin");
		newAdmin.setGender("male");
		newAdmin.setId(1);
		newAdmin.setLastName("admin");
		newAdmin.setPassword(bCryptPasswordEncoder.encode("admin"));
		newAdmin.setUsername("admin");
	
		Users newUser = new Users();
		newUser.setUsername("admin");
		
		newUser.setPassword(bCryptPasswordEncoder.encode("admin"));
		Role role = new Role(0, "ADMIN");
		newUser.setRole(role);
		newAdmin.setUser(newUser);
	
		return newAdmin;
	}
	
	public Agent createAgent() {
		Agent newAgent = new Agent();
		newAgent.setAge(23);
		newAgent.setAltContactNumber(3421546578L);
		newAgent.setContactNumber(3421546578L);
		newAgent.setDateOfBirth("08/05/1992");
		newAgent.setEmailId("abc@gmail.com");
		newAgent.setFirstName("agent");
		newAgent.setGender("male");
		newAgent.setId(1);
		newAgent.setLastName("agent");
		newAgent.setPassword(bCryptPasswordEncoder.encode("agent"));
		newAgent.setUsername("agent");
	
		Users newUser = new Users();
		newUser.setUsername("agent");
		
		newUser.setPassword(bCryptPasswordEncoder.encode("agent"));
		Role role = new Role(0, "AGENT");
		newUser.setRole(role);
		newAgent.setUser(newUser);
	
		return newAgent;
	}
	
	
	public Doctor createDoctor() {
		Doctor newDoctor = new Doctor();
		
	    newDoctor.setAddressLineOne(null);
	    newDoctor.setAddressLineTwo(null);
	    newDoctor.setAge(21);
	    newDoctor.setAltContactNumber(43323);
	    newDoctor.setCity(null);
	    newDoctor.setContactNumber(3545567);
	    newDoctor.setDateOfBirth(null);
	    newDoctor.setEmailId(null);
	    newDoctor.setFirstName(null);
	    newDoctor.setGender(null);
	    newDoctor.setDoctorId(1);
	    newDoctor.setLastName(null);
	    newDoctor.setPassword(bCryptPasswordEncoder.encode("doctor"));
	    newDoctor.setSecurityQuestion(null);
	    newDoctor.setSecurityAnswer(null);
	    newDoctor.setState(null);
	    newDoctor.setUserName("doctor");
	    newDoctor.setZipcode(436657);
	    newDoctor.setDegree(null);
	    newDoctor.setSpeciality(null);
	    newDoctor.setHospitalName(null);
	    newDoctor.setWorkhours(3);
	    newDoctor.setMedicareList(null);
	 
		Users newUser = new Users();
		newUser.setUsername("doctor");
		newUser.setPassword(bCryptPasswordEncoder.encode("doctor"));
		Role role = new Role(0, "DOCTOR");
		newUser.setRole(role);
		newDoctor.setUser(newUser);
		return newDoctor;
	}
	
	public Patient createPatient() {
		Patient newPatient = new Patient();
		
		newPatient.setAddressLineOne(null);
		newPatient.setAddressLineTwo(null);
		newPatient.setAge(21);
		newPatient.setAltContactNumber(43323);
		newPatient.setCity(null);
		newPatient.setContactNumber(3545567);
		newPatient.setDateOfBirth(null);
		newPatient.setEmailId(null);
		newPatient.setFirstName(null);
		newPatient.setGender(null);
		newPatient.setId(1);
		newPatient.setLastName(null);
		newPatient.setPassword(bCryptPasswordEncoder.encode("patient"));
		newPatient.setSecurityQuestion(null);
		newPatient.setSecurityAnswer(null);
		newPatient.setState(null);
		newPatient.setUsername("patient");
		newPatient.setZipcode(436657);
	    
	 
		Users newUser = new Users();
		newUser.setUsername("patient");
		newUser.setPassword(bCryptPasswordEncoder.encode("patient"));
		Role role = new Role(0, "PATIENT");
		newUser.setRole(role);
		newPatient.setUser(newUser);
		return newPatient;
	}
}
