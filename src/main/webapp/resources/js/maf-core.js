/**
 * 
 */
var faIcon = {
    valid: 'fa fa-check-circle fa-lg text-success',
    invalid: 'fa fa-times-circle fa-lg',
    validating: 'fa fa-refresh'
}

function GetDateUTCMillisecond()
{
    var d = new Date();
    return d.getTime();
}
function strSubS(str)
{
    if (str != null)
    {
        if (str.trim().replace('&nbsp;', '').length > 50)
        {
            return str.trim().replace('&nbsp;', '').substring(0, 50) + '..';
        }
    }
    return str;
}
function AsyncPst(url, data,  fnc, btn)
{
    var jqIECachedelTerror = '?jqIECache=' + GetDateUTCMillisecond();
    $(btn).niftyOverlay('show');
    $.post(url + jqIECachedelTerror, data, function (p) {
        $(btn).niftyOverlay('hide');
        fnc(p);
    }).done; (function () {
        $('#content-container').niftyOverlay('hide');
    });

}
function AsyncGt(url, data, fnc) {
    var jqIECachedelTerror = '?jqIECache=' + GetDateUTCMillisecond();
    $('#content-container').niftyOverlay('show');
    $.get(url + jqIECachedelTerror, data, function (p) {
        fnc(p);
    }).done; (function () {
        $('#content-container').niftyOverlay('hide');
    });
}
$.postify = function(value) {
    var result = {};
 
    var buildResult = function(object, prefix) {
        for (var key in object) {
 
            var postKey = isFinite(key)
                ? (prefix != "" ? prefix : "") + "[" + key + "]"
                : (prefix != "" ? prefix + "." : "") + key;
 
            switch (typeof (object[key])) {
                case "number": case "string": case "boolean":
                    result[postKey] = object[key];
                    break;
 
                case "object":
                    if (object[key].toUTCString)
                        result[postKey] = object[key].toUTCString().replace("UTC", "GMT");
                    else {
                        buildResult(object[key], postKey != "" ? postKey : key);
                    }
            }
        }
    };
 
    buildResult(value, "");
 
    return result;
};