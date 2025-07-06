package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarthBoxOff: ImageVector
    get() {
        if (_EarthBoxOff != null) {
            return _EarthBoxOff!!
        }
        _EarthBoxOff = ImageVector.Builder(
            name = "EarthBoxOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 4.27f)
                lineTo(21f, 6.27f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(6.27f)
                lineTo(4.27f, 23f)
                lineTo(3f, 21.72f)
                lineTo(21.72f, 3f)
                lineTo(23f, 4.27f)
                moveTo(5f, 3f)
                horizontalLineTo(19.18f)
                lineTo(17.18f, 5f)
                horizontalLineTo(15.78f)
                curveTo(15.67f, 6f, 14.83f, 6.79f, 13.8f, 6.79f)
                horizontalLineTo(11.8f)
                verticalLineTo(8.79f)
                curveTo(11.8f, 9.35f, 11.35f, 9.79f, 10.8f, 9.79f)
                horizontalLineTo(8.8f)
                verticalLineTo(11.79f)
                horizontalLineTo(10.38f)
                lineTo(8.55f, 13.62f)
                lineTo(5f, 10.29f)
                verticalLineTo(17.18f)
                lineTo(3f, 19.18f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(11.8f, 19f)
                verticalLineTo(17.79f)
                curveTo(11.17f, 17.79f, 10.6f, 17.5f, 10.23f, 17.04f)
                lineTo(8.27f, 19f)
                horizontalLineTo(11.8f)
                moveTo(15.8f, 12.79f)
                verticalLineTo(15.79f)
                horizontalLineTo(16.8f)
                curveTo(17.69f, 15.79f, 18.74f, 16.38f, 19f, 17.18f)
                verticalLineTo(8.27f)
                lineTo(15.33f, 11.94f)
                curveTo(15.61f, 12.12f, 15.8f, 12.43f, 15.8f, 12.79f)
                close()
            }
        }.build()

        return _EarthBoxOff!!
    }

@Suppress("ObjectPropertyName")
private var _EarthBoxOff: ImageVector? = null
