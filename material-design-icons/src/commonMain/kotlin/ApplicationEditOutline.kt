package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationEditOutline: ImageVector
    get() {
        if (_ApplicationEditOutline != null) {
            return _ApplicationEditOutline!!
        }
        _ApplicationEditOutline = ImageVector.Builder(
            name = "ApplicationEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                curveTo(1.9f, 22f, 1f, 21.1f, 1f, 20f)
                verticalLineTo(4f)
                curveTo(1f, 2.9f, 1.9f, 2f, 3f, 2f)
                horizontalLineTo(21f)
                curveTo(22.1f, 2f, 23f, 2.9f, 23f, 4f)
                verticalLineTo(12.1f)
                lineTo(22.8f, 11.9f)
                curveTo(22.3f, 11.4f, 21.7f, 11.1f, 21f, 11.1f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                moveTo(21.4f, 13.3f)
                lineTo(22.7f, 14.6f)
                curveTo(22.9f, 14.8f, 22.9f, 15.2f, 22.7f, 15.4f)
                lineTo(21.7f, 16.4f)
                lineTo(19.6f, 14.3f)
                lineTo(20.6f, 13.3f)
                curveTo(20.7f, 13.2f, 20.8f, 13.1f, 21f, 13.1f)
                curveTo(21.2f, 13.1f, 21.3f, 13.2f, 21.4f, 13.3f)
                moveTo(21.1f, 16.9f)
                lineTo(15.1f, 23f)
                horizontalLineTo(13f)
                verticalLineTo(20.9f)
                lineTo(19.1f, 14.8f)
                lineTo(21.1f, 16.9f)
                close()
            }
        }.build()

        return _ApplicationEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationEditOutline: ImageVector? = null
