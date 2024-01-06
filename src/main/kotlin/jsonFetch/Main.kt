package jsonFetch

import jsonFetch.viewmodel.*

fun main() {
    RdsViewModel().getDataList()
    RdsViewModel().sendPostRequest(count = 55)
}