package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StadiumOutline: ImageVector
    get() {
        if (_StadiumOutline != null) {
            return _StadiumOutline!!
        }
        _StadiumOutline = ImageVector.Builder(
            name = "StadiumOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 5f)
                lineTo(3f, 7f)
                verticalLineTo(3f)
                lineTo(7f, 5f)
                moveTo(18f, 3f)
                verticalLineTo(7f)
                lineTo(22f, 5f)
                lineTo(18f, 3f)
                moveTo(11f, 2f)
                verticalLineTo(6f)
                lineTo(15f, 4f)
                lineTo(11f, 2f)
                moveTo(13f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                curveTo(5.9f, 21.9f, 2f, 20.6f, 2f, 19f)
                verticalLineTo(10f)
                curveTo(2f, 8.3f, 6.5f, 7f, 12f, 7f)
                reflectiveCurveTo(22f, 8.3f, 22f, 10f)
                verticalLineTo(19f)
                curveTo(22f, 20.6f, 18f, 21.9f, 13f, 22f)
                verticalLineTo(18f)
                moveTo(5f, 10f)
                curveTo(6.4f, 10.5f, 8.8f, 11f, 12f, 11f)
                reflectiveCurveTo(17.6f, 10.5f, 19f, 10f)
                curveTo(19f, 9.8f, 16.2f, 9f, 12f, 9f)
                reflectiveCurveTo(5f, 9.9f, 5f, 10f)
                moveTo(20f, 11.8f)
                curveTo(18.2f, 12.5f, 15.3f, 13f, 12f, 13f)
                reflectiveCurveTo(5.8f, 12.5f, 4f, 11.8f)
                verticalLineTo(18.6f)
                curveTo(4.6f, 19f, 6.4f, 19.6f, 9f, 19.9f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(19.9f)
                curveTo(17.6f, 19.6f, 19.4f, 19f, 20f, 18.6f)
                verticalLineTo(11.8f)
                close()
            }
        }.build()

        return _StadiumOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StadiumOutline: ImageVector? = null
