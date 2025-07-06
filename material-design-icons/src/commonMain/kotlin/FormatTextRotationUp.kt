package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationUp: ImageVector
    get() {
        if (_FormatTextRotationUp != null) {
            return _FormatTextRotationUp!!
        }
        _FormatTextRotationUp = ImageVector.Builder(
            name = "FormatTextRotationUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12f)
                verticalLineTo(13.5f)
                lineTo(14f, 18.25f)
                verticalLineTo(16.15f)
                lineTo(11.8f, 15.25f)
                verticalLineTo(10.25f)
                lineTo(14f, 9.35f)
                verticalLineTo(7.25f)
                lineTo(3f, 12f)
                moveTo(10f, 14.62f)
                lineTo(5f, 12.75f)
                lineTo(10f, 10.88f)
                verticalLineTo(14.62f)
                moveTo(18f, 4.25f)
                lineTo(15f, 7.25f)
                horizontalLineTo(17f)
                verticalLineTo(19.75f)
                horizontalLineTo(19f)
                verticalLineTo(7.25f)
                horizontalLineTo(21f)
                lineTo(18f, 4.25f)
                close()
            }
        }.build()

        return _FormatTextRotationUp!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationUp: ImageVector? = null
