package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CellphoneMarker: ImageVector
    get() {
        if (_CellphoneMarker != null) {
            return _CellphoneMarker!!
        }
        _CellphoneMarker = ImageVector.Builder(
            name = "CellphoneMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 13f)
                curveTo(16.6f, 13f, 15f, 14.61f, 15f, 16.5f)
                curveTo(15f, 19.11f, 18.5f, 23f, 18.5f, 23f)
                reflectiveCurveTo(22f, 19.11f, 22f, 16.5f)
                curveTo(22f, 14.61f, 20.4f, 13f, 18.5f, 13f)
                moveTo(18.5f, 17.81f)
                curveTo(17.8f, 17.81f, 17.3f, 17.21f, 17.3f, 16.61f)
                curveTo(17.3f, 15.91f, 17.9f, 15.41f, 18.5f, 15.41f)
                reflectiveCurveTo(19.7f, 16f, 19.7f, 16.61f)
                curveTo(19.8f, 17.21f, 19.2f, 17.81f, 18.5f, 17.81f)
                moveTo(15.91f, 23f)
                horizontalLineTo(7f)
                curveTo(5.9f, 23f, 5f, 22.11f, 5f, 21f)
                verticalLineTo(3f)
                curveTo(5f, 1.89f, 5.89f, 1f, 7f, 1f)
                horizontalLineTo(17f)
                curveTo(18.1f, 1f, 19f, 1.89f, 19f, 3f)
                verticalLineTo(11.03f)
                curveTo(18.84f, 11f, 18.67f, 11f, 18.5f, 11f)
                curveTo(18f, 11f, 17.5f, 11.08f, 17f, 11.22f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(13.54f)
                curveTo(14.14f, 20.5f, 15.12f, 21.97f, 15.91f, 23f)
                close()
            }
        }.build()

        return _CellphoneMarker!!
    }

@Suppress("ObjectPropertyName")
private var _CellphoneMarker: ImageVector? = null
