package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightFloodUp: ImageVector
    get() {
        if (_LightFloodUp != null) {
            return _LightFloodUp!!
        }
        _LightFloodUp = ImageVector.Builder(
            name = "LightFloodUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 15f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                curveTo(8.55f, 13f, 9f, 13.45f, 9f, 14f)
                curveTo(9f, 14.55f, 8.55f, 15f, 8f, 15f)
                moveTo(16.72f, 18.9f)
                lineTo(10.69f, 4.08f)
                lineTo(8.83f, 4.84f)
                lineTo(9.21f, 5.76f)
                lineTo(4.41f, 9.88f)
                lineTo(5.27f, 12f)
                horizontalLineTo(8f)
                curveTo(9.1f, 12f, 10f, 12.9f, 10f, 14f)
                reflectiveCurveTo(9.1f, 16f, 8f, 16f)
                horizontalLineTo(6.9f)
                lineTo(8.18f, 19.14f)
                lineTo(14.5f, 18.73f)
                lineTo(14.87f, 19.65f)
                lineTo(16.72f, 18.9f)
                moveTo(20.81f, 17.71f)
                lineTo(18.5f, 16.75f)
                lineTo(19.26f, 14.9f)
                lineTo(21.57f, 15.86f)
                lineTo(20.81f, 17.71f)
                moveTo(18.78f, 10.43f)
                lineTo(18f, 8.58f)
                lineTo(20.79f, 7.43f)
                lineTo(21.55f, 9.28f)
                lineTo(18.78f, 10.43f)
                moveTo(15.19f, 5.07f)
                lineTo(13.34f, 4.31f)
                lineTo(14.3f, 2f)
                lineTo(16.15f, 2.77f)
                lineTo(15.19f, 5.07f)
                close()
            }
        }.build()

        return _LightFloodUp!!
    }

@Suppress("ObjectPropertyName")
private var _LightFloodUp: ImageVector? = null
