package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerAlert: ImageVector
    get() {
        if (_ThermometerAlert != null) {
            return _ThermometerAlert!!
        }
        _ThermometerAlert = ImageVector.Builder(
            name = "ThermometerAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                moveTo(17f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                moveTo(13f, 13f)
                verticalLineTo(5f)
                curveTo(13f, 3.3f, 11.7f, 2f, 10f, 2f)
                reflectiveCurveTo(7f, 3.3f, 7f, 5f)
                verticalLineTo(13f)
                curveTo(4.8f, 14.7f, 4.3f, 17.8f, 6f, 20f)
                reflectiveCurveTo(10.8f, 22.7f, 13f, 21f)
                reflectiveCurveTo(15.7f, 16.2f, 14f, 14f)
                curveTo(13.7f, 13.6f, 13.4f, 13.3f, 13f, 13f)
                moveTo(10f, 4f)
                curveTo(10.6f, 4f, 11f, 4.4f, 11f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                curveTo(9f, 4.4f, 9.4f, 4f, 10f, 4f)
                close()
            }
        }.build()

        return _ThermometerAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerAlert: ImageVector? = null
