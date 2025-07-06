package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Robber: ImageVector
    get() {
        if (_Robber != null) {
            return _Robber!!
        }
        _Robber = ImageVector.Builder(
            name = "Robber",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.7f, 12.5f)
                curveTo(10.7f, 12.8f, 9.4f, 13.2f, 8.4f, 13.2f)
                reflectiveCurveTo(6.3f, 12.5f, 6.3f, 12.3f)
                curveTo(6.3f, 12f, 7f, 11.1f, 8.6f, 11f)
                curveTo(9.5f, 10.9f, 10.5f, 11.5f, 10.7f, 12.5f)
                moveTo(15.4f, 11f)
                curveTo(14.4f, 10.9f, 13.5f, 11.5f, 13.3f, 12.5f)
                curveTo(13.3f, 12.8f, 14.5f, 13.2f, 15.6f, 13.2f)
                curveTo(16.7f, 13.2f, 17.7f, 12.5f, 17.7f, 12.3f)
                reflectiveCurveTo(17f, 11.1f, 15.4f, 11f)
                moveTo(22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                reflectiveCurveTo(2f, 17.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 2f, 12f, 2f)
                reflectiveCurveTo(22f, 6.5f, 22f, 12f)
                moveTo(20f, 11.2f)
                curveTo(20f, 9.2f, 19.3f, 8.5f, 16.7f, 8.5f)
                curveTo(14.1f, 8.5f, 13.3f, 9.6f, 12f, 9.6f)
                reflectiveCurveTo(10f, 8.5f, 7.3f, 8.5f)
                reflectiveCurveTo(4f, 9.1f, 4f, 11.2f)
                curveTo(4f, 14.6f, 5.5f, 16.5f, 7.6f, 16.5f)
                curveTo(9.2f, 16.5f, 10.4f, 14.5f, 12f, 14.5f)
                reflectiveCurveTo(14.7f, 16.5f, 16.4f, 16.5f)
                curveTo(18.5f, 16.5f, 20f, 14.6f, 20f, 11.2f)
                close()
            }
        }.build()

        return _Robber!!
    }

@Suppress("ObjectPropertyName")
private var _Robber: ImageVector? = null
