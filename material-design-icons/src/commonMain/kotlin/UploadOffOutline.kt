package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadOffOutline: ImageVector
    get() {
        if (_UploadOffOutline != null) {
            return _UploadOffOutline!!
        }
        _UploadOffOutline = ImageVector.Builder(
            name = "UploadOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.56f, 8.45f)
                lineTo(5f, 10f)
                horizontalLineTo(8.11f)
                lineTo(9f, 10.89f)
                verticalLineTo(16f)
                horizontalLineTo(14.11f)
                lineTo(16.11f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11f, 14f)
                verticalLineTo(12.89f)
                lineTo(12.11f, 14f)
                horizontalLineTo(11f)
                moveTo(12f, 5.8f)
                lineTo(14.2f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(9.8f)
                lineTo(15f, 11.8f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                lineTo(12f, 3f)
                lineTo(9.1f, 5.9f)
                lineTo(10.5f, 7.3f)
                lineTo(12f, 5.8f)
                close()
            }
        }.build()

        return _UploadOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UploadOffOutline: ImageVector? = null
