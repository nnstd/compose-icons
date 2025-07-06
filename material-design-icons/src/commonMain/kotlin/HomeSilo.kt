package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeSilo: ImageVector
    get() {
        if (_HomeSilo != null) {
            return _HomeSilo!!
        }
        _HomeSilo = ImageVector.Builder(
            name = "HomeSilo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.8f)
                curveTo(23.6f, 4.5f, 20.9f, 2f, 17.5f, 2f)
                curveTo(15.8f, 2f, 14.1f, 2.7f, 12.9f, 3.9f)
                curveTo(12.2f, 4.6f, 11.7f, 5.3f, 11.4f, 6.2f)
                lineTo(17f, 9.9f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(24f)
                verticalLineTo(7.8f)
                moveTo(13.3f, 7f)
                curveTo(13.9f, 5.2f, 15.6f, 4f, 17.5f, 4f)
                reflectiveCurveTo(21.1f, 5.2f, 21.7f, 7f)
                horizontalLineTo(13.3f)
                moveTo(0f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                lineTo(7.5f, 6f)
                lineTo(0f, 11f)
                close()
            }
        }.build()

        return _HomeSilo!!
    }

@Suppress("ObjectPropertyName")
private var _HomeSilo: ImageVector? = null
