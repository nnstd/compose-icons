package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftAzure: ImageVector
    get() {
        if (_MicrosoftAzure != null) {
            return _MicrosoftAzure!!
        }
        _MicrosoftAzure = ImageVector.Builder(
            name = "MicrosoftAzure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.05f, 4.24f)
                lineTo(6.56f, 18.05f)
                lineTo(2f, 18f)
                lineTo(7.09f, 9.24f)
                lineTo(13.05f, 4.24f)
                moveTo(13.75f, 5.33f)
                lineTo(22f, 19.76f)
                horizontalLineTo(6.74f)
                lineTo(16.04f, 18.1f)
                lineTo(11.17f, 12.31f)
                lineTo(13.75f, 5.33f)
                close()
            }
        }.build()

        return _MicrosoftAzure!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftAzure: ImageVector? = null
