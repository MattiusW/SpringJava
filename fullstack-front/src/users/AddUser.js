import React from 'react'

export default function AddUser() {
  return (
    <div className="cointainer">
      <div className='row'>
        <div className='col-md-6 offset-md-3 border rounded p-4 mt-2'>
          <h2 className='text-center m-4'>Register User</h2>
          <div className='mb-3'>
            <label htmlFor="Name" className="form-label">
              Name
            </label>
            <input
              type={"text"}
              className="form-control"
              placeholder="Enter your name"
              name="name"
              />
               <div className='mb-3'>
            <label htmlFor="UserName" className="form-label">
              Username
            </label>
            <input
              type={"text"}
              className="form-control"
              placeholder="Enter your username"
              name="username"
              />
               <div className='mb-3'>
            <label htmlFor="Email" className="form-label">
              Email
            </label>
            <input
              type={"text"}
              className="form-control"
              placeholder="Enter your email address"
              name="email"
              />
          <button type="submit" className="btn btn-outline-primary">
            Submit
          </button>
          <button type="submit" className="btn btn-outline-danger mx-2">
            Cancel
          </button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}
