package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpBoxOutline: ImageVector
    get() {
        if (_HelpBoxOutline != null) {
            return _HelpBoxOutline!!
        }
        _HelpBoxOutline = ImageVector.Builder(
            name = "HelpBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                moveTo(12f, 6f)
                curveTo(9.8f, 6f, 8f, 7.8f, 8f, 10f)
                horizontalLineTo(10f)
                curveTo(10f, 8.9f, 10.9f, 8f, 12f, 8f)
                reflectiveCurveTo(14f, 8.9f, 14f, 10f)
                curveTo(14f, 12f, 11f, 11.8f, 11f, 15f)
                horizontalLineTo(13f)
                curveTo(13f, 12.8f, 16f, 12.5f, 16f, 10f)
                curveTo(16f, 7.8f, 14.2f, 6f, 12f, 6f)
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _HelpBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HelpBoxOutline: ImageVector? = null
