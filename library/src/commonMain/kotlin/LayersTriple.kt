package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersTriple: ImageVector
    get() {
        if (_LayersTriple != null) {
            return _LayersTriple!!
        }
        _LayersTriple = ImageVector.Builder(
            name = "LayersTriple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineTo(3f, 7f)
                lineTo(4.63f, 8.27f)
                lineTo(12f, 14f)
                lineTo(19.36f, 8.27f)
                lineTo(21f, 7f)
                lineTo(12f, 0f)
                moveTo(19.37f, 10.73f)
                lineTo(12f, 16.47f)
                lineTo(4.62f, 10.74f)
                lineTo(3f, 12f)
                lineTo(12f, 19f)
                lineTo(21f, 12f)
                lineTo(19.37f, 10.73f)
                moveTo(19.37f, 15.73f)
                lineTo(12f, 21.47f)
                lineTo(4.62f, 15.74f)
                lineTo(3f, 17f)
                lineTo(12f, 24f)
                lineTo(21f, 17f)
                lineTo(19.37f, 15.73f)
                close()
            }
        }.build()

        return _LayersTriple!!
    }

@Suppress("ObjectPropertyName")
private var _LayersTriple: ImageVector? = null
