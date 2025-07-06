package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MopedElectric: ImageVector
    get() {
        if (_MopedElectric != null) {
            return _MopedElectric!!
        }
        _MopedElectric = ImageVector.Builder(
            name = "MopedElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                curveTo(19f, 3.9f, 18.1f, 3f, 17f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(7.65f)
                lineTo(13.5f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                curveTo(3.79f, 7f, 2f, 8.79f, 2f, 11f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                curveTo(4f, 15.66f, 5.34f, 17f, 7f, 17f)
                reflectiveCurveTo(10f, 15.66f, 10f, 14f)
                horizontalLineTo(14.5f)
                lineTo(19f, 8.35f)
                verticalLineTo(5f)
                moveTo(7f, 15f)
                curveTo(6.45f, 15f, 6f, 14.55f, 6f, 14f)
                horizontalLineTo(8f)
                curveTo(8f, 14.55f, 7.55f, 15f, 7f, 15f)
                moveTo(5f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                moveTo(19f, 11f)
                curveTo(17.34f, 11f, 16f, 12.34f, 16f, 14f)
                reflectiveCurveTo(17.34f, 17f, 19f, 17f)
                reflectiveCurveTo(22f, 15.66f, 22f, 14f)
                reflectiveCurveTo(20.66f, 11f, 19f, 11f)
                moveTo(19f, 15f)
                curveTo(18.45f, 15f, 18f, 14.55f, 18f, 14f)
                reflectiveCurveTo(18.45f, 13f, 19f, 13f)
                reflectiveCurveTo(20f, 13.45f, 20f, 14f)
                reflectiveCurveTo(19.55f, 15f, 19f, 15f)
                moveTo(7f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                lineTo(17f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(23f)
                lineTo(7f, 20f)
                close()
            }
        }.build()

        return _MopedElectric!!
    }

@Suppress("ObjectPropertyName")
private var _MopedElectric: ImageVector? = null
