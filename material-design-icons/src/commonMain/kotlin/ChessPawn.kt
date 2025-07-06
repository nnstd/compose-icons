package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChessPawn: ImageVector
    get() {
        if (_ChessPawn != null) {
            return _ChessPawn!!
        }
        _ChessPawn = ImageVector.Builder(
            name = "ChessPawn",
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
                moveTo(16f, 18f)
                horizontalLineTo(8f)
                lineTo(10.18f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(10.72f)
                lineTo(10.79f, 7.74f)
                curveTo(10.1f, 7.44f, 9.55f, 6.89f, 9.25f, 6.2f)
                curveTo(8.58f, 4.68f, 9.27f, 2.91f, 10.79f, 2.25f)
                curveTo(12.31f, 1.58f, 14.08f, 2.27f, 14.74f, 3.79f)
                curveTo(15.41f, 5.31f, 14.72f, 7.07f, 13.2f, 7.74f)
                lineTo(13.27f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(13.82f)
                lineTo(16f, 18f)
                close()
            }
        }.build()

        return _ChessPawn!!
    }

@Suppress("ObjectPropertyName")
private var _ChessPawn: ImageVector? = null
