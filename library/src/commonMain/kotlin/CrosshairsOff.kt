package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrosshairsOff: ImageVector
    get() {
        if (_CrosshairsOff != null) {
            return _CrosshairsOff!!
        }
        _CrosshairsOff = ImageVector.Builder(
            name = "CrosshairsOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 11f)
                curveTo(20.5f, 6.83f, 17.17f, 3.5f, 13f, 3.06f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(3.06f)
                curveTo(9.87f, 3.18f, 8.81f, 3.5f, 7.84f, 4.03f)
                lineTo(9.34f, 5.53f)
                curveTo(10.16f, 5.19f, 11.06f, 5f, 12f, 5f)
                curveTo(15.87f, 5f, 19f, 8.13f, 19f, 12f)
                curveTo(19f, 12.94f, 18.81f, 13.84f, 18.5f, 14.65f)
                lineTo(20f, 16.15f)
                curveTo(20.5f, 15.19f, 20.82f, 14.13f, 20.95f, 13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(20.94f)
                moveTo(3f, 4.27f)
                lineTo(5.04f, 6.31f)
                curveTo(3.97f, 7.62f, 3.25f, 9.23f, 3.06f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(3.06f)
                curveTo(3.5f, 17.17f, 6.83f, 20.5f, 11f, 20.94f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(20.94f)
                curveTo(14.77f, 20.74f, 16.38f, 20.03f, 17.69f, 18.96f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                moveTo(16.27f, 17.54f)
                curveTo(15.09f, 18.45f, 13.61f, 19f, 12f, 19f)
                curveTo(8.13f, 19f, 5f, 15.87f, 5f, 12f)
                curveTo(5f, 10.39f, 5.55f, 8.91f, 6.46f, 7.73f)
                lineTo(16.27f, 17.54f)
                close()
            }
        }.build()

        return _CrosshairsOff!!
    }

@Suppress("ObjectPropertyName")
private var _CrosshairsOff: ImageVector? = null
