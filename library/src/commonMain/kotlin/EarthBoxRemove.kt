package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarthBoxRemove: ImageVector
    get() {
        if (_EarthBoxRemove != null) {
            return _EarthBoxRemove!!
        }
        _EarthBoxRemove = ImageVector.Builder(
            name = "EarthBoxRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.47f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.47f, 15.88f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(12.8f)
                curveTo(20.39f, 12.45f, 19.72f, 12.2f, 19f, 12.08f)
                verticalLineTo(5f)
                horizontalLineTo(15.78f)
                curveTo(15.67f, 6f, 14.83f, 6.79f, 13.8f, 6.79f)
                horizontalLineTo(11.8f)
                verticalLineTo(8.79f)
                curveTo(11.8f, 9.35f, 11.35f, 9.79f, 10.8f, 9.79f)
                horizontalLineTo(8.8f)
                verticalLineTo(11.79f)
                horizontalLineTo(14.8f)
                curveTo(15.23f, 11.79f, 15.6f, 12.06f, 15.74f, 12.44f)
                curveTo(13.6f, 13.31f, 12.07f, 15.39f, 12f, 17.83f)
                curveTo(10.7f, 17.79f, 9.8f, 16.9f, 9.8f, 15.79f)
                verticalLineTo(14.79f)
                lineTo(5f, 10.29f)
                verticalLineTo(19f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                close()
            }
        }.build()

        return _EarthBoxRemove!!
    }

@Suppress("ObjectPropertyName")
private var _EarthBoxRemove: ImageVector? = null
