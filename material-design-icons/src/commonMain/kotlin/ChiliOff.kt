package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChiliOff: ImageVector
    get() {
        if (_ChiliOff != null) {
            return _ChiliOff!!
        }
        _ChiliOff = ImageVector.Builder(
            name = "ChiliOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8.28f)
                curveTo(15.6f, 8.63f, 16f, 9.27f, 16f, 10f)
                verticalLineTo(12.8f)
                lineTo(11.5f, 8.29f)
                lineTo(12f, 8f)
                lineTo(13.75f, 9f)
                lineTo(15f, 8.28f)
                moveTo(12f, 6.5f)
                lineTo(13.75f, 7.5f)
                lineTo(15.27f, 6.63f)
                curveTo(14.72f, 5.66f, 13.91f, 4.94f, 12.97f, 4.65f)
                curveTo(12.79f, 3.16f, 11.54f, 2f, 10f, 2f)
                verticalLineTo(4f)
                curveTo(10.44f, 4f, 10.8f, 4.29f, 10.94f, 4.69f)
                curveTo(10.26f, 4.92f, 9.66f, 5.37f, 9.17f, 5.97f)
                lineTo(10.54f, 7.34f)
                lineTo(12f, 6.5f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(8f, 9.9f)
                curveTo(8f, 9.94f, 8f, 9.97f, 8f, 10f)
                verticalLineTo(11f)
                curveTo(8f, 20f, 16f, 22f, 16f, 22f)
                verticalLineTo(17.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }.build()

        return _ChiliOff!!
    }

@Suppress("ObjectPropertyName")
private var _ChiliOff: ImageVector? = null
