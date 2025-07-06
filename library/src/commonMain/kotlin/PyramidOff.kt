package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PyramidOff: ImageVector
    get() {
        if (_PyramidOff != null) {
            return _PyramidOff!!
        }
        _PyramidOff = ImageVector.Builder(
            name = "PyramidOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 7.3f)
                lineTo(9.05f, 5.85f)
                lineTo(11.15f, 2.47f)
                curveTo(11.35f, 2.16f, 11.67f, 2f, 12f, 2f)
                curveTo(12.33f, 2f, 12.65f, 2.16f, 12.85f, 2.47f)
                lineTo(21.85f, 16.96f)
                horizontalLineTo(21.85f)
                curveTo(22.13f, 17.4f, 22f, 18f, 21.5f, 18.32f)
                lineTo(18.41f, 15.21f)
                lineTo(13f, 6.5f)
                verticalLineTo(9.8f)
                lineTo(11f, 7.8f)
                verticalLineTo(6.5f)
                lineTo(10.5f, 7.3f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(17.89f, 19.78f)
                lineTo(12.36f, 21.93f)
                curveTo(12.25f, 22f, 12.12f, 22f, 12f, 22f)
                reflectiveCurveTo(11.75f, 22f, 11.64f, 21.93f)
                lineTo(2.64f, 18.43f)
                curveTo(2f, 18.18f, 1.84f, 17.45f, 2.15f, 16.96f)
                horizontalLineTo(2.15f)
                lineTo(7.1f, 9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5.42f, 15.5f)
                lineTo(11f, 13.32f)
                verticalLineTo(12.89f)
                lineTo(8.55f, 10.44f)
                lineTo(5.42f, 15.5f)
                moveTo(16.35f, 18.24f)
                lineTo(13.94f, 15.83f)
                lineTo(12f, 15.07f)
                lineTo(5.76f, 17.5f)
                lineTo(12f, 19.93f)
                lineTo(16.35f, 18.24f)
                close()
            }
        }.build()

        return _PyramidOff!!
    }

@Suppress("ObjectPropertyName")
private var _PyramidOff: ImageVector? = null
