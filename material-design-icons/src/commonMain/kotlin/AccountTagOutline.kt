package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTagOutline: ImageVector
    get() {
        if (_AccountTagOutline != null) {
            return _AccountTagOutline!!
        }
        _AccountTagOutline = ImageVector.Builder(
            name = "AccountTagOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.4f, 16f)
                curveTo(15.1f, 16f, 14.8f, 15.7f, 14.8f, 15.4f)
                curveTo(14.8f, 15.1f, 15.1f, 14.8f, 15.4f, 14.8f)
                curveTo(15.7f, 14.8f, 16f, 15.1f, 16f, 15.4f)
                curveTo(16f, 15.7f, 15.7f, 16f, 15.4f, 16f)
                moveTo(21.8f, 17.8f)
                lineTo(18.2f, 14.2f)
                curveTo(18f, 14.1f, 17.8f, 14f, 17.6f, 14f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 14f, 14f, 14.4f, 14f, 14.8f)
                verticalLineTo(17.6f)
                curveTo(14f, 17.8f, 14.1f, 18f, 14.2f, 18.2f)
                lineTo(17.8f, 21.8f)
                curveTo(17.9f, 21.9f, 18.1f, 22f, 18.4f, 22f)
                reflectiveCurveTo(18.8f, 21.9f, 19f, 21.8f)
                lineTo(21.8f, 19f)
                curveTo(21.9f, 18.9f, 22f, 18.7f, 22f, 18.4f)
                curveTo(22f, 18.2f, 21.9f, 18f, 21.8f, 17.8f)
                moveTo(10f, 4f)
                curveTo(7.8f, 4f, 6f, 5.8f, 6f, 8f)
                reflectiveCurveTo(7.8f, 12f, 10f, 12f)
                reflectiveCurveTo(14f, 10.2f, 14f, 8f)
                reflectiveCurveTo(12.2f, 4f, 10f, 4f)
                moveTo(10f, 6f)
                curveTo(11.1f, 6f, 12f, 6.9f, 12f, 8f)
                reflectiveCurveTo(11.1f, 10f, 10f, 10f)
                reflectiveCurveTo(8f, 9.1f, 8f, 8f)
                reflectiveCurveTo(8.9f, 6f, 10f, 6f)
                moveTo(10f, 13f)
                curveTo(7.3f, 13f, 2f, 14.3f, 2f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(13.2f)
                lineTo(12.8f, 19.6f)
                curveTo(12.4f, 19.2f, 12.1f, 18.7f, 12f, 18.1f)
                horizontalLineTo(3.9f)
                verticalLineTo(17f)
                curveTo(3.9f, 16.4f, 7f, 14.9f, 10f, 14.9f)
                curveTo(10.7f, 14.9f, 11.4f, 15f, 12f, 15.1f)
                verticalLineTo(14.8f)
                curveTo(12f, 14.2f, 12.2f, 13.7f, 12.5f, 13.3f)
                curveTo(11.6f, 13.1f, 10.7f, 13f, 10f, 13f)
                close()
            }
        }.build()

        return _AccountTagOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTagOutline: ImageVector? = null
