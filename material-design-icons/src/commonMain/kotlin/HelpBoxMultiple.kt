package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HelpBoxMultiple: ImageVector
    get() {
        if (_HelpBoxMultiple != null) {
            return _HelpBoxMultiple!!
        }
        _HelpBoxMultiple = ImageVector.Builder(
            name = "HelpBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                moveTo(20f, 2f)
                horizontalLineTo(8f)
                curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                verticalLineTo(16f)
                curveTo(6f, 17.1f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(15f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                moveTo(16.8f, 8.8f)
                curveTo(16.5f, 9.2f, 16.1f, 9.5f, 15.7f, 9.7f)
                curveTo(15.5f, 9.9f, 15.3f, 10f, 15.2f, 10.2f)
                curveTo(15f, 10.4f, 15f, 10.7f, 15f, 11f)
                horizontalLineTo(13f)
                curveTo(13f, 10.5f, 13.1f, 10.1f, 13.3f, 9.8f)
                curveTo(13.5f, 9.5f, 13.8f, 9.2f, 14.3f, 8.9f)
                curveTo(14.6f, 8.7f, 14.8f, 8.5f, 14.9f, 8.3f)
                curveTo(15.1f, 8.1f, 15.1f, 7.8f, 15.1f, 7.5f)
                curveTo(15.1f, 7.2f, 15f, 6.9f, 14.8f, 6.7f)
                curveTo(14.6f, 6.5f, 14.4f, 6.4f, 14f, 6.4f)
                curveTo(13.7f, 6.4f, 13.5f, 6.5f, 13.3f, 6.6f)
                curveTo(13.1f, 6.8f, 13f, 7f, 13f, 7.3f)
                horizontalLineTo(11.1f)
                curveTo(11.1f, 6.5f, 11.3f, 5.9f, 11.9f, 5.5f)
                curveTo(12.6f, 5.2f, 13.3f, 5f, 14.2f, 5f)
                curveTo(15.1f, 5f, 15.9f, 5.2f, 16.4f, 5.7f)
                curveTo(16.9f, 6.2f, 17.2f, 6.8f, 17.2f, 7.5f)
                curveTo(17.2f, 8f, 17f, 8.4f, 16.8f, 8.8f)
                close()
            }
        }.build()

        return _HelpBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _HelpBoxMultiple: ImageVector? = null
