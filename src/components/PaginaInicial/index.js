import logo from '../../assets/images/Logo2.png'
import { useNavigate } from "react-router-dom";



function PaginaInicial(){
    const navigate = useNavigate()
    const navigate2 = useNavigate()

    return(
        <div className="Container">
            <img src={logo} alt="Logo da empresa"/>

            <h1>Bem Vindo a Grifinoria</h1>

            <button onClick={() => navigate('/Cadastro')} className="link-usuarios">
                Formulario de Cadastro
            </button>
            <button onClick={() => navigate2('/usuarios')} className="link-usuarios">
                Jogadores Cadastrados
            </button>
        </div>
    )

}

export default PaginaInicial;