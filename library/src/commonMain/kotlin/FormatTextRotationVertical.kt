package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextRotationVertical: ImageVector
    get() {
        if (_FormatTextRotationVertical != null) {
            return _FormatTextRotationVertical!!
        }
        _FormatTextRotationVertical = ImageVector.Builder(
            name = "FormatTextRotationVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.75f, 5f)
                horizontalLineTo(14.25f)
                lineTo(9.5f, 16f)
                horizontalLineTo(11.6f)
                lineTo(12.5f, 13.8f)
                horizontalLineTo(17.5f)
                lineTo(18.4f, 16f)
                horizontalLineTo(20.5f)
                lineTo(15.75f, 5f)
                moveTo(13.13f, 12f)
                lineTo(15f, 7f)
                lineTo(16.87f, 12f)
                horizontalLineTo(13.13f)
                moveTo(6f, 19.75f)
                lineTo(9f, 16.75f)
                horizontalLineTo(7f)
                verticalLineTo(4.25f)
                horizontalLineTo(5f)
                verticalLineTo(16.75f)
                horizontalLineTo(3f)
                lineTo(6f, 19.75f)
                close()
            }
        }.build()

        return _FormatTextRotationVertical!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextRotationVertical: ImageVector? = null
