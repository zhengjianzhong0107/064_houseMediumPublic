import request from '@/utils/request'

export function statistics() {
  return request({
    url: '/business/house/statistics',
    method: 'get'
  })
}
export function listLocation() {
  return request({
    url: '/profilemeta/location',
    method: 'get'
  })
}
// 查询房屋列表
export function listHouse(query) {
  return request({
    url: '/business/house/list',
    method: 'get',
    params: query
  })
}

// 查询房屋所有列表
export function listAllHouse(query) {
  return request({
    url: '/business/house/listAll',
    method: 'get',
    params: query
  })
}

// 查询房屋详细
export function getHouse(id) {
  return request({
    url: '/business/house/getInfo/' + id,
    method: 'get'
  })
}

// 新增房屋
export function addHouse(data) {
  return request({
    url: '/business/house/add',
    method: 'post',
    data: data
  })
}

// 修改房屋
export function updateHouse(data) {
  return request({
    url: '/business/house/edit',
    method: 'post',
    data: data
  })
}

// 删除房屋
export function delHouse(id) {
  return request({
    url: '/business/house/remove/' + id,
    method: 'get'
  })
}
