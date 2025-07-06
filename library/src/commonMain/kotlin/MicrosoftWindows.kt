package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftWindows: ImageVector
    get() {
        if (_MicrosoftWindows != null) {
            return _MicrosoftWindows!!
        }
        _MicrosoftWindows = ImageVector.Builder(
            name = "MicrosoftWindows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 12f)
                verticalLineTo(6.75f)
                lineTo(9f, 5.43f)
                verticalLineTo(11.91f)
                lineTo(3f, 12f)
                moveTo(20f, 3f)
                verticalLineTo(11.75f)
                lineTo(10f, 11.9f)
                verticalLineTo(5.21f)
                lineTo(20f, 3f)
                moveTo(3f, 13f)
                lineTo(9f, 13.09f)
                verticalLineTo(19.9f)
                lineTo(3f, 18.75f)
                verticalLineTo(13f)
                moveTo(20f, 13.25f)
                verticalLineTo(22f)
                lineTo(10f, 20.09f)
                verticalLineTo(13.1f)
                lineTo(20f, 13.25f)
                close()
            }
        }.build()

        return _MicrosoftWindows!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftWindows: ImageVector? = null
