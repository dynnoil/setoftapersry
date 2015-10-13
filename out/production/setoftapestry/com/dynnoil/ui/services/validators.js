/**
 * Created by krukov on 10.10.2015.
 */
Tapestry.Validator = {

    hasdigit : function(field, message, spec) {
        field.addValidator(function(value) {
            if (value < spec.min) {
                throw message;
            }
        });
    }
};