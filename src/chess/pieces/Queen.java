package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece{

	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "Q";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] moves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		// above the piece
		p.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			moves[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
				
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}
		
		// left the piece
		p.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			moves[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
				
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}
		
		// right the piece
		p.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			moves[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
						
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}	
		
		// below the piece
		p.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
			moves[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
						
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			moves[p.getRow()][p.getColumn()] = true;
		}
		
		// nw
				p.setValues(position.getRow() - 1, position.getColumn() - 1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
					moves[p.getRow()][p.getColumn()] = true;
					p.setValues(p.getRow() - 1, p.getColumn() - 1);
				}
						
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
				}
				
				// ne
				p.setValues(position.getRow() - 1, position.getColumn() + 1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
					p.setValues(p.getRow() - 1, p.getColumn() + 1);
				}
						
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
				}
				
				// se
				p.setValues(position.getRow() + 1, position.getColumn() + 1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
					p.setValues(p.getRow() + 1, p.getColumn() + 1);
				}
								
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
				}	
				
				// sw
				p.setValues(position.getRow() + 1, position.getColumn() - 1);
				while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
					moves[p.getRow()][p.getColumn()] = true;
					p.setValues(p.getRow() + 1, p.getColumn() - 1);
				}
								
				if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
				}
				
		return moves;
	}
}