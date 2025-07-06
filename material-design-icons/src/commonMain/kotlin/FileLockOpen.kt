package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileLockOpen: ImageVector
    get() {
        if (_FileLockOpen != null) {
            return _FileLockOpen!!
        }
        _FileLockOpen = ImageVector.Builder(
            name = "FileLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(22f, 22.4f, 21.4f, 23f, 20.7f, 23f)
                horizontalLineTo(15.2f)
                curveTo(14.6f, 23f, 14f, 22.4f, 14f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(14f, 17.6f, 14.6f, 17f, 15.2f, 17f)
                verticalLineTo(14.5f)
                curveTo(15.2f, 13.1f, 16.6f, 12f, 18f, 12f)
                reflectiveCurveTo(20.8f, 13.1f, 20.8f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.5f)
                curveTo(19.5f, 13.7f, 18.8f, 13.2f, 18f, 13.2f)
                reflectiveCurveTo(16.5f, 13.7f, 16.5f, 14.5f)
                verticalLineTo(17f)
                horizontalLineTo(20.8f)
                curveTo(21.4f, 17f, 22f, 17.6f, 22f, 18.3f)
                moveTo(6f, 2f)
                curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.1f, 4.9f, 22f, 6f, 22f)
                horizontalLineTo(12f)
                verticalLineTo(18.2f)
                curveTo(12f, 17.2f, 12.4f, 16.5f, 13f, 16f)
                curveTo(13.1f, 15.9f, 13.2f, 15.9f, 13.2f, 15.8f)
                verticalLineTo(14.5f)
                curveTo(13.2f, 11.8f, 15.6f, 10f, 18f, 10f)
                curveTo(18.7f, 10f, 19.4f, 10.2f, 20f, 10.4f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                close()
            }
        }.build()

        return _FileLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _FileLockOpen: ImageVector? = null
