<script>
let cartCount=0
const cart=document.querySelector(".cart")
const searchInput=document.querySelector(".nav-right input")
const cards=document.querySelectorAll(".card")
const toggleBtn=document.createElement("div")
toggleBtn.innerHTML="☰"
toggleBtn.style.fontSize="26px"
toggleBtn.style.cursor="pointer"
toggleBtn.style.display="none"
document.querySelector(".navbar").prepend(toggleBtn)

document.querySelectorAll(".card a").forEach(btn=>{
btn.addEventListener("click",e=>{
e.preventDefault()
cartCount++
cart.innerText="🛒 "+cartCount
})
})

searchInput.addEventListener("keyup",()=>{
const val=searchInput.value.toLowerCase()
cards.forEach(card=>{
card.style.display=card.innerText.toLowerCase().includes(val)?"block":"none"
})
})

const sidebar=document.querySelector(".sidebar")
toggleBtn.addEventListener("click",()=>{
sidebar.classList.toggle("show")
})

window.addEventListener("resize",()=>{
if(window.innerWidth<=900){
toggleBtn.style.display="block"
}else{
toggleBtn.style.display="none"
sidebar.classList.remove("show")
}
})
</script>
