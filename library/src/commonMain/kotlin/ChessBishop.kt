package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChessBishop: ImageVector
    get() {
        if (_ChessBishop != null) {
            return _ChessBishop!!
        }
        _ChessBishop = ImageVector.Builder(
            name = "ChessBishop",
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
                moveTo(17.16f, 8.26f)
                curveTo(18.22f, 9.63f, 18.86f, 11.28f, 19f, 13f)
                curveTo(19f, 15.76f, 15.87f, 18f, 12f, 18f)
                curveTo(8.13f, 18f, 5f, 15.76f, 5f, 13f)
                curveTo(5f, 10.62f, 7.33f, 6.39f, 10.46f, 5.27f)
                curveTo(10.16f, 4.91f, 10f, 4.46f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 4f)
                curveTo(14f, 4.46f, 13.84f, 4.91f, 13.54f, 5.27f)
                curveTo(14.4f, 5.6f, 15.18f, 6.1f, 15.84f, 6.74f)
                lineTo(11.29f, 11.29f)
                lineTo(12.71f, 12.71f)
                lineTo(17.16f, 8.26f)
                close()
            }
        }.build()

        return _ChessBishop!!
    }

@Suppress("ObjectPropertyName")
private var _ChessBishop: ImageVector? = null
