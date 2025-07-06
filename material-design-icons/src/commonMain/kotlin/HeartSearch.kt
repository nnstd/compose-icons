package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartSearch: ImageVector
    get() {
        if (_HeartSearch != null) {
            return _HeartSearch!!
        }
        _HeartSearch = ImageVector.Builder(
            name = "HeartSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 14.9f)
                curveTo(19.7f, 14.2f, 20f, 13.4f, 20f, 12.5f)
                curveTo(20f, 10f, 18f, 8f, 15.5f, 8f)
                reflectiveCurveTo(11f, 10f, 11f, 12.5f)
                reflectiveCurveTo(13f, 17f, 15.5f, 17f)
                curveTo(16.4f, 17f, 17.2f, 16.7f, 17.9f, 16.3f)
                lineTo(20.8f, 19.2f)
                lineTo(22.2f, 17.8f)
                lineTo(19.3f, 14.9f)
                moveTo(15.5f, 15f)
                curveTo(14.1f, 15f, 13f, 13.9f, 13f, 12.5f)
                reflectiveCurveTo(14.1f, 10f, 15.5f, 10f)
                reflectiveCurveTo(18f, 11.1f, 18f, 12.5f)
                reflectiveCurveTo(16.9f, 15f, 15.5f, 15f)
                moveTo(14.7f, 18.9f)
                curveTo(14.3f, 19.3f, 13.9f, 19.6f, 13.5f, 20f)
                lineTo(12f, 21.3f)
                lineTo(10.5f, 20f)
                curveTo(5.4f, 15.4f, 2f, 12.3f, 2f, 8.5f)
                curveTo(2f, 5.4f, 4.4f, 3f, 7.5f, 3f)
                curveTo(9.2f, 3f, 10.9f, 3.8f, 12f, 5.1f)
                curveTo(13.1f, 3.8f, 14.8f, 3f, 16.5f, 3f)
                curveTo(19.6f, 3f, 22f, 5.4f, 22f, 8.5f)
                curveTo(22f, 9.2f, 21.9f, 9.8f, 21.7f, 10.5f)
                curveTo(20.8f, 7.9f, 18.4f, 6f, 15.5f, 6f)
                curveTo(11.9f, 6f, 9f, 8.9f, 9f, 12.5f)
                curveTo(9f, 15.8f, 11.5f, 18.5f, 14.7f, 18.9f)
                close()
            }
        }.build()

        return _HeartSearch!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSearch: ImageVector? = null
