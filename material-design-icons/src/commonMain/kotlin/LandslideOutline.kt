package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LandslideOutline: ImageVector
    get() {
        if (_LandslideOutline != null) {
            return _LandslideOutline!!
        }
        _LandslideOutline = ImageVector.Builder(
            name = "LandslideOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 12f)
                lineTo(8f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                lineTo(16f, 14f)
                lineTo(11f, 12f)
                moveTo(12.53f, 14.77f)
                lineTo(6f, 16.95f)
                lineTo(4f, 16.28f)
                verticalLineTo(14.39f)
                lineTo(6f, 15.06f)
                lineTo(9.95f, 13.74f)
                lineTo(12.53f, 14.77f)
                moveTo(7f, 10f)
                lineTo(8.57f, 12.09f)
                lineTo(6f, 12.95f)
                lineTo(4f, 12.28f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                moveTo(4f, 20f)
                verticalLineTo(18.39f)
                lineTo(6f, 19.06f)
                lineTo(15.03f, 16.05f)
                lineTo(18f, 20f)
                horizontalLineTo(4f)
                moveTo(17f, 6f)
                verticalLineTo(1f)
                lineTo(12f, 0f)
                lineTo(9f, 2f)
                verticalLineTo(6f)
                lineTo(12f, 8f)
                lineTo(17f, 6f)
                moveTo(11f, 3.07f)
                lineTo(12.42f, 2.12f)
                lineTo(15f, 2.64f)
                verticalLineTo(4.65f)
                lineTo(12.23f, 5.76f)
                lineTo(11f, 4.93f)
                verticalLineTo(3.07f)
                moveTo(18.5f, 7f)
                lineTo(16f, 9f)
                verticalLineTo(12f)
                lineTo(18.5f, 14f)
                lineTo(23f, 12f)
                verticalLineTo(8f)
                lineTo(18.5f, 7f)
                moveTo(21f, 10.7f)
                lineTo(18.8f, 11.68f)
                lineTo(18f, 11.04f)
                verticalLineTo(9.96f)
                lineTo(19f, 9.16f)
                lineTo(21f, 9.6f)
                verticalLineTo(10.7f)
                close()
            }
        }.build()

        return _LandslideOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LandslideOutline: ImageVector? = null
