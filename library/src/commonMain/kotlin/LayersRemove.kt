package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LayersRemove: ImageVector
    get() {
        if (_LayersRemove != null) {
            return _LayersRemove!!
        }
        _LayersRemove = ImageVector.Builder(
            name = "LayersRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.46f, 15.88f)
                lineTo(15.88f, 14.46f)
                lineTo(18f, 16.59f)
                lineTo(20.12f, 14.46f)
                lineTo(21.54f, 15.88f)
                lineTo(19.41f, 18f)
                lineTo(21.54f, 20.12f)
                lineTo(20.12f, 21.54f)
                lineTo(18f, 19.41f)
                lineTo(15.88f, 21.54f)
                lineTo(14.46f, 20.12f)
                lineTo(16.59f, 18f)
                lineTo(14.46f, 15.88f)
                moveTo(11f, 16f)
                lineTo(2f, 9f)
                lineTo(11f, 2f)
                lineTo(20f, 9f)
                lineTo(11f, 16f)
                moveTo(11f, 18.54f)
                lineTo(12f, 17.75f)
                verticalLineTo(18f)
                curveTo(12f, 18.71f, 12.12f, 19.39f, 12.35f, 20f)
                lineTo(11f, 21.07f)
                lineTo(2f, 14.07f)
                lineTo(3.62f, 12.81f)
                lineTo(11f, 18.54f)
                close()
            }
        }.build()

        return _LayersRemove!!
    }

@Suppress("ObjectPropertyName")
private var _LayersRemove: ImageVector? = null
