package controllers;

import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result plus(String num1, String num2) {
        Integer answer = Integer.valueOf(num1) + Integer.valueOf(num2);
        return ok(answer.toString());
    }

    public static Result minus(String num1, String num2) {
        Integer answer = Integer.valueOf(num1) - Integer.valueOf(num2);
        return ok(answer.toString());
    }

    public static Result submit() {
        // Les DynamicForm sont un moyen rapide d'accéder aux données d'un formulaire
        // pas besoin de validation
        DynamicForm form = new DynamicForm().bindFromRequest();
        return ok("Requete: " + form.get("query"));
    }

}
