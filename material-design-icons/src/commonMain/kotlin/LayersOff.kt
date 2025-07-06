package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersOff: ImageVector
    get() {
        if (_LayersOff != null) {
            return _LayersOff!!
        }
        _LayersOff = ImageVector.Builder(
            name = "LayersOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.27f, 1f)
                lineTo(2f, 2.27f)
                lineTo(6.22f, 6.5f)
                lineTo(3f, 9f)
                lineTo(4.63f, 10.27f)
                lineTo(12f, 16f)
                lineTo(14.1f, 14.37f)
                lineTo(15.53f, 15.8f)
                lineTo(12f, 18.54f)
                lineTo(4.63f, 12.81f)
                lineTo(3f, 14.07f)
                lineTo(12f, 21.07f)
                lineTo(16.95f, 17.22f)
                lineTo(20.73f, 21f)
                lineTo(22f, 19.73f)
                lineTo(3.27f, 1f)
                moveTo(19.36f, 10.27f)
                lineTo(21f, 9f)
                lineTo(12f, 2f)
                lineTo(9.09f, 4.27f)
                lineTo(16.96f, 12.15f)
                lineTo(19.36f, 10.27f)
                moveTo(19.81f, 15f)
                lineTo(21f, 14.07f)
                lineTo(19.57f, 12.64f)
                lineTo(18.38f, 13.56f)
                lineTo(19.81f, 15f)
                close()
            }
        }.build()

        return _LayersOff!!
    }

@Suppress("ObjectPropertyName")
private var _LayersOff: ImageVector? = null
