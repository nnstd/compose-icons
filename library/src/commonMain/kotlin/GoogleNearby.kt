package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleNearby: ImageVector
    get() {
        if (_GoogleNearby != null) {
            return _GoogleNearby!!
        }
        _GoogleNearby = ImageVector.Builder(
            name = "GoogleNearby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.36f, 10.46f)
                lineTo(13.54f, 2.64f)
                curveTo(12.69f, 1.79f, 11.31f, 1.79f, 10.46f, 2.64f)
                lineTo(2.64f, 10.46f)
                curveTo(1.79f, 11.31f, 1.79f, 12.69f, 2.64f, 13.54f)
                lineTo(10.46f, 21.36f)
                curveTo(11.31f, 22.21f, 12.69f, 22.21f, 13.54f, 21.36f)
                lineTo(21.36f, 13.54f)
                curveTo(22.21f, 12.69f, 22.21f, 11.31f, 21.36f, 10.46f)
                moveTo(12f, 19f)
                lineTo(5f, 12f)
                lineTo(12f, 5f)
                lineTo(19f, 12f)
                lineTo(12f, 19f)
                moveTo(16.5f, 12f)
                lineTo(12f, 16.5f)
                lineTo(7.5f, 12f)
                lineTo(12f, 7.5f)
                lineTo(16.5f, 12f)
                close()
            }
        }.build()

        return _GoogleNearby!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleNearby: ImageVector? = null
