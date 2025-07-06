package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraDocument: ImageVector
    get() {
        if (_CameraDocument != null) {
            return _CameraDocument!!
        }
        _CameraDocument = ImageVector.Builder(
            name = "CameraDocument",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                verticalLineTo(22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(14.72f)
                curveTo(14.38f, 7.6f, 13.74f, 8f, 13f, 8f)
                curveTo(13f, 9.11f, 12.1f, 10f, 11f, 10f)
                horizontalLineTo(8f)
                curveTo(6.9f, 10f, 6f, 9.1f, 6f, 8f)
                verticalLineTo(4f)
                curveTo(6f, 2.9f, 6.9f, 2f, 8f, 2f)
                horizontalLineTo(11f)
                curveTo(12.1f, 2f, 13f, 2.9f, 13f, 4f)
                curveTo(13.74f, 4f, 14.38f, 4.41f, 14.72f, 5f)
                horizontalLineTo(19f)
                curveTo(20.11f, 5f, 21f, 5.89f, 21f, 7f)
                moveTo(6f, 15f)
                horizontalLineTo(13f)
                lineTo(11f, 11f)
                horizontalLineTo(8f)
                lineTo(6f, 15f)
                close()
            }
        }.build()

        return _CameraDocument!!
    }

@Suppress("ObjectPropertyName")
private var _CameraDocument: ImageVector? = null
