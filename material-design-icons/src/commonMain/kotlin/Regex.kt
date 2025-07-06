package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Regex: ImageVector
    get() {
        if (_Regex != null) {
            return _Regex!!
        }
        _Regex = ImageVector.Builder(
            name = "Regex",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 16.92f)
                curveTo(15.67f, 16.97f, 15.34f, 17f, 15f, 17f)
                curveTo(14.66f, 17f, 14.33f, 16.97f, 14f, 16.92f)
                verticalLineTo(13.41f)
                lineTo(11.5f, 15.89f)
                curveTo(11f, 15.5f, 10.5f, 15f, 10.11f, 14.5f)
                lineTo(12.59f, 12f)
                horizontalLineTo(9.08f)
                curveTo(9.03f, 11.67f, 9f, 11.34f, 9f, 11f)
                curveTo(9f, 10.66f, 9.03f, 10.33f, 9.08f, 10f)
                horizontalLineTo(12.59f)
                lineTo(10.11f, 7.5f)
                curveTo(10.3f, 7.25f, 10.5f, 7f, 10.76f, 6.76f)
                verticalLineTo(6.76f)
                curveTo(11f, 6.5f, 11.25f, 6.3f, 11.5f, 6.11f)
                lineTo(14f, 8.59f)
                verticalLineTo(5.08f)
                curveTo(14.33f, 5.03f, 14.66f, 5f, 15f, 5f)
                curveTo(15.34f, 5f, 15.67f, 5.03f, 16f, 5.08f)
                verticalLineTo(8.59f)
                lineTo(18.5f, 6.11f)
                curveTo(19f, 6.5f, 19.5f, 7f, 19.89f, 7.5f)
                lineTo(17.41f, 10f)
                horizontalLineTo(20.92f)
                curveTo(20.97f, 10.33f, 21f, 10.66f, 21f, 11f)
                curveTo(21f, 11.34f, 20.97f, 11.67f, 20.92f, 12f)
                horizontalLineTo(17.41f)
                lineTo(19.89f, 14.5f)
                curveTo(19.7f, 14.75f, 19.5f, 15f, 19.24f, 15.24f)
                verticalLineTo(15.24f)
                curveTo(19f, 15.5f, 18.75f, 15.7f, 18.5f, 15.89f)
                lineTo(16f, 13.41f)
                verticalLineTo(16.92f)
                horizontalLineTo(16f)
                verticalLineTo(16.92f)
                moveTo(5f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Regex!!
    }

@Suppress("ObjectPropertyName")
private var _Regex: ImageVector? = null
