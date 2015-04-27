package com.palgrails

import grails.converters.*

class HashTagController {

    def twitterService

    def index(String handle) {
        def tags = twitterService.getHashTags(handle)
        def counts = []
        tags.each { counts << [tag:it, count:getPalCount(it)] }

        render counts as JSON
    }

    long getPalCount(str) {
        def lstr = str?.toLowerCase()?.replaceAll('\\W','')
        if (!lstr) return 0
        Math.pow(lstr.collect().unique().size(), Math.ceil(lstr.size()/2))
    }
}
