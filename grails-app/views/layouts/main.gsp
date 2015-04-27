<!DOCTYPE html>
<g:if test="${pageProperty(name:'body.ng-app').length() > 0}">
    <html lang="en" ng-app="${raw(pageProperty(name:'body.ng-app'))}">
</g:if>
<g:else>
    <html lang="en">
</g:else>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="Hashtag palindrome calculator">
    <meta name="author" content="Paul Citarella">

    <title><g:layoutTitle default="Hashtag Palindrome Calculator"/></title>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <asset:stylesheet src="application.css" />
    <asset:javascript src="application.js" />
    <g:layoutHead/>
</head>

<body>
    <div class="site-wrapper">
        <div class="site-wrapper-inner">
            <div class="cover-container">
                <div class="inner cover">
                    <g:layoutBody/>
                </div>
                <div class="mastfoot">
                    <div class="inner">
                        <p>&copy; 2015 Your Name Here.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>
