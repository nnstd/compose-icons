package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChessKing: ImageVector
    get() {
        if (_ChessKing != null) {
            return _ChessKing!!
        }
        _ChessKing = ImageVector.Builder(
            name = "ChessKing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                moveTo(17f, 10f)
                curveTo(15.58f, 10f, 14.26f, 10.77f, 13.55f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(10.45f)
                curveTo(9.35f, 10.09f, 6.9f, 9.43f, 5f, 10.54f)
                curveTo(3.07f, 11.64f, 2.42f, 14.09f, 3.5f, 16f)
                curveTo(4.24f, 17.24f, 5.57f, 18f, 7f, 18f)
                horizontalLineTo(17f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 10f)
                close()
            }
        }.build()

        return _ChessKing!!
    }

@Suppress("ObjectPropertyName")
private var _ChessKing: ImageVector? = null
