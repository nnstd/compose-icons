package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileSync: ImageVector
    get() {
        if (_FileSync != null) {
            return _FileSync!!
        }
        _FileSync = ImageVector.Builder(
            name = "FileSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17.5f)
                curveTo(11f, 13.9f, 13.9f, 11f, 17.5f, 11f)
                curveTo(18.4f, 11f, 19.2f, 11.2f, 20f, 11.5f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(12.8f)
                curveTo(11.7f, 20.8f, 11f, 19.2f, 11f, 17.5f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(17f, 12f)
                verticalLineTo(13.5f)
                curveTo(19.2f, 13.5f, 21f, 15.3f, 21f, 17.5f)
                curveTo(21f, 18.3f, 20.8f, 19.1f, 20.3f, 19.7f)
                lineTo(19.2f, 18.6f)
                curveTo(19.4f, 18.3f, 19.5f, 17.9f, 19.5f, 17.5f)
                curveTo(19.5f, 16.1f, 18.4f, 15f, 17f, 15f)
                verticalLineTo(16.5f)
                lineTo(14.8f, 14.3f)
                lineTo(17f, 12f)
                moveTo(17f, 23f)
                verticalLineTo(21.5f)
                curveTo(14.8f, 21.5f, 13f, 19.7f, 13f, 17.5f)
                curveTo(13f, 16.7f, 13.2f, 15.9f, 13.7f, 15.3f)
                lineTo(14.8f, 16.4f)
                curveTo(14.6f, 16.7f, 14.5f, 17.1f, 14.5f, 17.5f)
                curveTo(14.5f, 18.9f, 15.6f, 20f, 17f, 20f)
                verticalLineTo(18.5f)
                lineTo(19.2f, 20.7f)
                lineTo(17f, 23f)
                close()
            }
        }.build()

        return _FileSync!!
    }

@Suppress("ObjectPropertyName")
private var _FileSync: ImageVector? = null
