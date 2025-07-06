package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpBoxMultipleOutline: ImageVector
    get() {
        if (_HelpBoxMultipleOutline != null) {
            return _HelpBoxMultipleOutline!!
        }
        _HelpBoxMultipleOutline = ImageVector.Builder(
            name = "HelpBoxMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                moveTo(22f, 16f)
                curveTo(22f, 17.1f, 21.1f, 18f, 20f, 18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(16f)
                moveTo(16f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                moveTo(14.2f, 5f)
                curveTo(13.3f, 5f, 12.6f, 5.2f, 12.1f, 5.6f)
                curveTo(11.6f, 6f, 11.3f, 6.6f, 11.3f, 7.4f)
                horizontalLineTo(13.2f)
                curveTo(13.2f, 7.1f, 13.3f, 6.9f, 13.5f, 6.7f)
                curveTo(13.7f, 6.6f, 13.9f, 6.5f, 14.2f, 6.5f)
                curveTo(14.5f, 6.5f, 14.8f, 6.6f, 15f, 6.8f)
                curveTo(15.2f, 7f, 15.3f, 7.2f, 15.3f, 7.6f)
                curveTo(15.3f, 7.9f, 15.2f, 8.2f, 15.1f, 8.4f)
                curveTo(15f, 8.6f, 14.7f, 8.8f, 14.5f, 9f)
                curveTo(14f, 9.3f, 13.6f, 9.6f, 13.5f, 9.9f)
                curveTo(13.1f, 10.1f, 13f, 10.5f, 13f, 11f)
                horizontalLineTo(15f)
                curveTo(15f, 10.7f, 15f, 10.4f, 15.1f, 10.3f)
                curveTo(15.2f, 10.1f, 15.4f, 9.9f, 15.6f, 9.8f)
                curveTo(16f, 9.6f, 16.4f, 9.3f, 16.7f, 8.9f)
                curveTo(17f, 8.4f, 17.2f, 8f, 17.2f, 7.5f)
                curveTo(17.2f, 6.7f, 16.9f, 6.1f, 16.4f, 5.7f)
                curveTo(15.9f, 5.2f, 15.1f, 5f, 14.2f, 5f)
                moveTo(13f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _HelpBoxMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HelpBoxMultipleOutline: ImageVector? = null
