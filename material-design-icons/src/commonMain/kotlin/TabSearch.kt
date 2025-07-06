package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TabSearch: ImageVector
    get() {
        if (_TabSearch != null) {
            return _TabSearch!!
        }
        _TabSearch = ImageVector.Builder(
            name = "TabSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 11f)
                curveTo(5f, 11f, 3f, 13f, 3f, 15.5f)
                curveTo(3f, 16.38f, 3.25f, 17.21f, 3.69f, 17.9f)
                lineTo(0.61f, 21f)
                lineTo(2f, 22.39f)
                lineTo(5.12f, 19.32f)
                curveTo(5.81f, 19.75f, 6.63f, 20f, 7.5f, 20f)
                curveTo(10f, 20f, 12f, 18f, 12f, 15.5f)
                reflectiveCurveTo(10f, 11f, 7.5f, 11f)
                moveTo(7.5f, 18f)
                curveTo(6.12f, 18f, 5f, 16.88f, 5f, 15.5f)
                reflectiveCurveTo(6.12f, 13f, 7.5f, 13f)
                reflectiveCurveTo(10f, 14.12f, 10f, 15.5f)
                reflectiveCurveTo(8.88f, 18f, 7.5f, 18f)
                moveTo(23f, 5f)
                verticalLineTo(19f)
                curveTo(23f, 20.11f, 22.11f, 21f, 21f, 21f)
                horizontalLineTo(10.95f)
                curveTo(11.76f, 20.5f, 12.45f, 19.81f, 12.97f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(10.82f)
                curveTo(1.77f, 12f, 1f, 13.66f, 1f, 15.5f)
                verticalLineTo(5f)
                curveTo(1f, 3.9f, 1.9f, 3f, 3f, 3f)
                horizontalLineTo(21f)
                curveTo(22.11f, 3f, 23f, 3.9f, 23f, 5f)
                close()
            }
        }.build()

        return _TabSearch!!
    }

@Suppress("ObjectPropertyName")
private var _TabSearch: ImageVector? = null
