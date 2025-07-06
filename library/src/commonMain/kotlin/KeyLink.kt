package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyLink: ImageVector
    get() {
        if (_KeyLink != null) {
            return _KeyLink!!
        }
        _KeyLink = ImageVector.Builder(
            name = "KeyLink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 3f)
                curveTo(5f, 3f, 3f, 5f, 3f, 7.5f)
                reflectiveCurveTo(5f, 12f, 7.5f, 12f)
                curveTo(9.5f, 12f, 11.1f, 10.8f, 11.7f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 4.2f, 9.5f, 3f, 7.5f, 3f)
                moveTo(7.5f, 6f)
                curveTo(8.3f, 6f, 9f, 6.7f, 9f, 7.5f)
                reflectiveCurveTo(8.3f, 9f, 7.5f, 9f)
                reflectiveCurveTo(6f, 8.3f, 6f, 7.5f)
                reflectiveCurveTo(6.7f, 6f, 7.5f, 6f)
                moveTo(10f, 14f)
                curveTo(8.4f, 14f, 6f, 15.1f, 6f, 18f)
                curveTo(6f, 20.9f, 8.4f, 22f, 10f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                curveTo(9.7f, 20f, 8f, 19.9f, 8f, 18f)
                curveTo(8f, 16.2f, 9.5f, 16f, 10f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                moveTo(13f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                curveTo(14.3f, 16f, 16f, 16.1f, 16f, 18f)
                curveTo(16f, 19.8f, 14.5f, 20f, 14f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(14f)
                curveTo(15.6f, 22f, 18f, 20.9f, 18f, 18f)
                curveTo(18f, 15.1f, 15.6f, 14f, 14f, 14f)
                moveTo(9f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _KeyLink!!
    }

@Suppress("ObjectPropertyName")
private var _KeyLink: ImageVector? = null
