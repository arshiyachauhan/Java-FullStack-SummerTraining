//adding event listener'
document.addEventListener('DOMContentLoaded', ()=>{
    const fetchUsersBtn= document.getElementById('fetchUserBtn');
    const loadingMessage= document.getElementById('loadingMessage');
    const errorMessage= document.getElementById('errorMessage');
    const userList= document.getElementById('userList');
    fetchUsersBtn.addEventListener('click',async() =>{
        userList.innerHTML='';//clear previous users
        errorMessage.style.display='none';//hide any prevous errors
        loadingMessage.style.display='block';//show loading mesage
        try{
            const response= await
            fetch('https://jsonplaceholder.typicode.com/users');
            if(!response.ok){
                throw new Error(`HTTP error! Status: ${response.status}`);
            }
            const users= await response.json();
            loadingMessage.style.display='none';
            users.forEach(user=>{

            })
        }
    })
})
