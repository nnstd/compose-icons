package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TransitConnectionHorizontal: ImageVector
    get() {
        if (_TransitConnectionHorizontal != null) {
            return _TransitConnectionHorizontal!!
        }
        _TransitConnectionHorizontal = ImageVector.Builder(
            name = "TransitConnectionHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(10.7f, 9f, 9.6f, 9.8f, 9.2f, 11f)
                horizontalLineTo(6.8f)
                curveTo(6.4f, 9.8f, 5.3f, 9f, 4f, 9f)
                curveTo(2.3f, 9f, 1f, 10.3f, 1f, 12f)
                reflectiveCurveTo(2.3f, 15f, 4f, 15f)
                curveTo(5.3f, 15f, 6.4f, 14.2f, 6.8f, 13f)
                horizontalLineTo(9.2f)
                curveTo(9.6f, 14.2f, 10.7f, 15f, 12f, 15f)
                reflectiveCurveTo(14.4f, 14.2f, 14.8f, 13f)
                horizontalLineTo(17.2f)
                curveTo(17.6f, 14.2f, 18.7f, 15f, 20f, 15f)
                curveTo(21.7f, 15f, 23f, 13.7f, 23f, 12f)
                reflectiveCurveTo(21.7f, 9f, 20f, 9f)
                curveTo(18.7f, 9f, 17.6f, 9.8f, 17.2f, 11f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 9.8f, 13.3f, 9f, 12f, 9f)
                moveTo(3f, 12f)
                curveTo(3f, 11.4f, 3.4f, 11f, 4f, 11f)
                reflectiveCurveTo(5f, 11.4f, 5f, 12f)
                reflectiveCurveTo(4.6f, 13f, 4f, 13f)
                reflectiveCurveTo(3f, 12.6f, 3f, 12f)
                moveTo(21f, 12f)
                curveTo(21f, 12.6f, 20.6f, 13f, 20f, 13f)
                reflectiveCurveTo(19f, 12.6f, 19f, 12f)
                reflectiveCurveTo(19.4f, 11f, 20f, 11f)
                reflectiveCurveTo(21f, 11.4f, 21f, 12f)
                close()
            }
        }.build()

        return _TransitConnectionHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _TransitConnectionHorizontal: ImageVector? = null
