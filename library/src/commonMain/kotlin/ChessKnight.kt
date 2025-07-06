package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChessKnight: ImageVector
    get() {
        if (_ChessKnight != null) {
            return _ChessKnight!!
        }
        _ChessKnight = ImageVector.Builder(
            name = "ChessKnight",
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
                moveTo(13f, 2f)
                verticalLineTo(2f)
                curveTo(11.75f, 2f, 10.58f, 2.62f, 9.89f, 3.66f)
                lineTo(7f, 8f)
                lineTo(9f, 10f)
                lineTo(11.06f, 8.63f)
                curveTo(11.5f, 8.32f, 12.14f, 8.44f, 12.45f, 8.9f)
                curveTo(12.47f, 8.93f, 12.5f, 8.96f, 12.5f, 9f)
                verticalLineTo(9f)
                curveTo(12.8f, 9.59f, 12.69f, 10.3f, 12.22f, 10.77f)
                lineTo(7.42f, 15.57f)
                curveTo(6.87f, 16.13f, 6.87f, 17.03f, 7.43f, 17.58f)
                curveTo(7.69f, 17.84f, 8.05f, 18f, 8.42f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 2f)
                close()
            }
        }.build()

        return _ChessKnight!!
    }

@Suppress("ObjectPropertyName")
private var _ChessKnight: ImageVector? = null
