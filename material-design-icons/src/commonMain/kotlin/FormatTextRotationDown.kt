package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationDown: ImageVector
    get() {
        if (_FormatTextRotationDown != null) {
            return _FormatTextRotationDown!!
        }
        _FormatTextRotationDown = ImageVector.Builder(
            name = "FormatTextRotationDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 19.73f)
                lineTo(3f, 16.73f)
                horizontalLineTo(5f)
                verticalLineTo(4.27f)
                horizontalLineTo(7f)
                verticalLineTo(16.73f)
                horizontalLineTo(9f)
                lineTo(6f, 19.73f)
                moveTo(14f, 9.38f)
                verticalLineTo(13.13f)
                lineTo(19.03f, 11.25f)
                lineTo(14f, 9.38f)
                moveTo(21f, 12f)
                lineTo(10f, 16.73f)
                verticalLineTo(14.67f)
                lineTo(12.19f, 13.73f)
                verticalLineTo(8.77f)
                lineTo(10f, 7.83f)
                verticalLineTo(5.77f)
                lineTo(21f, 10.5f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FormatTextRotationDown!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationDown: ImageVector? = null
