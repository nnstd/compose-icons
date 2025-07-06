package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mosque: ImageVector
    get() {
        if (_Mosque != null) {
            return _Mosque!!
        }
        _Mosque = ImageVector.Builder(
            name = "Mosque",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8f)
                horizontalLineTo(17f)
                curveTo(17.3f, 8f, 17.6f, 8.1f, 17.8f, 8.1f)
                curveTo(17.9f, 7.8f, 18f, 7.4f, 18f, 7.1f)
                curveTo(18f, 5.8f, 17.4f, 4.6f, 16.3f, 3.9f)
                lineTo(12f, 1f)
                lineTo(7.7f, 3.8f)
                curveTo(6.7f, 4.6f, 6f, 5.8f, 6f, 7.1f)
                curveTo(6f, 7.5f, 6.1f, 7.8f, 6.2f, 8.1f)
                curveTo(6.4f, 8.1f, 6.7f, 8f, 7f, 8f)
                moveTo(24f, 7f)
                curveTo(24f, 5.9f, 22f, 4f, 22f, 4f)
                reflectiveCurveTo(20f, 5.9f, 20f, 7f)
                curveTo(20f, 7.7f, 20.4f, 8.4f, 21f, 8.7f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                curveTo(19f, 9.9f, 18.1f, 9f, 17f, 9f)
                horizontalLineTo(7f)
                curveTo(5.9f, 9f, 5f, 9.9f, 5f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(8.7f)
                curveTo(3.6f, 8.4f, 4f, 7.7f, 4f, 7f)
                curveTo(4f, 5.9f, 2f, 4f, 2f, 4f)
                reflectiveCurveTo(0f, 5.9f, 0f, 7f)
                curveTo(0f, 7.7f, 0.4f, 8.4f, 1f, 8.7f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                curveTo(10f, 15.9f, 10.9f, 15f, 12f, 15f)
                reflectiveCurveTo(14f, 15.9f, 14f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(23f)
                verticalLineTo(8.7f)
                curveTo(23.6f, 8.4f, 24f, 7.7f, 24f, 7f)
                close()
            }
        }.build()

        return _Mosque!!
    }

@Suppress("ObjectPropertyName")
private var _Mosque: ImageVector? = null
