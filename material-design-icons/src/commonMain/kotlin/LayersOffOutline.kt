package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersOffOutline: ImageVector
    get() {
        if (_LayersOffOutline != null) {
            return _LayersOffOutline!!
        }
        _LayersOffOutline = ImageVector.Builder(
            name = "LayersOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.53f)
                lineTo(10.83f, 5.44f)
                lineTo(9.41f, 4f)
                lineTo(12f, 2f)
                lineTo(21f, 9f)
                lineTo(17.28f, 11.89f)
                lineTo(15.85f, 10.47f)
                lineTo(17.74f, 9f)
                lineTo(12f, 4.53f)
                moveTo(21f, 14.07f)
                lineTo(20.13f, 14.75f)
                lineTo(18.7f, 13.32f)
                lineTo(19.37f, 12.8f)
                lineTo(21f, 14.07f)
                moveTo(3.41f, 0.86f)
                lineTo(22.14f, 19.59f)
                lineTo(20.73f, 21f)
                lineTo(16.95f, 17.22f)
                lineTo(12f, 21.07f)
                lineTo(3f, 14.07f)
                lineTo(4.62f, 12.81f)
                lineTo(12f, 18.54f)
                lineTo(15.5f, 15.79f)
                lineTo(14.1f, 14.37f)
                lineTo(12f, 16f)
                lineTo(3f, 9f)
                lineTo(6.22f, 6.5f)
                lineTo(2f, 2.27f)
                lineTo(3.41f, 0.86f)
                moveTo(12f, 13.47f)
                lineTo(12.67f, 12.94f)
                lineTo(7.65f, 7.92f)
                lineTo(6.26f, 9f)
                lineTo(12f, 13.47f)
                close()
            }
        }.build()

        return _LayersOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LayersOffOutline: ImageVector? = null
