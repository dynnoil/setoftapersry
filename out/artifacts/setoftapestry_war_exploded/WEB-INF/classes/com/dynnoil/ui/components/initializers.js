/**
 * Created by krukov on 16.10.2015.
 */

T5.extendInitializers({
    replaceContent: function (spec) {
        $(spec.id).update(spec.newContent);
    }
})