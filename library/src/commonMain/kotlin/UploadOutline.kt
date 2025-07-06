package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadOutline: ImageVector
    get() {
        if (_UploadOutline != null) {
            return _UploadOutline!!
        }
        _UploadOutline = ImageVector.Builder(
            name = "UploadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                lineTo(12f, 3f)
                lineTo(5f, 10f)
                horizontalLineTo(9f)
                moveTo(12f, 5.8f)
                lineTo(14.2f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(9.8f)
                lineTo(12f, 5.8f)
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _UploadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UploadOutline: ImageVector? = null
