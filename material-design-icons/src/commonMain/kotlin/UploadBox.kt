package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadBox: ImageVector
    get() {
        if (_UploadBox != null) {
            return _UploadBox!!
        }
        _UploadBox = ImageVector.Builder(
            name = "UploadBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                moveTo(16f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                moveTo(16f, 11f)
                lineTo(12f, 7f)
                lineTo(8f, 11f)
                horizontalLineTo(10.5f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _UploadBox!!
    }

@Suppress("ObjectPropertyName")
private var _UploadBox: ImageVector? = null
