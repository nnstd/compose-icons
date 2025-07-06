package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Overscan: ImageVector
    get() {
        if (_Overscan != null) {
            return _Overscan!!
        }
        _Overscan = ImageVector.Builder(
            name = "Overscan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.5f)
                lineTo(10f, 8f)
                horizontalLineTo(14f)
                lineTo(12f, 5.5f)
                moveTo(18f, 10f)
                verticalLineTo(14f)
                lineTo(20.5f, 12f)
                lineTo(18f, 10f)
                moveTo(6f, 10f)
                lineTo(3.5f, 12f)
                lineTo(6f, 14f)
                verticalLineTo(10f)
                moveTo(14f, 16f)
                horizontalLineTo(10f)
                lineTo(12f, 18.5f)
                lineTo(14f, 16f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveTo(1.9f, 3f, 1f, 3.9f, 1f, 5f)
                verticalLineTo(19f)
                curveTo(1f, 20.1f, 1.9f, 21f, 3f, 21f)
                horizontalLineTo(21f)
                curveTo(22.1f, 21f, 23f, 20.1f, 23f, 19f)
                verticalLineTo(5f)
                curveTo(23f, 3.9f, 22.1f, 3f, 21f, 3f)
                moveTo(21f, 19f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _Overscan!!
    }

@Suppress("ObjectPropertyName")
private var _Overscan: ImageVector? = null
