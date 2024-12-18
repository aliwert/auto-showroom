package com.alimert.controller.impl;


import com.alimert.controller.BaseController;
import com.alimert.controller.IAuthenticationController;
import com.alimert.controller.RootEntity;
import com.alimert.dto.AuthRequest;
import com.alimert.dto.AuthResponse;
import com.alimert.dto.DtoUser;
import com.alimert.dto.RefreshTokenRequest;
import com.alimert.service.IAuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationControllerImpl extends BaseController implements IAuthenticationController {

    @Autowired
    public IAuthenticationService authenticationService;

    @PostMapping("/register")
    @Override
    public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest authRequest) {
        return ok(authenticationService.register(authRequest));
    }

    @PostMapping("/authenticate") // must be same on security config
    @Override
    public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest authRequest) {
        return ok(authenticationService.authenticate(authRequest));
    }

    @PostMapping("/refreshtoken")
    @Override
    public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest tokenRequest) {
        return ok(authenticationService.refreshToken(tokenRequest));
    }
}
