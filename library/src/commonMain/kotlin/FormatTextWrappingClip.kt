package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextWrappingClip: ImageVector
    get() {
        if (_FormatTextWrappingClip != null) {
            return _FormatTextWrappingClip!!
        }
        _FormatTextWrappingClip = ImageVector.Builder(
            name = "FormatTextWrappingClip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                moveTo(17f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _FormatTextWrappingClip!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextWrappingClip: ImageVector? = null
