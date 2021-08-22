package com.myProject.restEasyFoodOrder.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myProject.restEasyFoodOrder.Common.CommonBusinessService;
import com.myProject.restEasyFoodOrder.Common.UnexpectedException;
import com.myProject.restEasyFoodOrder.Common.Exception.SignUpException;
import com.myProject.restEasyFoodOrder.Common.Exception.UserNotFoundException;
import com.myProject.restEasyFoodOrder.Model.Admin;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Model.Orders;
import com.myProject.restEasyFoodOrder.Model.Response.SignInResponse;
import com.myProject.restEasyFoodOrder.Model.Response.SignUpUserRequest;
import com.myProject.restEasyFoodOrder.Model.Response.SignUpUserResponse;
import com.myProject.restEasyFoodOrder.Model.Response.UserDeleteResponse;
import com.myProject.restEasyFoodOrder.Service.AdminService;
import com.myProject.restEasyFoodOrder.Service.CustomerService;


@RestController
@RequestMapping("/")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CommonBusinessService commonBusinessService;
	
	@Autowired
	private CustomerService customerService;
	
	/*
	@GetMapping("/Admin")
	public List<Order> list() {
		return customerService.listAllOrders();
	} 
	
	@GetMapping("/Admin/Display-User/{id}")
	public ResponseEntity<Admin> get(@PathVariable Integer id) {
		try {
			Admin userDetail = adminService.get(id);
			return new ResponseEntity<Admin>(userDetail, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	} */
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
/*
	@PostMapping("/Admin/Register")
	//Endpoint to register a new user
    @RequestMapping(method = RequestMethod.POST, path = "/Admin/Register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SignUpUserResponse> signup(final SignUpUserRequest signupUserRequest) throws SignUpException {

        final Admin userEntity = new Admin();

        userEntity.setVendor(signupUserRequest.getVendor());
        userEntity.setCustomer(signupUserRequest.getCustomer());
        userEntity.setUserName(signupUserRequest.getUserName());
        userEntity.setPassword(signupUserRequest.getPassword());
        
        final Admin createdUserEntity = commonBusinessService.signup(userEntity);
        SignUpUserResponse userResponse = new SignUpUserResponse().id(createdUserEntity.getId()).status("USER SUCCESSFULLY REGISTERED");
        return new ResponseEntity<SignUpUserResponse>(userResponse, HttpStatus.CREATED);

    } */
	/*
	
	//Endpoint for user signin 
    @RequestMapping(method = RequestMethod.POST, path = "/Admin/SignIn", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SignInResponse> signin(@RequestHeader("authorization") final String authorization) throws UnexpectedException {

        final Admin userSigninEntity = commonBusinessService.signin(authorization);
        Admin user = userSigninEntity.getUser();
        SignInResponse authorizedUserResponse = new SignInResponse().id(user.getId()).message("SIGNED IN SUCCESSFULLY");
        HttpHeaders headers = new HttpHeaders();
        headers.add("access-token", userSigninEntity.getAccessToken());
        return new ResponseEntity<SignInResponse>(authorizedUserResponse, headers, HttpStatus.OK);
    }

    //Method to signout the user of the Application
    //The Methods disables the user access to any other endpoints once signedout of Application
    @RequestMapping(method = RequestMethod.POST, path = "/user/signout", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public ResponseEntity<SignoutResponse> signout(@RequestHeader("authorization") final String authorization) throws SignOutRestrictedException {

        final UserAuthEntity userAuthEntity = signoutBusinessService.validateUserSignIn(authorization);
        userAuthEntity.setLogoutAt(ZonedDateTime.now());
        signoutBusinessService.updateLogouttime(userAuthEntity);
        UserEntity userEntity = userAuthEntity.getUser();
        SignoutResponse signoutResponse = new SignoutResponse().id(userEntity.getUuid()).message("SIGNED OUT SUCCESSFULLY");
        return new ResponseEntity<SignoutResponse>(signoutResponse, HttpStatus.OK);
    }
	
    /*
    private SignUpUserRequest getPassword() {
		// TODO Auto-generated method stub
		return null;
	} */

/*
	//Method to delete the User.
    @RequestMapping(method = RequestMethod.DELETE, path = "/Admin/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDeleteResponse> deleteUser(@PathVariable("id") final Integer userID) throws UserNotFoundException {

        final Admin deletedUser = adminService.delete(userID);

        UserDeleteResponse userResponse = new UserDeleteResponse().id(deletedUser.getId()).status("USER SUCCESSFULLY DELETED");
        return new ResponseEntity<UserDeleteResponse>(userResponse, HttpStatus.OK);
    }
    */
	
	@GetMapping("/Admin")
	public List<Orders> list() {
		return customerService.listAllOrders();
	}
	
	@RequestMapping(value = "/Admin/Register", produces = "application/json", method = RequestMethod.POST)
	public Admin add(@RequestBody Admin userDetail) {
		try {
			
			return adminService.save(userDetail);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@PutMapping("/Admin/update-{id}")
	public ResponseEntity<?> update(@RequestBody Admin userDetail, @PathVariable Integer id) {
		try {
			Admin existUser = adminService.get(id);
			adminService.save(userDetail);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("Admin/{id}")
	public void delete(@PathVariable Integer id) {
		adminService.delete(id);
	} 

}
