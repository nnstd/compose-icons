package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbSpot: ImageVector
    get() {
        if (_LightbulbSpot != null) {
            return _LightbulbSpot!!
        }
        _LightbulbSpot = ImageVector.Builder(
            name = "LightbulbSpot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                lineTo(9f, 19f)
                moveTo(13f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(2f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                moveTo(9f, 14f)
                lineTo(9f, 17f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                curveTo(17.5f, 12.57f, 20f, 11f, 20f, 6f)
                horizontalLineTo(4f)
                curveTo(4f, 11f, 6.5f, 12.57f, 9f, 14f)
                close()
            }
        }.build()

        return _LightbulbSpot!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbSpot: ImageVector? = null
