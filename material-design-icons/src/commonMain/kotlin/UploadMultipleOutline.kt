package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadMultipleOutline: ImageVector
    get() {
        if (_UploadMultipleOutline != null) {
            return _UploadMultipleOutline!!
        }
        _UploadMultipleOutline = ImageVector.Builder(
            name = "UploadMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(19f, 8f)
                moveTo(14.17f, 6f)
                lineTo(12f, 3.83f)
                lineTo(9.83f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(14.17f)
                moveTo(5f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                moveTo(19f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _UploadMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UploadMultipleOutline: ImageVector? = null
