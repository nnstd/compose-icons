package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieSearch: ImageVector
    get() {
        if (_MovieSearch != null) {
            return _MovieSearch!!
        }
        _MovieSearch = ImageVector.Builder(
            name = "MovieSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.03f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                lineTo(2f, 6f)
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
                verticalLineTo(13.05f)
                curveTo(20.85f, 11.22f, 18.82f, 10f, 16.5f, 10f)
                curveTo(12.92f, 10f, 10f, 12.92f, 10f, 16.5f)
                curveTo(10f, 17.79f, 10.38f, 19f, 11.03f, 20f)
                moveTo(23.39f, 22f)
                lineTo(22f, 23.39f)
                lineTo(18.88f, 20.32f)
                curveTo(18.19f, 20.75f, 17.37f, 21f, 16.5f, 21f)
                curveTo(14f, 21f, 12f, 19f, 12f, 16.5f)
                reflectiveCurveTo(14f, 12f, 16.5f, 12f)
                reflectiveCurveTo(21f, 14f, 21f, 16.5f)
                curveTo(21f, 17.38f, 20.75f, 18.21f, 20.31f, 18.9f)
                lineTo(23.39f, 22f)
                moveTo(19f, 16.5f)
                curveTo(19f, 15.12f, 17.88f, 14f, 16.5f, 14f)
                reflectiveCurveTo(14f, 15.12f, 14f, 16.5f)
                reflectiveCurveTo(15.12f, 19f, 16.5f, 19f)
                reflectiveCurveTo(19f, 17.88f, 19f, 16.5f)
                close()
            }
        }.build()

        return _MovieSearch!!
    }

@Suppress("ObjectPropertyName")
private var _MovieSearch: ImageVector? = null
