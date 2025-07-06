package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChiliMild: ImageVector
    get() {
        if (_ChiliMild != null) {
            return _ChiliMild!!
        }
        _ChiliMild = ImageVector.Builder(
            name = "ChiliMild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10f)
                verticalLineTo(22f)
                curveTo(16f, 22f, 8f, 20f, 8f, 11f)
                verticalLineTo(10f)
                curveTo(8f, 9.27f, 8.4f, 8.63f, 9f, 8.28f)
                lineTo(10.25f, 9f)
                lineTo(12f, 8f)
                lineTo(13.75f, 9f)
                lineTo(15f, 8.28f)
                curveTo(15.6f, 8.63f, 16f, 9.27f, 16f, 10f)
                moveTo(12f, 6.5f)
                lineTo(13.75f, 7.5f)
                lineTo(15.27f, 6.63f)
                curveTo(14.72f, 5.66f, 13.91f, 4.94f, 12.97f, 4.65f)
                curveTo(12.79f, 3.16f, 11.54f, 2f, 10f, 2f)
                verticalLineTo(4f)
                curveTo(10.44f, 4f, 10.8f, 4.29f, 10.94f, 4.69f)
                curveTo(10.03f, 5f, 9.26f, 5.7f, 8.73f, 6.63f)
                lineTo(10.25f, 7.5f)
                lineTo(12f, 6.5f)
                close()
            }
        }.build()

        return _ChiliMild!!
    }

@Suppress("ObjectPropertyName")
private var _ChiliMild: ImageVector? = null
