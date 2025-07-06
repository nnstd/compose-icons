package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersTripleOutline: ImageVector
    get() {
        if (_LayersTripleOutline != null) {
            return _LayersTripleOutline!!
        }
        _LayersTripleOutline = ImageVector.Builder(
            name = "LayersTripleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16.54f)
                lineTo(19.37f, 10.8f)
                lineTo(21f, 12.07f)
                lineTo(12f, 19.07f)
                lineTo(3f, 12.07f)
                lineTo(4.62f, 10.81f)
                lineTo(12f, 16.54f)
                moveTo(12f, 14f)
                lineTo(3f, 7f)
                lineTo(12f, 0f)
                lineTo(21f, 7f)
                lineTo(12f, 14f)
                moveTo(12f, 2.53f)
                lineTo(6.26f, 7f)
                lineTo(12f, 11.47f)
                lineTo(17.74f, 7f)
                lineTo(12f, 2.53f)
                moveTo(12f, 21.47f)
                lineTo(19.37f, 15.73f)
                lineTo(21f, 17f)
                lineTo(12f, 24f)
                lineTo(3f, 17f)
                lineTo(4.62f, 15.74f)
                lineTo(12f, 21.47f)
            }
        }.build()

        return _LayersTripleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LayersTripleOutline: ImageVector? = null
