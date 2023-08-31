import request from '@/utils/request'

// 查询留言列表
export function listMessage(query) {
  return request({
    url: '/business/message/list',
    method: 'get',
    params: query
  })
}

// 查询留言所有列表
export function listAllMessage(query) {
  return request({
    url: '/business/message/listAll',
    method: 'get',
    params: query
  })
}

// 查询留言详细
export function getMessage(id) {
  return request({
    url: '/business/message/getInfo/' + id,
    method: 'get'
  })
}

// 新增留言
export function addMessage(data) {
  return request({
    url: '/business/message/add',
    method: 'post',
    data: data
  })
}

// 修改留言
export function updateMessage(data) {
  return request({
    url: '/business/message/edit',
    method: 'post',
    data: data
  })
}

// 删除留言
export function delMessage(id) {
  return request({
    url: '/business/message/remove/' + id,
    method: 'get'
  })
}
