package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SolarPower: ImageVector
    get() {
        if (_SolarPower != null) {
            return _SolarPower!!
        }
        _SolarPower = ImageVector.Builder(
            name = "SolarPower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.45f, 2f)
                verticalLineTo(5.55f)
                lineTo(15f, 3.77f)
                lineTo(11.45f, 2f)
                moveTo(10.45f, 8f)
                lineTo(8f, 10.46f)
                lineTo(11.75f, 11.71f)
                lineTo(10.45f, 8f)
                moveTo(2f, 11.45f)
                lineTo(3.77f, 15f)
                lineTo(5.55f, 11.45f)
                horizontalLineTo(2f)
                moveTo(10f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                curveTo(2.57f, 10.17f, 3.17f, 10.25f, 3.77f, 10.25f)
                curveTo(7.35f, 10.26f, 10.26f, 7.35f, 10.27f, 3.75f)
                curveTo(10.26f, 3.16f, 10.17f, 2.57f, 10f, 2f)
                moveTo(17f, 22f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                lineTo(19f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                lineTo(17f, 22f)
                close()
            }
        }.build()

        return _SolarPower!!
    }

@Suppress("ObjectPropertyName")
private var _SolarPower: ImageVector? = null
