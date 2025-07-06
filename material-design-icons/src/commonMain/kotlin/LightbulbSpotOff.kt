package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbSpotOff: ImageVector
    get() {
        if (_LightbulbSpotOff != null) {
            return _LightbulbSpotOff!!
        }
        _LightbulbSpotOff = ImageVector.Builder(
            name = "LightbulbSpotOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(15.11f, 17f)
                horizontalLineTo(9f)
                lineTo(9f, 14f)
                curveTo(6.5f, 12.57f, 4f, 11f, 4f, 6f)
                verticalLineTo(5.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(22f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(5.2f)
                lineTo(7.2f, 4f)
                horizontalLineTo(22f)
                moveTo(20f, 6f)
                horizontalLineTo(9.2f)
                lineTo(16.37f, 13.17f)
                curveTo(18.33f, 11.87f, 20f, 10.07f, 20f, 6f)
                moveTo(13f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(9f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                lineTo(9f, 22f)
                close()
            }
        }.build()

        return _LightbulbSpotOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbSpotOff: ImageVector? = null
