package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSiloOutline: ImageVector
    get() {
        if (_HomeSiloOutline != null) {
            return _HomeSiloOutline!!
        }
        _HomeSiloOutline = ImageVector.Builder(
            name = "HomeSiloOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(21f)
                moveTo(20f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                moveTo(24f, 7.8f)
                curveTo(23.6f, 4.5f, 20.8f, 2f, 17.5f, 2f)
                curveTo(15.8f, 2f, 14.1f, 2.7f, 12.9f, 3.9f)
                curveTo(12.2f, 4.6f, 11.7f, 5.3f, 11.4f, 6.2f)
                lineTo(15.6f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(24f)
                verticalLineTo(7.8f)
                moveTo(13.3f, 7f)
                curveTo(13.9f, 5.2f, 15.6f, 4f, 17.5f, 4f)
                reflectiveCurveTo(21.1f, 5.2f, 21.7f, 7f)
                horizontalLineTo(13.3f)
                moveTo(7.5f, 6f)
                lineTo(0f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                lineTo(7.5f, 6f)
                moveTo(13f, 20f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                lineTo(7.5f, 8.5f)
                lineTo(13f, 12f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _HomeSiloOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSiloOutline: ImageVector? = null
