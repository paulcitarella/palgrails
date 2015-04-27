class UrlMappings {

    static mappings = {
        /*
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        */

        "/"(view:"/index")
        "/hashtags/$handle"(controller:'HashTag', action:'index', method:'GET') { format = 'json' }

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
