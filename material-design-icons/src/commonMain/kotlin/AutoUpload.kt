package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AutoUpload: ImageVector
    get() {
        if (_AutoUpload != null) {
            return _AutoUpload!!
        }
        _AutoUpload = ImageVector.Builder(
            name = "AutoUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.35f, 12.65f)
                lineTo(6.5f, 9f)
                lineTo(7.65f, 12.65f)
                moveTo(5.5f, 7f)
                lineTo(2.3f, 16f)
                horizontalLineTo(4.2f)
                lineTo(4.9f, 14f)
                horizontalLineTo(8.1f)
                lineTo(8.8f, 16f)
                horizontalLineTo(10.7f)
                lineTo(7.5f, 7f)
                moveTo(11f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                moveTo(14f, 16f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                lineTo(16.5f, 5.5f)
                lineTo(11f, 11f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _AutoUpload!!
    }

@Suppress("ObjectPropertyName")
private var _AutoUpload: ImageVector? = null
