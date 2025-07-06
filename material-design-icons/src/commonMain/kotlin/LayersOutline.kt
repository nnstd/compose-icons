package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersOutline: ImageVector
    get() {
        if (_LayersOutline != null) {
            return _LayersOutline!!
        }
        _LayersOutline = ImageVector.Builder(
            name = "LayersOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18.54f)
                lineTo(19.37f, 12.8f)
                lineTo(21f, 14.07f)
                lineTo(12f, 21.07f)
                lineTo(3f, 14.07f)
                lineTo(4.62f, 12.81f)
                lineTo(12f, 18.54f)
                moveTo(12f, 16f)
                lineTo(3f, 9f)
                lineTo(12f, 2f)
                lineTo(21f, 9f)
                lineTo(12f, 16f)
                moveTo(12f, 4.53f)
                lineTo(6.26f, 9f)
                lineTo(12f, 13.47f)
                lineTo(17.74f, 9f)
                lineTo(12f, 4.53f)
                close()
            }
        }.build()

        return _LayersOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LayersOutline: ImageVector? = null
