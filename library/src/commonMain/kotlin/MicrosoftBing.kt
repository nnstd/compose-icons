package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftBing: ImageVector
    get() {
        if (_MicrosoftBing != null) {
            return _MicrosoftBing!!
        }
        _MicrosoftBing = ImageVector.Builder(
            name = "MicrosoftBing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                verticalLineTo(19f)
                lineTo(8.72f, 21f)
                lineTo(18f, 15.82f)
                verticalLineTo(11.73f)
                horizontalLineTo(18f)
                lineTo(9.77f, 8.95f)
                lineTo(11.38f, 12.84f)
                lineTo(13.94f, 14f)
                lineTo(8.7f, 16.92f)
                verticalLineTo(4.27f)
                lineTo(5f, 3f)
            }
        }.build()

        return _MicrosoftBing!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftBing: ImageVector? = null
