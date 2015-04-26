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
        "/hashtags/$handle"(method:'GET', controler:'HashTag', action:'index') { format = 'json' }

        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
