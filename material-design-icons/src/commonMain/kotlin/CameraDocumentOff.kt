package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraDocumentOff: ImageVector
    get() {
        if (_CameraDocumentOff != null) {
            return _CameraDocumentOff!!
        }
        _CameraDocumentOff = ImageVector.Builder(
            name = "CameraDocumentOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(20.11f, 22f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(18.11f)
                lineTo(12.89f, 14.78f)
                lineTo(13f, 15f)
                horizontalLineTo(6f)
                lineTo(8f, 11f)
                horizontalLineTo(9.11f)
                lineTo(8.11f, 10f)
                horizontalLineTo(8f)
                curveTo(6.9f, 10f, 6f, 9.1f, 6f, 8f)
                verticalLineTo(7.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(13f, 8f)
                curveTo(13.74f, 8f, 14.38f, 7.6f, 14.72f, 7f)
                horizontalLineTo(19f)
                verticalLineTo(15.8f)
                lineTo(21f, 17.8f)
                verticalLineTo(7f)
                curveTo(21f, 5.89f, 20.11f, 5f, 19f, 5f)
                horizontalLineTo(14.72f)
                curveTo(14.38f, 4.41f, 13.74f, 4f, 13f, 4f)
                curveTo(13f, 2.9f, 12.1f, 2f, 11f, 2f)
                horizontalLineTo(8f)
                curveTo(7.24f, 2f, 6.59f, 2.43f, 6.25f, 3.05f)
                lineTo(12.5f, 9.3f)
                curveTo(12.81f, 8.95f, 13f, 8.5f, 13f, 8f)
                close()
            }
        }.build()

        return _CameraDocumentOff!!
    }

@Suppress("ObjectPropertyName")
private var _CameraDocumentOff: ImageVector? = null
