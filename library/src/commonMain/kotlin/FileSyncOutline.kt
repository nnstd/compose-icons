package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSyncOutline: ImageVector
    get() {
        if (_FileSyncOutline != null) {
            return _FileSyncOutline!!
        }
        _FileSyncOutline = ImageVector.Builder(
            name = "FileSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.8f, 22f)
                horizontalLineTo(6f)
                curveTo(4.9f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.9f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(11.5f)
                curveTo(19.4f, 11.2f, 18.7f, 11.1f, 18f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(11.5f)
                curveTo(11.8f, 20.7f, 12.3f, 21.4f, 12.8f, 22f)
                moveTo(17f, 12f)
                lineTo(14.8f, 14.2f)
                lineTo(17f, 16.4f)
                verticalLineTo(15f)
                curveTo(18.4f, 15f, 19.5f, 16.1f, 19.5f, 17.5f)
                curveTo(19.5f, 17.9f, 19.4f, 18.3f, 19.2f, 18.6f)
                lineTo(20.3f, 19.7f)
                curveTo(20.7f, 19.1f, 21f, 18.3f, 21f, 17.5f)
                curveTo(21f, 15.3f, 19.2f, 13.5f, 17f, 13.5f)
                verticalLineTo(12f)
                moveTo(19.2f, 20.8f)
                lineTo(17f, 18.5f)
                verticalLineTo(20f)
                curveTo(15.6f, 20f, 14.5f, 18.9f, 14.5f, 17.5f)
                curveTo(14.5f, 17.1f, 14.6f, 16.7f, 14.8f, 16.4f)
                lineTo(13.7f, 15.3f)
                curveTo(13.3f, 15.9f, 13f, 16.7f, 13f, 17.5f)
                curveTo(13f, 19.7f, 14.8f, 21.5f, 17f, 21.5f)
                verticalLineTo(23f)
                lineTo(19.2f, 20.8f)
                close()
            }
        }.build()

        return _FileSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileSyncOutline: ImageVector? = null
