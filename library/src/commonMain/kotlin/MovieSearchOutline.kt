package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieSearchOutline: ImageVector
    get() {
        if (_MovieSearchOutline != null) {
            return _MovieSearchOutline!!
        }
        _MovieSearchOutline = ImageVector.Builder(
            name = "MovieSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.9f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                lineTo(7f, 8f)
                horizontalLineTo(10f)
                lineTo(8f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 8f)
                horizontalLineTo(15f)
                lineTo(13f, 4f)
                horizontalLineTo(15f)
                lineTo(17f, 8f)
                horizontalLineTo(20f)
                lineTo(18f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                curveTo(21.5f, 12.2f, 20.8f, 11.5f, 20f, 11f)
                verticalLineTo(10f)
                horizontalLineTo(5.8f)
                lineTo(4f, 6.5f)
                verticalLineTo(18f)
                horizontalLineTo(10.2f)
                curveTo(10.4f, 18.7f, 10.6f, 19.4f, 11f, 20f)
                moveTo(20.3f, 18.9f)
                curveTo(20.7f, 18.2f, 21f, 17.4f, 21f, 16.5f)
                curveTo(21f, 14f, 19f, 12f, 16.5f, 12f)
                reflectiveCurveTo(12f, 14f, 12f, 16.5f)
                reflectiveCurveTo(14f, 21f, 16.5f, 21f)
                curveTo(17.4f, 21f, 18.2f, 20.8f, 18.9f, 20.3f)
                lineTo(22f, 23.4f)
                lineTo(23.4f, 22f)
                lineTo(20.3f, 18.9f)
                moveTo(16.5f, 19f)
                curveTo(15.1f, 19f, 14f, 17.9f, 14f, 16.5f)
                reflectiveCurveTo(15.1f, 14f, 16.5f, 14f)
                reflectiveCurveTo(19f, 15.1f, 19f, 16.5f)
                reflectiveCurveTo(17.9f, 19f, 16.5f, 19f)
                close()
            }
        }.build()

        return _MovieSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieSearchOutline: ImageVector? = null
