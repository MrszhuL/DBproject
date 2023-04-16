import request from '@/utils/request'

// 查询零件表P列表
export function listP(query) {
  return request({
    url: '/spj/P/list',
    method: 'get',
    params: query
  })
}

// 查询零件表P详细
export function getP(pno) {
  return request({
    url: '/spj/P/' + pno,
    method: 'get'
  })
}

// 新增零件表P
export function addP(data) {
  return request({
    url: '/spj/P',
    method: 'post',
    data: data
  })
}

// 修改零件表P
export function updateP(data) {
  return request({
    url: '/spj/P',
    method: 'put',
    data: data
  })
}

// 删除零件表P
export function delP(pno) {
  return request({
    url: '/spj/P/' + pno,
    method: 'delete'
  })
}
