/**
 * Created by krukov on 19.10.2015.
 */
Tapestry.Validator = {
    hasdigits : function(field, message) {
        var regexp = new RegExp('[a-zA-Z0-9]+');
        field.addValidator(function(value) {
           if (!regexp.test(value)) {
               throw message;
           }
        });
    }
};