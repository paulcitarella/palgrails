var palApp = angular.module('pal', []);

palApp.controller('HashTagController',
        [ '$scope', '$http', function($scope, $http) {

    $scope.handle = 'HubSpot';
    
    $scope.calc = function() {
        $scope.hashtags = null;
        $scope.error = false;
        $scope.loading = true;

        $http.get('/hashtags/' + $scope.handle).success(function(data, status, headers, config) {
            $scope.hashtags = data;
            $scope.loading = false;
        }).error(function(data, status, headers, config) {
            $scope.error = true;
            $scope.loading = false;
        });
    };
}]);
