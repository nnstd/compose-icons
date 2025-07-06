package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Submarine: ImageVector
    get() {
        if (_Submarine != null) {
            return _Submarine!!
        }
        _Submarine = ImageVector.Builder(
            name = "Submarine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3.67f)
                curveTo(6.78f, 4.53f, 5.39f, 4.93f, 4f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                curveTo(5.37f, 7f, 6.74f, 6.65f, 8f, 6f)
                curveTo(10.5f, 7.3f, 13.5f, 7.3f, 16f, 6f)
                curveTo(17.26f, 6.65f, 18.62f, 6.94f, 20f, 7f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                curveTo(18.61f, 5f, 17.22f, 4.53f, 16f, 3.67f)
                curveTo(13.56f, 5.38f, 10.44f, 5.38f, 8f, 3.67f)
                moveTo(16f, 8.67f)
                lineTo(15f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                lineTo(12f, 14f)
                horizontalLineTo(9f)
                lineTo(6f, 16f)
                lineTo(5f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                lineTo(2f, 17f)
                lineTo(4f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(5.14f)
                lineTo(6f, 18f)
                lineTo(9f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 14f)
                horizontalLineTo(18f)
                lineTo(17f, 13f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(8.67f)
                close()
            }
        }.build()

        return _Submarine!!
    }

@Suppress("ObjectPropertyName")
private var _Submarine: ImageVector? = null
