package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftAzureDevops: ImageVector
    get() {
        if (_MicrosoftAzureDevops != null) {
            return _MicrosoftAzureDevops!!
        }
        _MicrosoftAzureDevops = ImageVector.Builder(
            name = "MicrosoftAzureDevops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                lineTo(17f, 22f)
                lineTo(9f, 19f)
                verticalLineTo(22f)
                lineTo(4.81f, 16.25f)
                lineTo(17.72f, 17.3f)
                verticalLineTo(6.34f)
                lineTo(22f, 5.65f)
                verticalLineTo(18f)
                moveTo(4.81f, 16.25f)
                verticalLineTo(8.96f)
                lineTo(17.72f, 6.34f)
                lineTo(10.6f, 2f)
                verticalLineTo(4.84f)
                lineTo(3.97f, 6.76f)
                lineTo(2f, 9.38f)
                verticalLineTo(15.07f)
                lineTo(4.81f, 16.25f)
                close()
            }
        }.build()

        return _MicrosoftAzureDevops!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftAzureDevops: ImageVector? = null
