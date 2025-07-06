package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadLightbulb: ImageVector
    get() {
        if (_HeadLightbulb != null) {
            return _HeadLightbulb!!
        }
        _HeadLightbulb = ImageVector.Builder(
            name = "HeadLightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(14f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(15.6f, 9.5f)
                curveTo(15.34f, 9.94f, 14.96f, 10.32f, 14.5f, 10.58f)
                verticalLineTo(12f)
                horizontalLineTo(11.5f)
                verticalLineTo(10.58f)
                curveTo(10.07f, 9.75f, 9.57f, 7.92f, 10.4f, 6.5f)
                reflectiveCurveTo(13.07f, 4.56f, 14.5f, 5.38f)
                reflectiveCurveTo(16.43f, 8.05f, 15.6f, 9.5f)
                close()
            }
        }.build()

        return _HeadLightbulb!!
    }

@Suppress("ObjectPropertyName")
private var _HeadLightbulb: ImageVector? = null
