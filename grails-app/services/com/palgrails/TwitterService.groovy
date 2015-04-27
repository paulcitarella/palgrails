package com.palgrails

import grails.transaction.Transactional

@Transactional
class TwitterService {

    List getHashTags(String handle) {
        return []
    }
}
