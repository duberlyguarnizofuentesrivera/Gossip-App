package com.duberlyguarnizo.gossipbackend.exceptions;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(AuthenticationException.class)
    public ProblemDetail handleWrongAuthCredentials(Exception e, WebRequest request) {
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatusCode.valueOf(401));
        if (e instanceof BadCredentialsException) {
            pd.setTitle("Wrong Credentials");
            pd.setDetail("Incorrect username or password");
        } else if (e instanceof DisabledException) {
            pd.setTitle("User is disabled");
            pd.setDetail("The user cannot sign-in because is disabled.");
        } else if (e instanceof LockedException) {
            pd.setTitle("User is locked");
            pd.setDetail("The user cannot sign-in because is locked.");
        } else {
            pd.setTitle("Authentication Exception");
            pd.setDetail("A non-managed exception has occurred. Check the logs.");
        }
        //TODO: add more custom properties to be managed by frontend and the remaining exceptions related to credentials
        return pd;
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ProblemDetail handleAccessDeniedException(Exception e, WebRequest request) {
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatusCode.valueOf(403));
        pd.setTitle("Access denied");
        pd.setDetail("You do not have the permissions to use request this resource.");
        //TODO: add more custom properties to be managed by frontend and the remaining exceptions related to credentials
        return pd;
    }

    @ExceptionHandler(NonExistentEntityException.class)
    public ProblemDetail handleNonExistingResourceException(Exception e,  WebRequest request){
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatusCode.valueOf(404));
        pd.setTitle("Resource not found");
        pd.setDetail(e.getMessage());
        //TODO: add more custom properties to be managed by frontend and the remaining exceptions related to credentials
        return pd;
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ProblemDetail handleIllegalArgumentException(Exception e,  WebRequest request){
        ProblemDetail pd = ProblemDetail.forStatus(HttpStatusCode.valueOf(400));
        pd.setTitle("Wrong argument");
        pd.setDetail(e.getMessage());
        //TODO: add more custom properties to be managed by frontend and the remaining exceptions related to credentials
        return pd;
    }


    //TODO: add org.springframework.security.access.AccessDeniedException
}
