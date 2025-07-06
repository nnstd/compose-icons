package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketCh: ImageVector
    get() {
        if (_PowerSocketCh != null) {
            return _PowerSocketCh!!
        }
        _PowerSocketCh = ImageVector.Builder(
            name = "PowerSocketCh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 2f)
                horizontalLineTo(4.22f)
                curveTo(3f, 2f, 2f, 3f, 2f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(2f, 21f, 3f, 22f, 4.22f, 22f)
                horizontalLineTo(19.78f)
                curveTo(21f, 22f, 22f, 21f, 22f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(22f, 3f, 21f, 2f, 19.78f, 2f)
                moveTo(20f, 13f)
                lineTo(16.55f, 16.45f)
                curveTo(16.19f, 16.81f, 15.75f, 17f, 15.3f, 17f)
                horizontalLineTo(8.7f)
                curveTo(8.25f, 17f, 7.81f, 16.81f, 7.45f, 16.45f)
                lineTo(4f, 13f)
                curveTo(3.5f, 12.5f, 3.5f, 11.5f, 4f, 11f)
                lineTo(7.45f, 7.55f)
                curveTo(7.81f, 7.19f, 8.25f, 7f, 8.7f, 7f)
                horizontalLineTo(15.3f)
                curveTo(15.75f, 7f, 16.19f, 7.19f, 16.55f, 7.55f)
                lineTo(20f, 11f)
                curveTo(20.5f, 11.5f, 20.5f, 12.5f, 20f, 13f)
                moveTo(10.5f, 14f)
                curveTo(10.5f, 13.17f, 11.17f, 12.5f, 12f, 12.5f)
                reflectiveCurveTo(13.5f, 13.17f, 13.5f, 14f)
                reflectiveCurveTo(12.83f, 15.5f, 12f, 15.5f)
                reflectiveCurveTo(10.5f, 14.83f, 10.5f, 14f)
                moveTo(15.5f, 12f)
                curveTo(15.5f, 11.17f, 16.17f, 10.5f, 17f, 10.5f)
                reflectiveCurveTo(18.5f, 11.17f, 18.5f, 12f)
                reflectiveCurveTo(17.83f, 13.5f, 17f, 13.5f)
                reflectiveCurveTo(15.5f, 12.83f, 15.5f, 12f)
                moveTo(5.5f, 12f)
                curveTo(5.5f, 11.17f, 6.17f, 10.5f, 7f, 10.5f)
                reflectiveCurveTo(8.5f, 11.17f, 8.5f, 12f)
                reflectiveCurveTo(7.83f, 13.5f, 7f, 13.5f)
                reflectiveCurveTo(5.5f, 12.83f, 5.5f, 12f)
                close()
            }
        }.build()

        return _PowerSocketCh!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketCh: ImageVector? = null
