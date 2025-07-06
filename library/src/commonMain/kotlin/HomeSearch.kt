package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSearch: ImageVector
    get() {
        if (_HomeSearch != null) {
            return _HomeSearch!!
        }
        _HomeSearch = ImageVector.Builder(
            name = "HomeSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.31f, 18.9f)
                curveTo(19.75f, 18.21f, 20f, 17.38f, 20f, 16.5f)
                curveTo(20f, 14f, 18f, 12f, 15.5f, 12f)
                reflectiveCurveTo(11f, 14f, 11f, 16.5f)
                reflectiveCurveTo(13f, 21f, 15.5f, 21f)
                curveTo(16.37f, 21f, 17.19f, 20.75f, 17.88f, 20.32f)
                lineTo(21f, 23.39f)
                lineTo(22.39f, 22f)
                lineTo(19.31f, 18.9f)
                moveTo(15.5f, 19f)
                curveTo(14.12f, 19f, 13f, 17.88f, 13f, 16.5f)
                reflectiveCurveTo(14.12f, 14f, 15.5f, 14f)
                reflectiveCurveTo(18f, 15.12f, 18f, 16.5f)
                reflectiveCurveTo(16.88f, 19f, 15.5f, 19f)
                moveTo(5f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(20.18f)
                curveTo(19f, 10.77f, 17.34f, 10f, 15.5f, 10f)
                curveTo(11.92f, 10f, 9f, 12.92f, 9f, 16.5f)
                curveTo(9f, 17.79f, 9.38f, 19f, 10.03f, 20f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _HomeSearch!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSearch: ImageVector? = null
