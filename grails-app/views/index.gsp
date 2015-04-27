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
            <div class="cover-heading">@<input type="text" ng-model="handle" class="form-control-trans" autofocus /><button type="submit" ng-disabled="loading" class="btn btn-lg btn-default">Go!</button></div>
        </form>

        <div class="tag-list">
            <ul>
                <li ng-repeat="item in hashtags">{{item.tag}}, {{item.count}}</li>
            </ul>
        </div>
    </div>
</body>

</html>
