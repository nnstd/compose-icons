package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UploadMultiple: ImageVector
    get() {
        if (_UploadMultiple != null) {
            return _UploadMultiple!!
        }
        _UploadMultiple = ImageVector.Builder(
            name = "UploadMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(19f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                moveTo(5f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                moveTo(19f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _UploadMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _UploadMultiple: ImageVector? = null
