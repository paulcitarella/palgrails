package com.palgrails

class HashTagController {

    def index() {
        
    }

    long getPalCount(str) {
        def lstr = str?.toLowerCase()?.replaceAll('\\W','')
        if (!lstr) return 0
        Math.pow(lstr.collect().unique().size(), Math.ceil(lstr.size()/2))
    }
}
