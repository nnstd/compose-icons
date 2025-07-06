package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoeFormal: ImageVector
    get() {
        if (_ShoeFormal != null) {
            return _ShoeFormal!!
        }
        _ShoeFormal = ImageVector.Builder(
            name = "ShoeFormal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 9f)
                verticalLineTo(8f)
                horizontalLineTo(20.5f)
                lineTo(19.5f, 9f)
                horizontalLineTo(15f)
                lineTo(14f, 8f)
                horizontalLineTo(13f)
                lineTo(7f, 12f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                lineTo(13f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(21.5f)
                verticalLineTo(14f)
                curveTo(21.5f, 14f, 22f, 13f, 22f, 11.5f)
                curveTo(22f, 10f, 21.5f, 9f, 21.5f, 9f)
                close()
            }
        }.build()

        return _ShoeFormal!!
    }

@Suppress("ObjectPropertyName")
private var _ShoeFormal: ImageVector? = null
