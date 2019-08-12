$(function () {
    var regurl = "/user/regoperation";
    $(".submit").click(function () {
        var loginacct = $("#loginacct").val();
        var userpswd  = $("#userpswd").val();
        var email = $("#email").val();
        if ((email == null || email == "")
            ||(loginacct == null || loginacct == "")
            ||(userpswd == null || userpswd == "")){
            alert("参数不能为空");
            $(".submit").attr("href","reg");
        }else {
            $.ajax({
                url:regurl,
                type:"POST",
                data:{
                    loginacct:loginacct,
                    userpswd:userpswd,
                    email:email
                },
                success:function (data) {
                    if (data.success){
                        window.location.href="/user/login";
                    }else {
                        window.location.href="/user/reg";
                        alert("注册失败");
                    }
                },
                error:function (e) {
                    window.location.href="/user/reg";
                    alert("注册失败");
                }

            })
        }
    })
    $("#loginacct").change(function () {
        $(".tip").html("");
        $.getJSON("/user/checkuserexist?loginacct="+$("#loginacct").val(),function (data) {
            if (data.success){
                $(".tip").html(data.msg);
                $(".tip").css("color","red");
            }
        })
    })
})