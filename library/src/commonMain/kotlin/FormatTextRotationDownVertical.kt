package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationDownVertical: ImageVector
    get() {
        if (_FormatTextRotationDownVertical != null) {
            return _FormatTextRotationDownVertical!!
        }
        _FormatTextRotationDownVertical = ImageVector.Builder(
            name = "FormatTextRotationDownVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.25f, 4f)
                horizontalLineTo(13.75f)
                lineTo(9f, 15f)
                horizontalLineTo(11.1f)
                lineTo(12f, 12.8f)
                horizontalLineTo(17f)
                lineTo(17.9f, 15f)
                horizontalLineTo(20f)
                lineTo(15.25f, 4f)
                moveTo(12.63f, 11f)
                lineTo(14.5f, 6f)
                lineTo(16.37f, 11f)
                horizontalLineTo(12.63f)
                moveTo(5f, 17.5f)
                lineTo(8f, 14.5f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(14.5f)
                horizontalLineTo(2f)
                lineTo(5f, 17.5f)
                moveTo(22f, 20f)
                lineTo(19f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(6.5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                lineTo(22f, 20f)
                close()
            }
        }.build()

        return _FormatTextRotationDownVertical!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationDownVertical: ImageVector? = null
