package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rickshaw: ImageVector
    get() {
        if (_Rickshaw != null) {
            return _Rickshaw!!
        }
        _Rickshaw = ImageVector.Builder(
            name = "Rickshaw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14.05f)
                verticalLineTo(12.73f)
                curveTo(20f, 12.26f, 19.84f, 11.8f, 19.54f, 11.44f)
                lineTo(15.6f, 6.72f)
                curveTo(15.22f, 6.26f, 14.66f, 6f, 14.06f, 6f)
                horizontalLineTo(4f)
                curveTo(2.9f, 6f, 2f, 6.9f, 2f, 8f)
                verticalLineTo(15f)
                curveTo(2f, 16.1f, 2.9f, 17f, 4f, 17f)
                horizontalLineTo(4.05f)
                curveTo(4.28f, 18.14f, 5.29f, 19f, 6.5f, 19f)
                reflectiveCurveTo(8.72f, 18.14f, 8.95f, 17f)
                horizontalLineTo(17.05f)
                curveTo(17.28f, 18.14f, 18.29f, 19f, 19.5f, 19f)
                curveTo(20.88f, 19f, 22f, 17.88f, 22f, 16.5f)
                curveTo(22f, 15.29f, 21.14f, 14.28f, 20f, 14.05f)
                moveTo(3.5f, 8f)
                curveTo(3.5f, 7.73f, 3.73f, 7.5f, 4f, 7.5f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(3.5f)
                verticalLineTo(8f)
                moveTo(6.5f, 17.5f)
                curveTo(5.95f, 17.5f, 5.5f, 17.05f, 5.5f, 16.5f)
                reflectiveCurveTo(5.95f, 15.5f, 6.5f, 15.5f)
                reflectiveCurveTo(7.5f, 15.95f, 7.5f, 16.5f)
                reflectiveCurveTo(7.05f, 17.5f, 6.5f, 17.5f)
                moveTo(13f, 15.5f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(7.5f)
                horizontalLineTo(13f)
                verticalLineTo(15.5f)
                moveTo(15f, 8.34f)
                lineTo(18.05f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(8.34f)
                moveTo(19.5f, 17.5f)
                curveTo(18.95f, 17.5f, 18.5f, 17.05f, 18.5f, 16.5f)
                reflectiveCurveTo(18.95f, 15.5f, 19.5f, 15.5f)
                reflectiveCurveTo(20.5f, 15.95f, 20.5f, 16.5f)
                reflectiveCurveTo(20.05f, 17.5f, 19.5f, 17.5f)
                close()
            }
        }.build()

        return _Rickshaw!!
    }

@Suppress("ObjectPropertyName")
private var _Rickshaw: ImageVector? = null
