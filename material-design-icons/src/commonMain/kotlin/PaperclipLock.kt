package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaperclipLock: ImageVector
    get() {
        if (_PaperclipLock != null) {
            return _PaperclipLock!!
        }
        _PaperclipLock = ImageVector.Builder(
            name = "PaperclipLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 13f)
                curveTo(16.6f, 13f, 15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17f)
                curveTo(14.6f, 17f, 14f, 17.6f, 14f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14f, 22.4f, 14.6f, 23f, 15.2f, 23f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23f, 22f, 22.4f, 22f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22f, 17.6f, 21.4f, 17f, 20.8f, 17f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13f, 18f, 13f)
                moveTo(18f, 14.2f)
                curveTo(18.8f, 14.2f, 19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18f, 14.2f)
                moveTo(8.9f, 2f)
                curveTo(6.8f, 2f, 5f, 3.8f, 5f, 6f)
                verticalLineTo(16.5f)
                curveTo(5f, 19.5f, 7.5f, 22f, 10.5f, 22f)
                curveTo(11f, 22f, 11.5f, 21.9f, 12f, 21.8f)
                verticalLineTo(20.2f)
                curveTo(11.5f, 20.4f, 11f, 20.5f, 10.5f, 20.5f)
                curveTo(8.3f, 20.5f, 6.5f, 18.7f, 6.5f, 16.5f)
                verticalLineTo(6f)
                curveTo(6.5f, 4.6f, 7.6f, 3.5f, 9f, 3.5f)
                reflectiveCurveTo(11.5f, 4.6f, 11.5f, 6f)
                verticalLineTo(14.5f)
                curveTo(11.5f, 15.1f, 11.1f, 15.5f, 10.5f, 15.5f)
                reflectiveCurveTo(9.5f, 15.1f, 9.5f, 14.5f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(14.5f)
                curveTo(8f, 15.9f, 9.1f, 17f, 10.5f, 17f)
                reflectiveCurveTo(13f, 15.9f, 13f, 14.5f)
                verticalLineTo(6f)
                curveTo(13f, 3.8f, 11.2f, 2f, 8.9f, 2f)
                curveTo(9f, 2f, 9f, 2f, 8.9f, 2f)
                moveTo(14.5f, 7f)
                verticalLineTo(12.4f)
                curveTo(14.9f, 12f, 15.4f, 11.6f, 16f, 11.4f)
                verticalLineTo(7f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _PaperclipLock!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipLock: ImageVector? = null
