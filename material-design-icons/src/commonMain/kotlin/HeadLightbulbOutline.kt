package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadLightbulbOutline: ImageVector
    get() {
        if (_HeadLightbulbOutline != null) {
            return _HeadLightbulbOutline!!
        }
        _HeadLightbulbOutline = ImageVector.Builder(
            name = "HeadLightbulbOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.9f, 3f, 20f, 6.1f, 20f, 10f)
                curveTo(20f, 12.8f, 18.4f, 15.2f, 16f, 16.3f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.1f, 13f, 3.8f, 12.5f, 4.1f, 12.2f)
                lineTo(6f, 9.7f)
                curveTo(6.2f, 5.9f, 9.2f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.4f, 1f, 4.6f, 4.4f, 4.1f, 8.9f)
                lineTo(2.5f, 11f)
                curveTo(1.9f, 11.8f, 1.9f, 12.8f, 2.3f, 13.6f)
                curveTo(2.7f, 14.3f, 3.3f, 14.8f, 4f, 14.9f)
                verticalLineTo(16f)
                curveTo(4f, 17.9f, 5.3f, 19.4f, 7f, 19.9f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.8f, 22f, 13.1f, 22f, 10f)
                curveTo(22f, 5f, 18f, 1f, 13f, 1f)
                moveTo(14f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(15.6f, 9.5f)
                curveTo(15.3f, 9.9f, 15f, 10.3f, 14.5f, 10.6f)
                verticalLineTo(12f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.6f)
                curveTo(10.1f, 9.8f, 9.6f, 7.9f, 10.4f, 6.5f)
                reflectiveCurveTo(13.1f, 4.6f, 14.5f, 5.4f)
                reflectiveCurveTo(16.4f, 8.1f, 15.6f, 9.5f)
                close()
            }
        }.build()

        return _HeadLightbulbOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadLightbulbOutline: ImageVector? = null
