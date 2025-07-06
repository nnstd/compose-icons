package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CastOff: ImageVector
    get() {
        if (_CastOff != null) {
            return _CastOff!!
        }
        _CastOff = ImageVector.Builder(
            name = "CastOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.6f, 1.27f)
                lineTo(0.25f, 2.75f)
                lineTo(1.41f, 3.8f)
                curveTo(1.16f, 4.13f, 1f, 4.55f, 1f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(5.23f)
                lineTo(18.2f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(21f)
                horizontalLineTo(20.41f)
                lineTo(22.31f, 22.72f)
                lineTo(23.65f, 21.24f)
                moveTo(6.5f, 3f)
                lineTo(8.7f, 5f)
                horizontalLineTo(21f)
                verticalLineTo(16.14f)
                lineTo(23f, 17.95f)
                verticalLineTo(5f)
                curveTo(23f, 3.89f, 22.1f, 3f, 21f, 3f)
                moveTo(1f, 10f)
                verticalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 21f)
                horizontalLineTo(12f)
                curveTo(12f, 14.92f, 7.08f, 10f, 1f, 10f)
                moveTo(1f, 14f)
                verticalLineTo(16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 21f)
                horizontalLineTo(8f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 14f)
                moveTo(1f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 18f)
                close()
            }
        }.build()

        return _CastOff!!
    }

@Suppress("ObjectPropertyName")
private var _CastOff: ImageVector? = null
