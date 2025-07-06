package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftVisualStudio: ImageVector
    get() {
        if (_MicrosoftVisualStudio != null) {
            return _MicrosoftVisualStudio!!
        }
        _MicrosoftVisualStudio = ImageVector.Builder(
            name = "MicrosoftVisualStudio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 8.5f)
                lineTo(12.25f, 12.32f)
                lineTo(17f, 16f)
                verticalLineTo(8.5f)
                moveTo(4.7f, 18.4f)
                lineTo(2f, 16.7f)
                verticalLineTo(7.7f)
                lineTo(5f, 6.7f)
                lineTo(9.3f, 10.03f)
                lineTo(18f, 2f)
                lineTo(22f, 4.5f)
                verticalLineTo(20f)
                lineTo(17f, 22f)
                lineTo(9.34f, 14.66f)
                lineTo(4.7f, 18.4f)
                moveTo(5f, 14f)
                lineTo(6.86f, 12.28f)
                lineTo(5f, 10.5f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _MicrosoftVisualStudio!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftVisualStudio: ImageVector? = null
