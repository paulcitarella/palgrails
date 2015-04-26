<!doctype html>
<html>

<head>
    <meta name="layout" content="main"/>
    <title>Hashtag Palindrome Calculator</title>
    <asset:javascript src="ng-pal.js" />
</head>

<body ng-app="pal">
    <div ng-controller="HashTagController">
        <form class="form-inline" ng-submit="calc()">
            <div class="cover-heading">@<input type="text" class="form-control-trans" value="JoeSmith" /><button type="submit" class="btn btn-lg btn-default">Go!</button></div>
        </form>
    </div>
</body>

</html>
